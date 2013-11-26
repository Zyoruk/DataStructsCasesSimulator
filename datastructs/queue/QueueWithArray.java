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
	public boolean isEmpty;
	private int[] queue;
	private int indexI;
	private int indexJ;

	
	public QueueWithArray(int size){
		this.isEmpty = true;
		this.queue = new int[size];
		this.indexI = 0;

	}
	
	/**
	 * Enqueue the element
	 * @param pk
	 */
	@Override
	public void Enqueue(K pk) {
		if (isEmpty){
			this.queue[0] = (Integer) pk;
			isEmpty = false;
		}else if (!(exists(pk))){
			if ((indexI == this.queue.length -1 && indexJ == 0) | 
			   (indexI == indexJ) ){
				resize();
			}
			queue[indexI] = (Integer) pk;
			indexI ++;
			isEmpty = false;
		}		
	}

	/**
	 * Dequeues
	 * @return the data of the element removed.
	 */
	@Override
	public int Dequeue() {
		if (!(isEmpty)){
			indexJ ++;
		}
		if (indexI == 0 && indexJ== 0){
			isEmpty = true;
		}
		return (int)this.queue[0];
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
			for (int i = 0 ; i < this.queue.length -1; i ++){
				if (this.queue[i] == (Integer) pk){
					contains = true;
				}
			}
			return contains;
		}
	}
		
	/**
	 * @return size of the queue
	 */
	public int length(){
		return this.queue.length;
	}

	/**
	 *  @return if the queue is empty
	 */
	@Override
	public boolean isEmpty() {
		return this.queue[0] == 0;
	}

	/**
	 * @return description of the queue
	 */
	@Override
	public String describe() {
        StringBuilder result = new StringBuilder();

        result.append("List: ");
        for(int i = 0; i < this.queue.length; i++) {
            result.append(String.format("%s ", Integer.toString(queue[i])));
        }
        result.append("\n");

        result.append(String.format("Length: %d\n", this.queue.length));
        return result.toString();
	}

	/**
	 * @return if the element exists
	 */
	@Override
	public boolean exists(K pk) {
		boolean exists= false;
		for (int i = 0 ; i < this.queue.length; i ++){
			if((Integer)pk == 0){
				return false;
			}
			if ( queue[i] == (Integer) pk){
				exists = true;
				break;
			}
		}
		return exists;
	}
	
	/**
	 * resizes the list to the 40%
	 */
	private void resize(){
		indexJ = this.queue.length;
		indexI = 0;
		int [] temp = new int [ (int)(this.queue.length + 
								(this.queue.length *40)/100) ];
		for (int i = 0 ; i < this.queue.length; i ++){
			temp[i] = this.queue[i];
		}
		this.queue = temp;
	}
}
