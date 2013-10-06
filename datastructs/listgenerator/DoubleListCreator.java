package listgenerator;

import java.util.ArrayList;

import doublelist.DoubleList;

public class DoubleListCreator{	
	private static DoubleList<Integer> _myDoublelist;
	
	public DoubleListCreator(){
		DoubleListCreator.set_myDoublelist(new DoubleList<Integer>());
	}
	

	public DoubleList<Integer> creator(ArrayList<Integer> pNumbersToAdd){
		ArrayList<Integer> temp= pNumbersToAdd;
		int counter = pNumbersToAdd.size();
		while(temp.size()!=0){
			if (_myDoublelist.length()!= counter){
				get_myDoublelist().append(temp.remove(0));
			}else{
				break;
			}
		}
		temp = pNumbersToAdd;
		return _myDoublelist;

	}


	public static DoubleList<Integer> get_myDoublelist() {
		return _myDoublelist;
	}


	public static void set_myDoublelist(DoubleList<Integer> _myDoublelist) {
		DoubleListCreator._myDoublelist = _myDoublelist;
	}
}
