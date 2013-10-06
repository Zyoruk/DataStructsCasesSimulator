package listgenerator;

import java.util.ArrayList;
import simplelist.SimpleList;

public  class SimpleListCreator  {
	private static SimpleList<Integer> _mySimpleList;
	
	public SimpleListCreator(){
		SimpleListCreator.set_mySimpleList(new SimpleList<Integer>());
	}
	

	public SimpleList<Integer> creator(ArrayList<Integer> pNumbersToAdd){
		ArrayList<Integer> temp= pNumbersToAdd;
		int counter = pNumbersToAdd.size();
		while(temp.size()!=0){
			if (_mySimpleList.length()!= counter){
				get_mySimpleList().append(temp.remove(0));
			}else{
				break;
			}
		}
		temp = pNumbersToAdd;
		return _mySimpleList;

	}


	public static SimpleList<Integer> get_mySimpleList() {
		return _mySimpleList;
	}


	public static void set_mySimpleList(SimpleList<Integer> _mySimpleList) {
		SimpleListCreator._mySimpleList = _mySimpleList;
	}
}
