package listgenerator;

public class DataStructureChoose {
	private String _datastructureKind;
	private int _quantity;
	private NumGenerator generator = new NumGenerator();
	public DataStructureChoose(String pkindoflist , int pQuantity){
		this._datastructureKind = pkindoflist;
		this._quantity= pQuantity;
		
	}
	public void createDataStructure(){
		if (this._datastructureKind == "DoubleList"){
			DoubleListCreator myNewDoubleList = new DoubleListCreator();
			myNewDoubleList.DLcreator(generator.generate(this._quantity));
			
		}else if(this._datastructureKind == "SimpleList"){
			SimpleListCreator myNewDoubleList = new SimpleListCreator();
			myNewDoubleList.SLcreator(generator.generate(this._quantity));
			
		}else if(this._datastructureKind == "SimpleCircularList"){
			SimpleCircularListCreator myNewDoubleList = new SimpleCircularListCreator();
			myNewDoubleList.SCLcreator(generator.generate(this._quantity));
			
		}else if(this._datastructureKind == "DoubleCircularList"){
			DoubleCircularListCreator myNewDoubleList = new DoubleCircularListCreator();
			myNewDoubleList.DCLcreator(generator.generate(this._quantity));
			
		}else if(this._datastructureKind == "Queue"){
			QueueCreator myNewDoubleList = new QueueCreator();
			myNewDoubleList.Qcreator(generator.generate(this._quantity));
			
		}else if(this._datastructureKind == "Stack"){
			StackCreator myNewDoubleList = new StackCreator();
			myNewDoubleList.Screator(generator.generate(this._quantity));
		}
			
	}
}
