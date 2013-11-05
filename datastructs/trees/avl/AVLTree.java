/*
 * AVLTree.java
 *
 * Copyright 2013 Anibal Alvarez <aaalvarez94@gmail.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */

package trees.avl;

/**
 * Creates the AVL Tree
 * @author jeukel, zyoruk
 *
 */
public class AVLTree {

    private AVLNode root;
    boolean aux = true;

    public AVLTree() {
        root = null;
    }

    public AVLTree(AVLNode root) {
        this.root = root;
    }

    /**
     * Checks if tree is empty
     * @param root
     * @return
     */
    public boolean isEmpty(AVLNode root) {
        return root == null;
    }

    /**
     * Adds the data and balances the tree.
     * @param data
     */
    void add(int data) {
        // If data is already in the tree, do nothing. If not , add and balance.
        if ((!exist(data, root))) {
            AVLNode info = new AVLNode(data);
            this.root = balanceInsert(getRoot(), info);
        } else {
            System.out.println("El elemento ya existe");
        }
    }

    /**
     * Method in charge of balancing the tree. It is private because the user
     * just have to call the "add" method and it then calls this one.
     * @param root
     * @param node
     * @return
     */
    private AVLNode balanceInsert(AVLNode root, AVLNode node) {
    	AVLNode node1;
    	AVLNode info = node;
    	if (isEmpty(root)) {
    		root = info;
    		aux = true;
    	} else {
    		if (node.data < root.data) {
    			root.left = balanceInsert(root.left, node);
    			if (aux) {
    				switch (root.balance) {
	    				case 1:
	    					root.balance = 0;
	    					aux = false;
	    					break;
	    				case 0:
	    					root.balance = -1;
	    					break;
	    					/*se reestructura ya que pasaria a valer -2 y
	    					se desequilibra a la izquierda*/
	    				case -1:
	    					node1 = root.left;
	    					if (node1.balance == -1) {
	    						root = leftLeftRotation(root, node1);
	    					} else {
	    						root = leftRightRotation(root, node1);
	    					}
	    					aux = false;
	    					break;
	    				}
    			}
    		} else {
    			if (node.data > root.data) {
    				root.right = balanceInsert(root.right, node);
    				if (aux) {
    					switch (root.balance) {
	    					case -1:
	    						root.balance = 0;
	    						aux = false;
	    						break;
	    					case 0:
	    						root.balance = 1;
	    						break;
	    						/*se reestructura ya que pasaria a valer 2 y 
	    						se desequilibra a la derecha*/
	    					case 1:
	    						node1 = root.right;
	    						if (node1.balance == 1) {
	    							root = rightRightRotation(root, node1);
	    						} else {
	    							root = rightLeftRotation(root, node1);
	    						}
	    						aux = false;
	    						break;
	    					}
    				}
    			}
    		}
    	}
    	return root;
    }

    /**
     * Checks if data is in the tree.
     * @param data
     * @param root
     * @return boolean
     */
    private boolean exist(int data, AVLNode root) {
    	AVLNode temp = root;
    	boolean exist = false;
    	while (temp != null) {
    		if (data == temp.data) {
    			exist = true;
    			return exist;
    		} else {
    			if (data > temp.data) {
    				temp = temp.right;
    			}else {
    				temp = temp.left;
    				if (temp == null) {
    					return exist;
    				}
    			}
    		}
    	}
    	return exist;
    }
    
    /**
     * Greatest of the lowest .
     * @param nodo
     * @return greatest left node
     */
    public AVLNode greaterThanUnder(AVLNode node) {
        AVLNode dad = node;
        AVLNode aux = node.left;
        try {
            while (aux.right != null) {
                dad = aux;
                aux = aux.right;
            }
            dad.right = aux.left;

        } catch (Exception e) {
        }
        return aux;
    }

    /**
     * Removes the node containing the specified data
     * @param data
     */
    void remove(int data) {
        if ((!exist(data, root))) {
            System.out.println("El elemento no existe");
        } else {
            delete(data);
        }
    }

    /**
     * Deletes the node containing the specified  data.
     * @param data
     */
    void delete(int data) {
    	if (data == getRoot().data && getRoot().right == null && 
    		getRoot().left == null){	
    		root = null;
    	} else {
    		AVLNode nodetoremover = nodeToRemove(data, getRoot());
    		System.out.println("Nodo a eliminar " + nodetoremover.data);
    		if (nodetoremover.data == data && nodetoremover.right == null &&
    			nodetoremover.left == null) {
    			System.out.println("Nodo eliminar " + getRoot().left.data);
    			root.left = null;
    		}
    		if (nodetoremover.left != null) {
    			AVLNode greaterthanunder = greaterThanUnder(nodetoremover);
    			System.out.println("el mayor de menores es " +
    								greaterthanunder.data);
    			if (greaterthanunder.data == data) {
    				System.out.println("Se eliminara el " +getRoot().left.data);
    				root.left = null;
    			}
    		} else {
    		}
    	}
    }

