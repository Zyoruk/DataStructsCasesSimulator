package queue;

import interfaces.QueueInterface;
import doublelist.DoubleList;

/**
 * 
 * @author zyoruk
 * Implements a queue with a double list
 * @param <K>
 */
public class QueueWithList<K> extends DoubleList<K> implements QueueInterface<K> {	
	
	/**
	 * Enqueues the element
	 */
	public void Enqueue(K pk){
		super.insert(pk);
	}
	
	/**
	 * Dequeues
	 * @return the data of the element dequeued
	 */
	public int Dequeue(){
		int removed = (Integer) super.cut();
		return removed;
	}
}
