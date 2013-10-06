package listgenerator;

import serializing.Queue;
import serializing.Stack;
import simplelist.SimpleCircularList;
import simplelist.SimpleList;
import doublelist.DoubleCircularList;
import doublelist.DoubleList;
import interfaces.ListInterface;



public class DataStructureChoose {
	private String _datastructureKind;
	private int _quantity;
	private NumGenerator generator = new NumGenerator();
	ListInterface<Integer> myNewDataStructure = null;
	
	public DataStructureChoose(String pkindoflist , int pQuantity){
		this._datastructureKind = pkindoflist;
		this._quantity= pQuantity;
	}

	public  ListInterface<Integer> createDataStructure(){

		if (this._datastructureKind == "DoubleList"){
			DoubleListCreator temp = new DoubleListCreator();
			myNewDataStructure = (DoubleList<Integer>) myNewDataStructure;
			myNewDataStructure  = temp.creator(generator.generate(this._quantity));

		}else if(this._datastructureKind == "SimpleList"){
			SimpleListCreator temp = new SimpleListCreator();
			myNewDataStructure = (SimpleList<Integer>) myNewDataStructure;
			myNewDataStructure  = temp.creator(generator.generate(this._quantity));
		}else if(this._datastructureKind == "SimpleCircularList"){
			SimpleCircularListCreator temp = new SimpleCircularListCreator();
			myNewDataStructure = (SimpleCircularList<Integer>) myNewDataStructure;
			myNewDataStructure  = temp.creator(generator.generate(this._quantity));
			

		}else if(this._datastructureKind == "DoubleCircularList"){
			DoubleCircularListCreator temp = new DoubleCircularListCreator();
			myNewDataStructure = (DoubleCircularList<Integer>) myNewDataStructure;
			myNewDataStructure  = temp.creator(generator.generate(this._quantity));
			

		}else if(this._datastructureKind == "Queue"){
			QueueCreator temp = new QueueCreator();
			myNewDataStructure = (Queue<Integer>) myNewDataStructure;
			myNewDataStructure  = temp.creator(generator.generate(this._quantity));
			

		}else if(this._datastructureKind == "Stack"){
			StackCreator temp = new StackCreator();
			myNewDataStructure = (Stack<Integer>) myNewDataStructure;
			myNewDataStructure  = temp.creator(generator.generate(this._quantity));			
		}
		
		return myNewDataStructure;

	}
	
	public void describe(){
		
	}


}
