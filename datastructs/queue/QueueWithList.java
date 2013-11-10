package queue;

import interfaces.QueueInterface;
import doublelist.DoubleList;

public class QueueWithList<K> extends DoubleList<K> implements QueueInterface<K> {	
	
	public void Enqueue(K pk){
		super.insert(pk);
	}
	
	public int Dequeue(){
		int removed = (Integer) super.cut();
		return removed;
	}

	public String Peek(){
		return super.returnElem();
	}

}
