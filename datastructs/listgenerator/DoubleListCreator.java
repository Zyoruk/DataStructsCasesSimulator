package listgenerator;

import java.util.ArrayList;

import doublelist.DoubleList;

public class DoubleListCreator {
	private DoubleList<Integer> _myDoublelist;
	public DoubleListCreator(){
		this._myDoublelist = new DoubleList<Integer>();
	}
	public void DLcreator(ArrayList<Integer> pNumbersToAdd){
		while(pNumbersToAdd.size()!=0){
			_myDoublelist.append(pNumbersToAdd.remove(0));
		}
	}
}
