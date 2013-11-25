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
//                    System.out.println("El elemento ya existe, no se volverá "
//                    				   + "a insertar.");
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
//            	System.out.println("El elemento ya existe, no se volverá " +
// 					   "a insertar.");
            }
            this.lenght++;
        }
    }

    public boolean insert(BinaryNode<K> pnode) {
        if (this.root != null){
        	BinaryTree<K> recursivetree = new BinaryTree<K>();
            
            //If is a integer
            if(pnode.getData().getClass().equals(Integer.class)){
            	
            	//Conditions of insert
            	if((Integer)pnode.getData() > (Integer)this.root.getData()){
	            	if(this.root.getRight() == null){
	            		this.root.setRight(pnode);
	            	}else {
	                    recursivetree.setRoot(this.root.getRight());
	                    insertNode(pnode, recursivetree);
	            	}
	                this.lenght++;
                }else if ((Integer)pnode.getData() < (Integer)this.root.getData()){
                	if(this.root.getLeft() == null){
                		this.root.setLeft(pnode);
                	}else {
                		recursivetree.setRoot(this.root.getLeft());
                        insertNode(pnode, recursivetree);
                	}
                    this.lenght++;
                }else {
//                    System.out.println("El elemento ya existe, no se volverá "
//                    				   + "a insertar.");
                    return false;
                }
            }
        	
        }else{
            this.root = pnode;
        }
                return true;
    }

    //AUX Add data
    private void insertNode(BinaryNode<K> pnode, BinaryTree<K> tree){

    	if(pnode.getData().getClass().equals(Integer.class)){
        
    		
    		if((Integer) pnode.getData() > (Integer) tree.root.getData()){
            	
            	if(tree.root.getRight() == null){
            		tree.root.setRight(pnode);
            	} else{
	                tree.root = tree.root.getRight();
	                insertNode(pnode, tree);
            	}
            	
            }else if ((Integer) pnode.getData() < (Integer) tree.root.getData()){
            	
            	if(tree.root.getLeft() == null){
            		tree.root.setLeft(pnode);
            	} else{
            		tree.root = tree.root.getLeft();
            		insertNode(pnode, tree);
            	}
            	
            }else{
//            	System.out.println("El elemento ya existe, no se volverá " +
// 					   "a insertar.");
            }
            this.lenght++;
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
    	BinaryNode<K> previous = search2(data);
    	try{
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
    	} catch(Exception e){}    	
    	
		return true;
    }
        
    private BinaryNode<K> search(K pk){

//		System.out.println("Aquitoy");
    	BinaryNode<K> current = this.root;
    	@SuppressWarnings("unused")
		BinaryNode<K> previous = new BinaryNode<K>();

    	
    	while(current.getData() != pk){
    		//Conditions of insert
        	if((Integer)pk > (Integer)current.getData() &&
        	   current.getRight() != null){
        		
    			previous = current;
        		current = current.getRight();
//	        	System.out.println("derecha");
    		}

    		if ((Integer)pk < (Integer)current.getData() && 
				current.getLeft() != null){
					
        		previous = current;
        		current = current.getLeft();
//        		System.out.println("izquierda");
    		}
    		
    		if(current.getLeft() == null && current.getRight() == null &&
    		   current.getData() != pk) {
    			
    			System.out.println("No fruit in this tree...");
    			break;
    		}
        }
    	
      //System.out.println(current.getData());
        return current;
    }
    
    private BinaryNode<K> search2(K pk){
//		System.out.println("Ahora aqui");
    	BinaryNode<K> current = this.root;
		BinaryNode<K> previous = new BinaryNode<K>();
        	
    	while(current.getData() != pk){
        	
    		//Conditions of insert
        	if((Integer)pk > (Integer)current.getData() &&
        	   current.getRight() != null){

    			previous = current;
        		current = current.getRight();
//	        	System.out.println("derecha");
	        		
    		}
        	
    		if ((Integer)pk < (Integer)current.getData() && 
				current.getLeft() != null){
					
        		previous = current;
        		current = current.getLeft();
//        		System.out.println("izquierda");
    		}
    		
    		if(current.getLeft() == null && current.getRight() == null &&
    		   current.getData() != pk) {
    			
//    			System.out.println("No fruit in this tree...");
    			break;
    		}
        }
    	
      //System.out.println(previous.getData());
        return previous;
    }
    
    private BinaryNode<K> smallerOfGreatests(BinaryNode<K> node){

    	@SuppressWarnings("unused")
		BinaryNode<K> previous = node;
    	//Gets greater numbers
    	BinaryNode<K> current = node.getRight();
    	BinaryTree<K> tree= new BinaryTree<K>();
    	
    	//Gets the node in question
    	if(current.getLeft() != null){
    		while(current.getLeft() != null){
    			previous = current;
        		current = node.getLeft();
    		}
    	}		
//		System.out.println(current.getData());
    	
    	//If that node has a right branch it is  inserted on the right branch 
    	//of the node to be deleted
    	if (current.getRight() != null){
    		tree.insert(current.getRight());
    	}
    	
    	current.setRight(node.getLeft());	
    	
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
    	if (this.root == null){
    		return false;
    	}
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
