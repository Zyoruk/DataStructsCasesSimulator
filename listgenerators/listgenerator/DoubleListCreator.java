package listgenerator;

import simplelist.SimpleList;

import doublelist.DoubleList;

public class DoubleListCreator{	
	private static DoubleList<Integer> _myDoublelist;
	
	public DoubleListCreator(){
		DoubleListCreator.set_myDoublelist(new DoubleList<Integer>());
	}
	

	public DoubleList<Integer> creator(SimpleList<Integer> simpleList){
		SimpleList<Integer> temp= simpleList;
		int counter = simpleList.length();
		while(temp.length()!=0){
			if (_myDoublelist.length()!= counter){
				get_myDoublelist().append(temp.deleteHead());
			}else{
				break;
			}
		}
		temp = simpleList;
		return _myDoublelist;

	}


	public static DoubleList<Integer> get_myDoublelist() {
		return _myDoublelist;
	}


	public static void set_myDoublelist(DoubleList<Integer> _myDoublelist) {
		DoubleListCreator._myDoublelist = _myDoublelist;
	}
}
