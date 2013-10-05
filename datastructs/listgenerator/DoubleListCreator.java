package listgenerator;

import interfaces.ListInterface;

import java.util.ArrayList;

import doublelist.DoubleList;

public class DoubleListCreator implements ListInterface<Integer> {
	
	private DoubleList<Integer> _myDoublelist;
	
	public DoubleListCreator(){
		this._myDoublelist = new DoubleList<Integer>();
	}
	

	public DoubleList<Integer> creator(ArrayList<Integer> pNumbersToAdd){
		while(pNumbersToAdd.size()!=0){
			_myDoublelist.append(pNumbersToAdd.remove(0));
		}
		return this._myDoublelist;
	}
}
