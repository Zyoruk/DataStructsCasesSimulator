package listgenerator;

import java.util.ArrayList;

import simplelist.SimpleList;


public class SimpleListCreator{
	private SimpleList<Integer> _mySimpleList;
	
	public SimpleListCreator(){
		this._mySimpleList = new SimpleList<Integer>();
	}
	

	public SimpleList<Integer> creator(ArrayList<Integer> pNumbersToAdd){
		while(pNumbersToAdd.size()!=0){
			_mySimpleList.append(pNumbersToAdd.remove(0));
		}
		return this._mySimpleList;
	}
}
