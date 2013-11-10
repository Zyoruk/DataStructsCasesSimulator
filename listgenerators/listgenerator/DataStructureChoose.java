package listgenerator;

import queue.QueueWithArray;
import queue.QueueWithList;
import simplelist.SimpleCircularList;
import simplelist.SimpleList;
import stack.StackWithArray;
import stack.StackWithList;
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
			
			
//		}else if(this._datastructureKind == "PriorityQueue"){
//			PrioriryQueue<Integer> myNewDataStructure = generator.generatePrioriryQueue(_quantity);
			
//		}else if(this._datastructureKind == "BiQueueWithList"){
//			BiQueue<Integer> myNewDataStructure = generator.generateBiQueue(_quantity);
			
//		}else if(this._datastructureKind == "BiQueueWithArray"){
//			BiQueue<Integer> myNewDataStructure = generator.generateBiQueue(_quantity);
			
//		}else if(this._datastructureKind == "Array"){
//			ArrayList<Integer> myNewDataStructure = generator.generateArray(_quantity);
		
		}
		
		return myNewDataStructure;

	}
	public String getStructureKind(){
		return this._datastructureKind;
	}

}
