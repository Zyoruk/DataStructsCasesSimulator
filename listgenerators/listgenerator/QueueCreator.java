package listgenerator;

import queue.QueueWithList;
import simplelist.SimpleList;

public class QueueCreator  {
	private static QueueWithList<Integer> _myQueue;
	
	public QueueCreator(){
		QueueCreator.set_myQueue(new QueueWithList<Integer>());
	}
	
	public QueueWithList<Integer> creator(SimpleList<Integer> simpleList){
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

	public static QueueWithList<Integer> get_myQueue() {
		return _myQueue;
	}

	public static void set_myQueue(QueueWithList<Integer> _myQueue) {
		QueueCreator._myQueue = _myQueue;
	}
}