    /**
     * Returns the node we need to remove. Set as root.
     * @param data
     * @param pRoot
     * @return
     */
    private AVLNode nodeToRemove(int data, AVLNode pRoot) {
    	AVLNode root = pRoot;
    	while (data != root.data) {
    		if (data > root.data) {
    			root = root.right;
    		} else {
    			root = root.left;
    		}
    	}
    	return root;
    }

    /**
     * The tree is unbalanced. This is the Right - Left rotation
     * @param root
     * @param node1
     * @return
     */
    private AVLNode rightLeftRotation(AVLNode root, AVLNode pNode) {
    	AVLNode node = pNode.left;
    	root.right = node.left;
    	node.left = root;
    	pNode.left = node.right;
    	node.right = pNode;
    	if (node.balance == 1) {
    		root.balance = -1;
    	} else {
    		root.balance = 0;
    	}
    	if (node.balance == -1) {
    		pNode.balance = 1;
    	} else {
    		pNode.balance = 0;
    	}
    	node.balance = 0;
    	root = node;
    	return root;
    }

    /**
     * Left - Right Rotation when the tree is unbalanced.
     * @param root
     * @param node1
     * @return
     */
    private AVLNode leftRightRotation(AVLNode root, AVLNode pNode) {
    	AVLNode node = pNode.right;
    	root.left = node.right;
    	node.right = root;
    	pNode.right = node.left;
    	node.left = pNode;
    	if (node.balance == 1) {
    		pNode.balance = -1;
    	} else {
    		pNode.balance = 0;
    	}
    	if (node.balance == -1) {
    		root.balance = 1;
    	} else {
    		root.balance = 0;
    	}
    	node.balance = 0;
    	root = node;
    	return root;
    }

	/**
	 * Left - Left rotation
	 * @param root
	 * @param node1
	 * @return
	 */
    private AVLNode leftLeftRotation(AVLNode root, AVLNode pNode) {
        root.left = pNode.right;
        pNode.right = root;
        if (pNode.balance == -1) {

            root.balance = 0;
            pNode.balance = 0;
        } else {

            root.balance = -1;
            pNode.balance = 1;
        }
        root = pNode;
        return root;
    }
    
    /**
     * Right - Right Rotation
     * @param root
     * @param node1
     * @return
     */
    private AVLNode rightRightRotation(AVLNode root, AVLNode pNode) {
        root.right = pNode.left;
        pNode.left = root;
        if (pNode.balance == 1) {
            root.balance = 0;
            pNode.balance = 0;
        } else {
            root.balance = 1;
            pNode.balance = -1;
        }
        root = pNode;
        return root;
    }

    int size() {
        return AVLNode.size(getRoot());
    }

    /**
     * In order
     * Left - Root - Right
     */
    void inOrden() {
        inOrden(this.getRoot());
    }

    /**
     * Left - Root - Right. Evaluates right and left nodes aswell.
     * @param root
     */
    private void inOrden(AVLNode root) {
    	if (isEmpty(root) != false) {
    		inOrden(root.left);
    		String hex = Integer.toHexString(root.data);
    		System.out.print(hex+" -- ");
    		inOrden(root.right);
    	}
    }

    /**
     * PostOrder
     * Left - Right - Root.
     */
    void postOrden() {
        postOrden(this.getRoot());
    }

    /**
     * Left - Right - Root. Evaluates right and left nodes aswell.
     * @param root
     */
    private void postOrden(AVLNode root) {
    	if (isEmpty(root) != false) {
    		postOrden(root.left);
    		postOrden(root.right);
    		String hex = Integer.toHexString(root.data);
    		System.out.print(hex+" -- ");
    	}
    }

    /**
     * PreOrder
     * Root - Left - Right
     */
    void preOrden() {
        preOrden(this.getRoot());
    }

    /**
     * Root - Left -Right. Evaluates right and left nodes aswell.
     * @param root
     */
    private void preOrden(AVLNode root) {
    	if (isEmpty(root) != false) {
    		String hex = Integer.toHexString(root.data);
    		System.out.print(hex + " -- ");
    		preOrden(root.left);
    		preOrden(root.right);
    	}

    }
    
    /**
     * returns the root of the tree
     * @return
     */
    public AVLNode getRoot() {
        return root;
    }
}
