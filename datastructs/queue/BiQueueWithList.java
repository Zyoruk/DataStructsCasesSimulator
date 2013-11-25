package queue;

import simplelist.SimpleList;
import interfaces.QueueInterface;

public class BiQueueWithList<K> extends SimpleList<K> implements QueueInterface<K> {

	private boolean isEmpty;
	
	public BiQueueWithList (){
		
	}
	@Override
	public int length() {
		return super.length();
	}

	@Override
	public boolean isEmpty() {
		return isEmpty;
	}

	@Override
	public String describe() {
		return super.describe();
	}

	@Override
	public boolean exists(K pk) {
		return  super.exists(pk);
	}

	@Override
	public void Enqueue(K pk) {
		super.insert(pk);		
	}

	@Override
	public int Dequeue() {
		return (Integer) super.cut();
	}

	public void InsertAtEnd(K pk){
		super.append(pk);
	}
	
	public int DeleteFirst(){
		return super.deleteHead();
	}
	@Override
	public String Peek() {
		// TODO Auto-generated method stub
		return null;
	}

}
