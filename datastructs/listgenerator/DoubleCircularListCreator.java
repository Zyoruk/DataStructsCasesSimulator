package listgenerator;


import java.util.ArrayList;

import doublelist.DoubleCircularList;

public class DoubleCircularListCreator {
	
	private static DoubleCircularList<Integer> _myDoubleCircularlist;
	
	public DoubleCircularListCreator(){
		DoubleCircularListCreator.set_myDoubleCircularlist(new DoubleCircularList<Integer>());
	}
	

	public DoubleCircularList<Integer> creator(ArrayList<Integer> pNumbersToAdd){
		ArrayList<Integer> temp= pNumbersToAdd;
		int counter = pNumbersToAdd.size();
		while(temp.size()!=0){
			if (_myDoubleCircularlist.length()!= counter){
				get_myDoubleCircularlist().append(temp.remove(0));
			}else{
				break;
			}
		}
		return _myDoubleCircularlist;

	}


	public static DoubleCircularList<Integer> get_myDoubleCircularlist() {
		return _myDoubleCircularlist;
	}


	public static void set_myDoubleCircularlist(DoubleCircularList<Integer> _myDoubleCircularlist) {
		DoubleCircularListCreator._myDoubleCircularlist = _myDoubleCircularlist;
	}
}
