package listgenerator;

import serializing.Queue;
import simplelist.SimpleList;

public class QueueCreator  {
	private static Queue<Integer> _myQueue;
	
	public QueueCreator(){
		QueueCreator.set_myQueue(new Queue<Integer>());
	}
	
	public Queue<Integer> creator(SimpleList<Integer> simpleList){
		SimpleList<Integer> temp= simpleList;
		int counter = simpleList.length();
		while(temp.length()!=0){
			if (_myQueue.length()!= counter){
				get_myQueue().append(temp.deleteHead());
			}else{
				break;
			}
		}
		temp = simpleList;
		return _myQueue;

	}

	public static Queue<Integer> get_myQueue() {
		return _myQueue;
	}

	public static void set_myQueue(Queue<Integer> _myQueue) {
		QueueCreator._myQueue = _myQueue;
	}
}
