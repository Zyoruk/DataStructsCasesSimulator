package queue;

import interfaces.QueueInterface;
import doublelist.DoubleList;

public class QueueWithList<K> extends DoubleList<K> implements QueueInterface<K> {	
	
	public void Enqueue(K pk){
		super.insert(pk);
	}
	
	public void Dequeue(){
		super.cut();
	}

	public String Peek(){
		return super.returnElem();
	}

}
