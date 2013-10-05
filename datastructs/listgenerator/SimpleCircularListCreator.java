package listgenerator;

import java.util.ArrayList;

import simplelist.SimpleCircularList;

public class SimpleCircularListCreator{
	private SimpleCircularList<Integer> _mySimpleCircularList;
	
	public SimpleCircularListCreator(){
		this._mySimpleCircularList = new SimpleCircularList<Integer>();
	}
	

	public SimpleCircularList<Integer> creator(ArrayList<Integer> pNumbersToAdd){
		while(pNumbersToAdd.size()!=0){
			_mySimpleCircularList.append(pNumbersToAdd.remove(0));
		}
		return this._mySimpleCircularList;
	}
}
