package listgenerator;

import java.util.ArrayList;


import serializing.Queue;

public class QueueCreator  {
	private static Queue<Integer> _myQueue;
	
	public QueueCreator(){
		QueueCreator.set_myQueue(new Queue<Integer>());
	}
	
	public Queue<Integer> creator(ArrayList<Integer> pNumbersToAdd){
		ArrayList<Integer> temp= pNumbersToAdd;
		int counter = pNumbersToAdd.size();
		while(temp.size()!=0){
			if (_myQueue.length()!= counter){
				get_myQueue().append(temp.remove(0));
			}else{
				break;
			}
		}
		temp = pNumbersToAdd;
		return _myQueue;

	}

	public static Queue<Integer> get_myQueue() {
		return _myQueue;
	}

	public static void set_myQueue(Queue<Integer> _myQueue) {
		QueueCreator._myQueue = _myQueue;
	}
}
