package listgenerator;

import java.util.ArrayList;

import doublelist.DoubleCircularList;

public class DoubleCircularListCreator {
	private DoubleCircularList<Integer> _myDoubleCircularlist;
	public DoubleCircularListCreator(){
		this._myDoubleCircularlist = new DoubleCircularList<Integer>();
	}
	public void DCLcreator(ArrayList<Integer> pNumbersToAdd){
		while(pNumbersToAdd.size()!=0){
			_myDoubleCircularlist.append(pNumbersToAdd.remove(0));
		}
	}
}
