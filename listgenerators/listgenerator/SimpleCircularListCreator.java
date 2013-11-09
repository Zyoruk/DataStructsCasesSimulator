package listgenerator;

import simplelist.SimpleCircularList;
import simplelist.SimpleList;

public  class SimpleCircularListCreator{
	private static SimpleCircularList<Integer> _mySimpleCircularList;
	
	public SimpleCircularListCreator(){
		SimpleCircularListCreator.set_mySimpleCircularList(new SimpleCircularList<Integer>());
	}
	

	public SimpleCircularList<Integer> creator(SimpleList<Integer> simpleList){
		SimpleList<Integer> temp= simpleList;
		int counter = simpleList.length();
		while(temp.length()!=0){
			if (_mySimpleCircularList.length()!= counter){
				get_mySimpleCircularList().append(temp.deleteHead());
			}else{
				break;
			}
		}
		temp = simpleList;
		return _mySimpleCircularList;
	}

	public static SimpleCircularList<Integer> get_mySimpleCircularList() {
		return _mySimpleCircularList;
	}


	public static void set_mySimpleCircularList(SimpleCircularList<Integer> _mySimpleCircularList) {
		SimpleCircularListCreator._mySimpleCircularList = _mySimpleCircularList;
	}
}
