package listgenerator;

import java.util.ArrayList;

import doublelist.DoubleList;

import serializing.Queue;

public class QueueCreator implements ICreator{
	private Queue<Integer> _myQueue;
	
	public QueueCreator(){
		this._myQueue = new Queue<Integer>();
	}
	
	@Override
	public DoubleList<Integer> creator(ArrayList<Integer> pNumbersToAdd){
		while(pNumbersToAdd.size()!=0){
			_myQueue.Enqueue(pNumbersToAdd.remove(0));
		}
		return this._myQueue;
	}
}
