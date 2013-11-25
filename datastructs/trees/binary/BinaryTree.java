/*
* BinaryTree.java
*
* This program is free software; you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation; either version 2 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, write to the Free Software
* Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
* MA 02110-1301, USA.
*
*
*/

package trees.binary;

import interfaces.TreeInterface;

public class BinaryTree<K> implements TreeInterface<K>{
    protected BinaryNode<K> root;
    private int lenght;

    public BinaryTree(){
        this.root = null;
        this.lenght = 0;
    }

    public BinaryTree(BinaryNode<K> proot){
        this.root = proot;
        this.lenght = 1;
    }

    public void setRoot(BinaryNode<K> proot){
            this.root = proot;
    }

        //Adds node to tree. Append as the insert is placed at the end.
        @Override
    public boolean insert(K data) {
        if (this.root != null){
        	BinaryTree<K> recursivetree = new BinaryTree<K>();
            
            //If is a integer
            if(data.getClass().equals(Integer.class)){
            	
            	//Conditions of insert
            	if((Integer)data > (Integer)this.root.getData()){
	            	if(this.root.getRight() == null){
	            		this.root.setRight(data);
	            	}else {
	                    recursivetree.setRoot(this.root.getRight());
	                    insertNode(data, recursivetree);
	            	}
	                this.lenght++;
                }else if ((Integer)data < (Integer)this.root.getData()){
                	if(this.root.getLeft() == null){
                		this.root.setLeft(data);
                	}else {
                		recursivetree.setRoot(this.root.getLeft());
                        insertNode(data, recursivetree);
                	}
                    this.lenght++;
                }else {
                    System.out.println("El elemento ya existe, no se volverá "
                    				   + "a insertar.");
                    return false;
                }
            }
        	
        }else{
        	BinaryNode<K> node = new BinaryNode<K>(data);
            this.root = node;
        }
                return true;
    }

    //AUX Add data
    private void insertNode(K data, BinaryTree<K> tree){
        if(data.getClass().equals(Integer.class)){
            if((Integer) data > (Integer) tree.root.getData()){
            	
            	if(tree.root.getRight() == null){
            		tree.root.setRight(data);
            	} else{
	                tree.root = tree.root.getRight();
	                insertNode(data, tree);
            	}
            	
            }else if ((Integer) data < (Integer) tree.root.getData()){
            	
            	if(tree.root.getLeft() == null){
            		tree.root.setLeft(data);
            	} else{
            		tree.root = tree.root.getLeft();
            		insertNode(data, tree);
            	}
            	
            }else{
            	System.out.println("El elemento ya existe, no se volverá " +
 					   "a insertar.");
            }
        }
    }

    //Goes thru tree and delete node accordin' to childs.
    @Override
    public boolean delete (K data) {
    	
    	if (this.root == null){
            System.out.println("El elemento no se encuentra en el arbol");
            return false;
        }
    	
    	BinaryNode<K> current = search(data);
    	BinaryNode<K> previous = search(data);
    	
    	if (previous.getLeft().getData() == data){
    		
    		if (current.getLeft() != null && current.getRight() != null){
                previous.setLeft(this.smallerOfGreatests(current));
            
            }else if (current.getLeft() == null && 
            		  current.getRight() != null){
            	
                previous.setLeft(current.getRight());
            
            }else if (current.getLeft() != null && 
            		current.getRight() == null){
            	
            	previous.setLeft(current.getLeft());
            
            }else{
            	previous.setLeft();
            }
    		
    	} else {
    		
    		if (current.getLeft() != null && current.getRight() != null){
                previous.setRight(this.smallerOfGreatests(current));
            
            }else if (current.getLeft() == null && current.getRight() != null){
                previous.setRight(current.getRight());
            
            }else if (current.getLeft() != null && current.getRight() == null){
                previous.setRight(current.getLeft());
            
            }else{
                previous.setRight();
            }
    	}
    	
		return true;
    }
        
    public BinaryNode<K> search(K pk){
    	BinaryNode<K> current = this.root;
    	@SuppressWarnings("unused")
		BinaryNode<K> previous = new BinaryNode<K>();
    	
    	//If is a integer
        if(pk.equals(Integer.class)){
        	
        	while(current.getData() != pk){
        	
	        	//Conditions of insert
	        	if((Integer)pk > (Integer)this.root.getData()){
	        		previous = current;
	        		current = this.root.getRight();
	        	} else if ((Integer)pk < (Integer)this.root.getData()){
	        		previous = current;
	        		current = this.root.getLeft();
	            } else {
	            	return current;
	            }
        	}
        }
        return current;
    }
    
    public BinaryNode<K> search2(K pk){
    	BinaryNode<K> current = this.root;
    	BinaryNode<K> previous = new BinaryNode<K>();
    	
    	//If is a integer
        if(pk.equals(Integer.class)){
        	
        	while(current.getData() != pk){
        	
	        	//Conditions of insert
	        	if((Integer)pk > (Integer)this.root.getData()){
	        		previous = current;
	        		current = this.root.getRight();
	        	}
	            
	        	if ((Integer)pk < (Integer)this.root.getData()){
	        		previous = current;
	        		current = this.root.getLeft();
	            }
        	}
        }
        return previous;
    }
    
    private BinaryNode<K> smallerOfGreatests(BinaryNode<K> node){
    	BinaryNode<K> previous = node;
    	BinaryNode<K> current = node.getRight();
    	
    	if(current.getLeft() != null){
    		while(current.getLeft() != null){
    			previous = current;
        		current = this.root.getLeft();
    		}
    	}
    	if (current.getRight() != null){
    		previous.setLeft(current.getRight());
    	}
        return current;
    }

    //**********************************************************************//
    
    public boolean setEmpty(){
        this.root = null;
        return true;
    }

    public BinaryNode<K> getRoot(){
        return root;
    }

    @Override
    public int length() {
        return lenght;
    }

    @Override
    public boolean isEmpty() {
        return this.getRoot() == null;
    }

    @Override
    public boolean exists(K pk) {
    	BinaryNode<K> node = search(pk);
    	return (node.getData() == pk);
    		
    }

    //**********************************************************************//
    
    /*
     * How to goes through the tree made by an exit.
     */
    public void preorden (){
    	//list.append(this.root.getData());
    	System.out.println(this.root.getData());
        if (this.root.getLeft() != null){
        	preorden_extended(this.root.getLeft());
        }
        if (this.root.getRight() != null){
        	preorden_extended(this.root.getRight());
        }
    }

    /*
     * Extended method for going though the exit.
     */
    private void preorden_extended(BinaryNode<K> pnode){

    	System.out.println(pnode.getData());
        //list.append(pnode.getData());
        if (pnode.getLeft() != null){
        	preorden_extended(pnode.getLeft());
        }
        if (pnode.getRight() != null){
        	preorden_extended(pnode.getRight());
        }
    }

    @Override
    public String describe() {
        this.preorden();
		return("Done bitch");
    }
}
