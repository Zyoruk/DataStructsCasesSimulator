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
	
	public DataStructureChoose(String pkindoflist , int pQuantity){
		_datastructureKind = pkindoflist;
		_quantity= pQuantity;
		generator= new NumGenerator();
		myNewDataStructure = null;
	}

	public  DataStructure<Integer> createDataStructure(){

		if (this._datastructureKind == "DoubleList"){
			myNewDataStructure = (DoubleList<Integer>) myNewDataStructure;
			myNewDataStructure = generator.generateDoubleList(_quantity);		
			
		}else if(this._datastructureKind == "SimpleList"){
			myNewDataStructure = (SimpleList<Integer>) myNewDataStructure ;
			myNewDataStructure = generator.generateSimpleList(_quantity);
			
		}else if(this._datastructureKind == "SimpleCircularList"){
			myNewDataStructure = (SimpleCircularList<Integer>) myNewDataStructure ;
			myNewDataStructure = generator.generateSimpleCircularList(_quantity);			

		}else if(this._datastructureKind == "DoubleCircularList"){
			myNewDataStructure = (DoubleCircularList<Integer>) myNewDataStructure;
			myNewDataStructure= generator.generateDoubleCircularList(_quantity);

		}else if(this._datastructureKind == "QueueWithArray"){
			myNewDataStructure= generator.generateQueueWithArray(_quantity);
			System.out.println(":@");
			myNewDataStructure = (QueueWithArray<Integer>) myNewDataStructure;
			
		}else if(this._datastructureKind == "QueueWithList"){
			myNewDataStructure = (QueueWithList<Integer>) myNewDataStructure; 
			myNewDataStructure = generator.generateQueueWithList(_quantity);
			
		}else if(this._datastructureKind == "StackWithArray"){
			myNewDataStructure = (StackWithArray<Integer>) myNewDataStructure;
			myNewDataStructure= generator.generateStackWithArray(_quantity);
			
		}else if(this._datastructureKind == "StackWithList"){
			myNewDataStructure = (StackWithList<Integer>) myNewDataStructure; 
			myNewDataStructure = generator.generateStackWithList(_quantity);
			
			
		}else if(this._datastructureKind == "PriorityQueue"){
			myNewDataStructure = (PriorityQueue<Integer>) myNewDataStructure;
			myNewDataStructure = generator.generatePriorityQueue(_quantity);
			
		}else if(this._datastructureKind == "BiQueueWithList"){
			myNewDataStructure = (BiQueueWithList<Integer>) myNewDataStructure;
			myNewDataStructure = generator.generateBiQueueWithList(_quantity);
			
//		}else if(this._datastructureKind == "BiQueueWithArray"){
//			BiQueueWithList<Integer> myNewDataStructure = generator.generateBiQueueWithList(_quantity);
//			
		}else if(this._datastructureKind == "Array"){
			myNewDataStructure = (Array<Integer>) myNewDataStructure;
			myNewDataStructure = generator.generateArray(_quantity);
			
		}else if(this._datastructureKind == "AVLTree"){
			myNewDataStructure = (AVLTree<Integer>) myNewDataStructure;
			myNewDataStructure = generator.generateAVLTree(_quantity);
			
		}else if(this._datastructureKind == "BinaryTree"){
			myNewDataStructure = (BinaryTree<Integer>) myNewDataStructure;
			myNewDataStructure = generator.generateBinaryTree(_quantity);
			
		}else if(this._datastructureKind == "SplayTree"){
			myNewDataStructure = (SplayTree<Integer>) myNewDataStructure;
			myNewDataStructure = generator.generateSplayTree(_quantity);
		
		}
		
		return myNewDataStructure;

	}
	public String getStructureKind(){
		return this._datastructureKind;
	}

}
