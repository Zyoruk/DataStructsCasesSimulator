package queue;

import doublelist.DoubleList;
import doublelist.DoubleListNode;
import interfaces.QueueInterface;

/**
 * Class to create a Queue. It extends from DoubleList because each node
 * has references to the previous and next nodes of the list.
 * @author zyoruk,jeukel
 *
 * @param <K>
 */
public class PriorityQueue<K> extends DoubleList<K> implements QueueInterface<K> {
	/**
	 * Adds to the first position
	 * @param pk
	 */
	@Override
	public void Enqueue(K pk) {
		super.insert(pk);
	}

	/**
	 * Removes the last node.
	 */
	public int Dequeue(){
		int removed = (Integer) super.cut();
		return removed;
	}

	/**
	 *
	 * @return Gets the element of the first node as a string.
	 */
	public String Peek(){
		return super.returnElem();
	}

	/**
	 * Enqueues an element with an established priority	
	 * @param pk element to insert
	 * @param priori 
	 * @return if it was able to enqueue
	 */
	public boolean Enqueue(K pk, int priori){
		DoubleListNode<K> node = new DoubleListNode<K>(pk);
		node.setPriority(priori);
		int i;

		// Check valid position
		if(priori < 1 || priori > 500){
			return false;
		}

		// Search priority
		DoubleListNode<K> current = this.head;
		for(i = 1; current.getPriority() > current.getNext().getPriority()
				;i++) {
			if(current == this.tail){
				break;
			}
			current = current.getNext();
		}

		// Insert node
		if(this.length == i){
			this.tail.setNext(node);
			node.setPrevious(this.tail);
		} else {
			node.setNext(current);
			node.setPrevious(current.getPrevious());
			if(current.getPrevious() != null) {
				current.getPrevious().setNext(node);
				current.setPrevious(node);
			}
		}

		// Check head
		if(current == this.head) {
			this.head = node;
		}
		// Check tail
		if(this.length == i){
			this.tail = tail.getNext();
		}
		this.length += 1;
		return true;
	}
}

