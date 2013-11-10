package listgenerator;


import simplelist.SimpleList;

import doublelist.DoubleCircularList;

public class DoubleCircularListCreator {
	
	protected DoubleCircularList<Integer> _myDoubleCircularlist;
	
	public DoubleCircularListCreator(){
		_myDoubleCircularlist = new DoubleCircularList<Integer>();
	}
	

	public DoubleCircularList<Integer> creator(SimpleList<Integer> pNumbersToAdd){
//		SimpleList<Integer> temp = buildTemp(pNumbersToAdd);
		int counter = pNumbersToAdd.length();
		while(pNumbersToAdd.length()!=0){
			if (_myDoubleCircularlist.length() != counter){
				_myDoubleCircularlist.append(pNumbersToAdd.deleteHead());
			}else{
				break;
			}
		}
		return _myDoubleCircularlist;

	}


	public  DoubleCircularList<Integer> get_myDoubleCircularlist() {
		return _myDoubleCircularlist;
	}


	public void set_myDoubleCircularlist(DoubleCircularList<Integer> pMyDoubleCircularlist) {
		this._myDoubleCircularlist = pMyDoubleCircularlist;
	}
	
//	private SimpleList<Integer> buildTemp(SimpleList<Integer> pList){
//		SimpleList<Integer> temp = new SimpleList<Integer>();
//		for(int i = 0 ; i <pList.length();i++){
//			temp.append(pList.deleteHead());
//		}
//		return temp;
//	}
}
