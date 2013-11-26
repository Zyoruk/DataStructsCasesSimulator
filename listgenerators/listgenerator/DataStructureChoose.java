package listgenerator;

import array.Array;
import queue.BiQueueWithList;
import queue.PriorityQueue;
import queue.QueueWithArray;
import queue.QueueWithList;
import simplelist.SimpleCircularList;
import simplelist.SimpleList;
import stack.StackWithArray;
import stack.StackWithList;
import trees.avl.AVLTree;
import trees.binary.BinaryTree;
import trees.splay.SplayTree;
import doublelist.DoubleCircularList;
import doublelist.DoubleList;
import interfaces.DataStructure;



public class DataStructureChoose {
	private String _datastructureKind;
	private int _quantity;
	private NumGenerator generator;
	DataStructure<Integer> myNewDataStructure ;
	private long start;
	private long end;
	
	public DataStructureChoose(String pkindoflist , int pQuantity){
		_datastructureKind = pkindoflist;
		_quantity= pQuantity;
		generator= new NumGenerator();
	}

	public  DataStructure<Integer> createDataStructure(){

		if (this._datastructureKind == "DoubleList"){
			myNewDataStructure = null;
			myNewDataStructure = (DoubleList<Integer>) myNewDataStructure;
			start = System.nanoTime();
			myNewDataStructure = generator.generateDoubleList(_quantity);	
			end = System.nanoTime();
			System.out.println("creating the double list lasted: " + (end - start) + "nano seconds");
			
		}else if(this._datastructureKind == "SimpleList"){
			myNewDataStructure = null;
			myNewDataStructure = (SimpleList<Integer>) myNewDataStructure ;
			start = System.nanoTime();
			myNewDataStructure = generator.generateSimpleList(_quantity);
			end = System.nanoTime();
			System.out.println("creating the simple list lasted: " + (end - start) + "nano seconds");
			
		}else if(this._datastructureKind == "SimpleCircularList"){
			myNewDataStructure = null;
			myNewDataStructure = (SimpleCircularList<Integer>) myNewDataStructure ;
			start = System.nanoTime();
			myNewDataStructure = generator.generateSimpleCircularList(_quantity);	
			end = System.nanoTime();
			System.out.println("creating the simple circular list lasted: " + (end - start) + "nano seconds");

		}else if(this._datastructureKind == "DoubleCircularList"){
			myNewDataStructure = null;
			myNewDataStructure = (DoubleCircularList<Integer>) myNewDataStructure;			
			start = System.nanoTime();
			myNewDataStructure= generator.generateDoubleCircularList(_quantity);
			end = System.nanoTime();
			System.out.println("creating the double circular list lasted: " + (end - start) + "nano seconds");
			

		}else if(this._datastructureKind == "QueueWithArray"){
			myNewDataStructure = null;
			myNewDataStructure = (QueueWithArray<Integer>) myNewDataStructure;			
			start = System.nanoTime();
			myNewDataStructure= generator.generateQueueWithArray(_quantity);
			end = System.nanoTime();
			System.out.println("creating the queue with array lasted: " + (end - start) + "nano seconds");
			
		}else if(this._datastructureKind == "QueueWithList"){
			myNewDataStructure = null;
			myNewDataStructure = (QueueWithList<Integer>) myNewDataStructure;			
			start = System.nanoTime();
			myNewDataStructure= generator.generateQueueWithList(_quantity);
			end = System.nanoTime();
			System.out.println("creating the QueueWithList lasted: " + (end - start) + "nano seconds");
			
		}else if(this._datastructureKind == "StackWithArray"){
			myNewDataStructure = null;
			myNewDataStructure = (StackWithArray<Integer>) myNewDataStructure;			
			start = System.nanoTime();
			myNewDataStructure= generator.generateStackWithArray(_quantity);
			end = System.nanoTime();
			System.out.println("creating the StackWithArray lasted: " + (end - start) + "nano seconds");
			
		}else if(this._datastructureKind == "StackWithList"){
			myNewDataStructure = null;
			myNewDataStructure = (StackWithList<Integer>) myNewDataStructure;			
			start = System.nanoTime();
			myNewDataStructure= generator.generateStackWithList(_quantity);
			end = System.nanoTime();
			System.out.println("creating the StackWithList lasted: " + (end - start) + "nano seconds");
			
			
		}else if(this._datastructureKind == "PriorityQueue"){
			myNewDataStructure = null;
			myNewDataStructure = (PriorityQueue<Integer>) myNewDataStructure;			
			start = System.nanoTime();
			myNewDataStructure= generator.generatePriorityQueue(_quantity);
			end = System.nanoTime();
			System.out.println("creating the PriorityQueue  lasted: " + (end - start) + "nano seconds");
			
		}else if(this._datastructureKind == "BiQueueWithList"){
			myNewDataStructure = null;
			myNewDataStructure = (BiQueueWithList<Integer>) myNewDataStructure;			
			start = System.nanoTime();
			myNewDataStructure= generator.generateBiQueueWithList(_quantity);
			end = System.nanoTime();
			System.out.println("creating the BiQueueWithList  lasted: " + (end - start) + "nano seconds");

		}else if(this._datastructureKind == "Array"){
			myNewDataStructure = null;
			myNewDataStructure = (Array<Integer>) myNewDataStructure;			
			start = System.nanoTime();
			myNewDataStructure= generator.generateArray(_quantity);
			end = System.nanoTime();
			System.out.println("creating the Array  lasted: " + (end - start) + "nano seconds");
			
		}else if(this._datastructureKind == "AVLTree"){
			myNewDataStructure = null;
			myNewDataStructure = (AVLTree<Integer>) myNewDataStructure;			
			start = System.nanoTime();
			myNewDataStructure= generator.generateAVLTree(_quantity);
			end = System.nanoTime();
			System.out.println("creating the AVLTreelasted: " + (end - start) + "nano seconds");
			
		}else if(this._datastructureKind == "BinaryTree"){
			myNewDataStructure = null;
			myNewDataStructure = (BinaryTree<Integer>) myNewDataStructure;			
			start = System.nanoTime();
			myNewDataStructure= generator.generateBinaryTree(_quantity);
			end = System.nanoTime();
			System.out.println("creating the BinaryTree  lasted: " + (end - start) + "nano seconds");
			
			
		}else if(this._datastructureKind == "SplayTree"){
			myNewDataStructure = null;
			myNewDataStructure = (SplayTree<Integer>) myNewDataStructure;			
			start = System.nanoTime();
			myNewDataStructure= generator.generateSplayTree(_quantity);
			end = System.nanoTime();
			System.out.println("creating the SplayTree  lasted: " + (end - start) + "nano seconds");
		
		}
		
		return myNewDataStructure;

	}
	public String getStructureKind(){
		return this._datastructureKind;
	}
	
	public void setStructKind(String choosing){
		this._datastructureKind = choosing;
	}

}
