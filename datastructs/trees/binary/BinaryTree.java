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

import simplelist.SimpleList;
import interfaces.TreeInterface;

public class BinaryTree<K> implements TreeInterface<K>{
    protected BinaryNode<K> root;
    private int lenght;
    private SimpleList<K> list;

    public BinaryTree(){
    	this.list = new SimpleList<K>();
        this.root = null;
        this.lenght = 0;
    }

    public BinaryTree(BinaryNode<K> proot){
    	this.list = new SimpleList<K>();
        this.root = proot;
        this.lenght = 1;
    }

    public void setRoot(BinaryNode<K> proot){
            this.root = proot;
    }

        //Adds node to tree. Append as the insert is placed at the end.
        @Override
    public boolean insert(K data) {
                if (this.root == null){
            BinaryNode<K> node = new BinaryNode<K>(data);
            this.root = node;
        }else{
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
            	
            	if(tree.root.getRight() == null){
            		tree.root.setRight(data);
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
            System.out.println("El elemento no se enuentra en el arbol");
            return false;
        }else{
            BinaryTree<K> temp = this;
            if(data.getClass().equals(Integer.class)){
                    if(data == this.root.getData()){
                    temp.root = waysToDelete(temp);
                }else if ((Integer) data < (Integer) temp.root.getData()){
                    temp.root = temp.root.getLeft();
                    this.root.setLeft(deleteNode(data, temp));
                    this.lenght--;
                }else{
                    temp.root = temp.root.getRight();
                    this.root.setRight(deleteNode(data, temp));
                    this.lenght--;
                }
            }
        }
        return true;
        }

    //AUX deleteNode
    private BinaryNode<K> deleteNode(K data, BinaryTree<K> temp) {
        if (temp == null){
            System.out.println("El arbol se encuentra vacío");
        }else{
                if(data.getClass().equals(Integer.class)){
                        if(data == temp.root.getData()){
                    temp.root = waysToDelete(temp);
                }else if ((Integer)data < (Integer)this.root.getData()){
                    temp.root = temp.root.getLeft();
                    deleteNode(data, temp);
                }else{
                    temp.root = temp.root.getRight();
                    deleteNode(data, temp);
                }
                }
        }
        return temp.root;
    }

    //Return new tree after deletion.
    private BinaryNode<K> waysToDelete(BinaryTree<K> tree){
        BinaryTree<K> temp = new BinaryTree<K>();;
        if (tree.root.getLeft() != null && tree.root.getRight() != null){
            temp.root = reArrange(tree);
        }else if (tree.root.getLeft() == null && tree.root.getRight() != null){
            temp.root = tree.root.getRight();
        }else if (tree.root.getLeft() != null && tree.root.getRight() == null){
            temp.root = tree.root.getLeft();
        }else{
            temp.root = null;
        }
        return temp.root;
    }

    private BinaryNode<K> reArrange(BinaryTree<K> TREE){
        BinaryTree<K> temp = new BinaryTree<K>(); //Arbol para la busqueda
        BinaryTree<K> tree = new BinaryTree<K>(); //Nuevo arbol

        tree.setRoot(TREE.getRoot().getLeft());
        temp.root = TREE.getRoot().getLeft();

        while(temp.root.getRight() != null){
            temp.root = temp.root.getLeft();
        }
        temp.root.setRight(TREE.getRoot().getRight());
        return tree.root;
    }

    public boolean setEmpty(){
        this.root = null;
        return true;
    }

        //**********************************************************************//

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
                // TODO Auto-generated method stub
                return false;
        }

        //**********************************************************************//
    /*
         * How to goes through the tree made by an exit.
         */
        public void preorden (){
        	list.append(this.root.getData());
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

//        	System.out.println(pnode.getData());
            list.append(pnode.getData());
            if (pnode.getLeft() != null){
            	preorden_extended(this.root.getLeft());
            }
            if (pnode.getRight() != null){
            	preorden_extended(this.root.getRight());
            }
        }

        @Override
        public String describe() {
            this.preorden();
            return ("That's it");
        }

}
