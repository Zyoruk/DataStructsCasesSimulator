package listgenerator;

import simplelist.SimpleList;

public  class SimpleListCreator  {
	private static SimpleList<Integer> _mySimpleList;
	
	public SimpleListCreator(){
		SimpleListCreator.set_mySimpleList(new SimpleList<Integer>());
	}
	

	public SimpleList<Integer> creator(SimpleList<Integer> simpleList){
		SimpleList<Integer> temp= simpleList;
		int counter = simpleList.length();
		while(temp.length()!=0){
			if (_mySimpleList.length()!= counter){
				get_mySimpleList().append(temp.deleteHead());
			}else{
				break;
			}
		}
		temp = simpleList;
		return _mySimpleList;

	}


	public static SimpleList<Integer> get_mySimpleList() {
		return _mySimpleList;
	}


	public static void set_mySimpleList(SimpleList<Integer> _mySimpleList) {
		SimpleListCreator._mySimpleList = _mySimpleList;
	}
}
