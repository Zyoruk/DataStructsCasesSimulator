package listgenerator;

import interfaces.ListInterface;



public class DataStructureChoose {
	private String _datastructureKind;
	private int _quantity;
	private NumGenerator generator = new NumGenerator();
	private ListInterface<Integer> myNewDataStructure;

	public DataStructureChoose(String pkindoflist , int pQuantity){
		this._datastructureKind = pkindoflist;
		this._quantity= pQuantity;
	}

	public  void createDataStructure(){
		
		if (this._datastructureKind == "DoubleList"){
			DoubleListCreator myNewDataStruct = new DoubleListCreator();
			myNewDataStruct.creator(generator.generate(this._quantity));
			this.myNewDataStructure =  myNewDataStruct;

		}else if(this._datastructureKind == "SimpleList"){
			SimpleListCreator myNewDataStruct = new SimpleListCreator();
			myNewDataStruct.creator(generator.generate(this._quantity));

		}else if(this._datastructureKind == "SimpleCircularList"){
			SimpleCircularListCreator myNewDataStruct = new SimpleCircularListCreator();
			myNewDataStruct.creator(generator.generate(this._quantity));
			

		}else if(this._datastructureKind == "DoubleCircularList"){
			DoubleCircularListCreator myNewDataStruct = new DoubleCircularListCreator();
			myNewDataStruct.creator(generator.generate(this._quantity));
			

		}else if(this._datastructureKind == "Queue"){
			QueueCreator myNewDataStruct = new QueueCreator();
			myNewDataStruct.creator(generator.generate(this._quantity));
			

		}else if(this._datastructureKind == "Stack"){
			StackCreator myNewDataStruct = new StackCreator();
			myNewDataStruct.creator(generator.generate(this._quantity));
			
		}


	}


}
