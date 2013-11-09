package queue;

import interfaces.QueueInterface;

/**
 * 
 * @author zyoruk
 * Implementation of queue using arrays.
 * Implements QueueInterface to attach to a model.
 * @param <K>
 */
public class QueueWithArray<K> implements QueueInterface<K> {
	private boolean isEmpty;
	private int[] queue;
	private double _start;
	private double _end;
	
	public QueueWithArray(int size){
		this.isEmpty = true;
		this.queue = new int[size];
		this._end = 0;
		this._start = 0;
	}
	
	@Override
	public void Enqueue(K pk) {
		_start = System.currentTimeMillis();
		if (isEmpty){
			this.queue[0] = (Integer) pk;
			isEmpty = false;
		}else if (!(contains(pk))){
			int[] temp = new int[this.queue.length];
			if (isEmpty){
				queue[0] = (Integer) pk;
			}else{
				for (int i = 0 ; i < this.queue.length; i++){
					temp [i + 1] = this.queue[i];
				}
				temp[0] = (Integer)pk;
				queue = temp;
			}
		}
		_end = System.currentTimeMillis();
		System.out.println("Enqueue lasted:  " + getExecuteTime());		
	}

	@Override
	public void Dequeue() {
		this._start = System.currentTimeMillis();
		if (! isEmpty){
			for (int i = 0; i < this.queue.length; i ++){
				this.queue[i] = this.queue[i +1];
			}
		}
		this._end = System.currentTimeMillis();
		System.out.println("Dequeue lasted:  " + getExecuteTime());
	}

	@Override
	public String Peek() {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Checks if the queue contains the element.
	 * @param pk 
	 * @return true / false
	 */
	public boolean contains (K pk){
		if(this.isEmpty){
			return false;
		}else{
			boolean contains = false;
			for (int i = 0 ; i < this.queue.length; i ++){
				if (this.queue[i] == (Integer) pk){
					contains = true;
				}
			}
			return contains;
		}
	}
	
	/**
	 * Calculates the execution time.
	 * @return
	 */
	public double getExecuteTime(){
		return this._end - this._start;
	}

}
