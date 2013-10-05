package listgenerator;

import java.util.ArrayList;

import simplelist.SimpleCircularList;

public class SimpleCircularListCreator {
	private SimpleCircularList<Integer> _mySimpleCircularList;
	public SimpleCircularListCreator(){
		this._mySimpleCircularList = new SimpleCircularList<Integer>();
	}
	public void SCLcreator(ArrayList<Integer> pNumbersToAdd){
		while(pNumbersToAdd.size()!=0){
			_mySimpleCircularList.append(pNumbersToAdd.remove(0));
		}
	}
}
