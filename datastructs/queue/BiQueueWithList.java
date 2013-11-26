package queue;

import simplelist.SimpleList;
import interfaces.QueueInterface;

/**
 * 
 * @author zyoruk
 * A biqueue is mostly a simple list.
 * @param <K>
 */
public class BiQueueWithList<K> extends SimpleList<K> implements QueueInterface<K> {

	
	public BiQueueWithList (){
		super();
	}
	@Override
	/**
	 * @return the length of the list
	 */
	public int length() {
		return super.length();
	}

	/**
	 * @return if the list was empty
	 */
	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}

	/**
	 * @return Description of the list
	 */
	@Override
	public String describe() {
		return super.describe();
	}

	/**
	 * @return exists or not
	 */
	@Override
	public boolean exists(K pk) {
		return  super.exists(pk);
	}
	/**
	 * enqueues the element
	 */
	@Override
	public void Enqueue(K pk) {
		super.insert(pk);		
	}

	/**
	 * Deletes the first element
	 * @return the element reomoved
	 */
	@Override
	public int Dequeue() {
		return (Integer) super.cut();
	}

	/**
	 * Inserts the element at the end of the list
	 * @param pk
	 */
	public void InsertAtEnd(K pk){
		super.append(pk);
	}
	
	/**
	 * Deletes the last element
	 */
	public void DeleteEnd(){
		super.cut();
	}

}
