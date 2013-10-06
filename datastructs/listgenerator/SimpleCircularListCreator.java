package listgenerator;

import java.util.ArrayList;

import simplelist.SimpleCircularList;

public  class SimpleCircularListCreator{
	private static SimpleCircularList<Integer> _mySimpleCircularList;
	
	public SimpleCircularListCreator(){
		SimpleCircularListCreator.set_mySimpleCircularList(new SimpleCircularList<Integer>());
	}
	

	public SimpleCircularList<Integer> creator(ArrayList<Integer> pNumbersToAdd){
		ArrayList<Integer> temp= pNumbersToAdd;
		int counter = pNumbersToAdd.size();
		while(temp.size()!=0){
			if (_mySimpleCircularList.length()!= counter){
				get_mySimpleCircularList().append(temp.remove(0));
			}else{
				break;
			}
		}
		temp = pNumbersToAdd;
		return _mySimpleCircularList;
	}

	public static SimpleCircularList<Integer> get_mySimpleCircularList() {
		return _mySimpleCircularList;
	}


	public static void set_mySimpleCircularList(SimpleCircularList<Integer> _mySimpleCircularList) {
		SimpleCircularListCreator._mySimpleCircularList = _mySimpleCircularList;
	}
}
