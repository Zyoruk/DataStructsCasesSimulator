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
			start = System.nanoTime();
			myNewDataStructure = (DoubleList<Integer>) myNewDataStructure;
			end = System.nanoTime();
			System.out.println("creating the double list lasted: " + (end - start) + "nano seconds");
			myNewDataStructure = generator.generateDoubleList(_quantity);		
			
		}else if(this._datastructureKind == "SimpleList"){
			myNewDataStructure = null;
			start = System.nanoTime();
			myNewDataStructure = (SimpleList<Integer>) myNewDataStructure ;
			end = System.nanoTime();
			System.out.println("creating the simple list lasted: " + (end - start) + "nano seconds");
			myNewDataStructure = generator.generateSimpleList(_quantity);
			
		}else if(this._datastructureKind == "SimpleCircularList"){
			myNewDataStructure = null;
			start = System.nanoTime();
			myNewDataStructure = (SimpleCircularList<Integer>) myNewDataStructure ;
			end = System.nanoTime();
			System.out.println("creating the simple circular list lasted: " + (end - start) + "nano seconds");
			myNewDataStructure = generator.generateSimpleCircularList(_quantity);			

		}else if(this._datastructureKind == "DoubleCircularList"){
			myNewDataStructure = null;
			start = System.nanoTime();
			myNewDataStructure = (DoubleCircularList<Integer>) myNewDataStructure;
			end = System.nanoTime();
			System.out.println("creating the double circular list lasted: " + (end - start) + "nano seconds");
			myNewDataStructure= generator.generateDoubleCircularList(_quantity);

		}else if(this._datastructureKind == "QueueWithArray"){
			myNewDataStructure = null;
			start = System.nanoTime();
			myNewDataStructure= generator.generateQueueWithArray(_quantity);
			end = System.nanoTime();
			System.out.println("creating the queue with array lasted: " + (end - start) + "nano seconds");
			myNewDataStructure = (QueueWithArray<Integer>) myNewDataStructure;
			
		}else if(this._datastructureKind == "QueueWithList"){
			myNewDataStructure = null;
			start = System.nanoTime();
			myNewDataStructure = (QueueWithList<Integer>) myNewDataStructure; 
			end = System.nanoTime();
			System.out.println("creating the queue with list lasted: " + (end - start) + "nano seconds");
			myNewDataStructure = generator.generateQueueWithList(_quantity);
			
		}else if(this._datastructureKind == "StackWithArray"){
			myNewDataStructure = null;
			start = System.nanoTime();
			myNewDataStructure = (StackWithArray<Integer>) myNewDataStructure;
			end = System.nanoTime();
			System.out.println("creating the stack with array lasted: " + (end - start) + "nano seconds");
			myNewDataStructure= generator.generateStackWithArray(_quantity);
			
		}else if(this._datastructureKind == "StackWithList"){
			myNewDataStructure = null;
			start = System.nanoTime();
			myNewDataStructure = (StackWithList<Integer>) myNewDataStructure; 
			
			end = System.nanoTime();
			System.out.println("creating the stack with list lasted: " + (end - start) + "nano seconds");
			myNewDataStructure = generator.generateStackWithList(_quantity);
			
			
		}else if(this._datastructureKind == "PriorityQueue"){
			myNewDataStructure = null;
			start = System.nanoTime();
			myNewDataStructure = (PriorityQueue<Integer>) myNewDataStructure;
			end = System.nanoTime();
			System.out.println("creating the priority queue lasted: " + (end - start) + "nano seconds");
			myNewDataStructure = generator.generatePriorityQueue(_quantity);
			
		}else if(this._datastructureKind == "BiQueueWithList"){
			myNewDataStructure = null;
			start = System.nanoTime();
			myNewDataStructure = (BiQueueWithList<Integer>) myNewDataStructure;
			end = System.nanoTime();
			System.out.println("creating the biqueue with list lasted: " + (end - start) + "nano seconds");
			myNewDataStructure = generator.generateBiQueueWithList(_quantity);
			
//		}else if(this._datastructureKind == "BiQueueWithArray"){
//			BiQueueWithList<Integer> myNewDataStructure = generator.generateBiQueueWithList(_quantity);
//			
		}else if(this._datastructureKind == "Array"){
			myNewDataStructure = null;
			start = System.nanoTime();
			myNewDataStructure = (Array<Integer>) myNewDataStructure;
			end = System.nanoTime();
			System.out.println("creating the array lasted: " + (end - start) + "nano seconds");
			myNewDataStructure = generator.generateArray(_quantity);
			
		}else if(this._datastructureKind == "AVLTree"){
			myNewDataStructure = null;
			start = System.nanoTime();
			myNewDataStructure = (AVLTree<Integer>) myNewDataStructure;
			
			end = System.nanoTime();
			System.out.println("creating the AVL lasted: " + (end - start) + "nano seconds");
			myNewDataStructure = generator.generateAVLTree(_quantity);
			
		}else if(this._datastructureKind == "BinaryTree"){
			myNewDataStructure = null;
			start = System.nanoTime();
			myNewDataStructure = (BinaryTree<Integer>) myNewDataStructure;
			end = System.nanoTime();
			System.out.println("creating the Binary tree lasted: " + (end - start) + "nano seconds");
			myNewDataStructure = generator.generateBinaryTree(_quantity);
			
		}else if(this._datastructureKind == "SplayTree"){
			myNewDataStructure = null;
			start = System.nanoTime();
			myNewDataStructure = (SplayTree<Integer>) myNewDataStructure;
			end = System.nanoTime();
			System.out.println("creating the splay tree lasted: " + (end - start) + "nano seconds");
			myNewDataStructure = generator.generateSplayTree(_quantity);
		
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
