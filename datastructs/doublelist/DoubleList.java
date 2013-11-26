package doublelist;


import interfaces.ListInterface;

import java.util.Iterator;
/**
 * Lets us move through the list.
 */
class DoubleListIterator<K> implements Iterator<K> {

    DoubleList<K> list;
    DoubleListNode<K> current;
    
    public DoubleListIterator(DoubleList<K> list) {
        this.list = list;
        this.current = null;
    }
    
    @Override
    /**
     *   @return if it has a next element
     */
    public boolean hasNext() {
        
        if(this.current == null) {
            if(this.list.isEmpty()) {
                return false;
            }
            this.current = this.list.head;
            return true;
        }
        
        this.current = this.current.getNext();
        return this.current != null;
    }

    @Override
    /**
     * @return the next element
     */
    public K next() {
        if(this.current == null) {
            return null;
        }
        return this.current.getElem();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

/**
 * 
 * @author zyoruk
 * A double list is a list that has each element pointing to the next and the
 * previous. Head and tail are not connected between them.
 * @param <K>
 */
public class DoubleList<K> implements ListInterface<K>, Iterable<K> {
    
    protected int length;
    protected DoubleListNode<K> head;
    protected DoubleListNode<K> tail;

    public DoubleList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }
    
    @Override
    /**
     * @return if head is null
     */
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    /**
     * Add the element as the tail.
     * @return if it was able
     */
    public boolean append(K pk) {
        DoubleListNode<K> node = new DoubleListNode<K>(pk);

        if(isEmpty()) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.setNext(node);
            node.setPrevious(this.tail);
        }
        this.tail = node;
        this.length += 1;
        return true;
    }

    @Override
    /**
     * Deletes the element
     * @return if it was able
     */
    public boolean delete(K pk) {
        if(isEmpty()) {
            return false;
        }
        if(this.length == 1) {
            if(this.head.getElem().equals(pk)) {
                clear();
                this.length -= 1;
                return true;
            }
            return false;
        }
        
        DoubleListNode<K> current = this.head;
        while(current != null) {
            if(current.getElem().equals(pk)) {
                // Remove node
                if(current == this.tail){
                	this.tail = current.getPrevious();
                	current.getPrevious().setNext(current.getNext());
                	this.length -= 1;
                	return true;
                }
                if (current == this.head){
                	this.head = current.getNext();
                	current.getNext().setPrevious(current.getPrevious());
                	this.length -= 1;
                	return true;
                }
                current.getPrevious().setNext(current.getNext());
                current.getNext().setPrevious(current.getPrevious());
                current.setNext(null);
                current = null;
                this.length -= 1;
                return true;
            }            
            current = current.getNext();
        }        
        return false;
    }

    @Override
    /**
     * let us know the quantity of elements
     * @return the quantity
     */
    public int length() {
        return this.length;
    }

    @Override
    /**
     * @return if the list has the element
     */
    public boolean exists(K pk) {
        for(K ck : this) {
            if(ck.equals(pk)) {
                return true;
            }
        }
        return false;
    }

    @Override
    /**
     * Adds the element into a position
     * @return if it was able
     */
    public boolean insert(int pos, K pk) {
        DoubleListNode<K> node = new DoubleListNode<K>(pk);
        int i;

        // Check valid position
        if((pos < 0) || (pos > this.length)) {
            return false;
        }

        // Search position
        DoubleListNode<K> current = this.head;
        for(i = 0; i != pos; i++) {
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

    @Override
    /**
     * empties the list
     * @return if it was able to clear it.
     */
    public boolean clear() {
        DoubleListNode<K> temp = null;
        while(this.head != null) {
            temp = this.head.getNext(); 
            this.head.setNext(null);
            this.head = temp;
        }
        this.tail = null;
        this.length = 0;
        return true;
    }
    
    public String returnElem(){
    	return (String) this.head.getElem();
    }
    
    /**
     * @return a decription of the list (length, head , tail and elements of
     * the list)
     */
    public String describe() {
        StringBuilder result = new StringBuilder();

        result.append("List: ");
        for(K k : this) {
            result.append(String.format("%s ", k.toString()));
        }
        result.append("\n");

        result.append(String.format("Length: %d\n", this.length));
        result.append(
                String.format("Head: %s\n", this.head.getElem().toString())
            );
        result.append(
                String.format("Tail: %s\n", this.tail.getElem().toString())
            );

        return result.toString();
    }
    
    @Override
    /**
     * Inserts the element
     * @return If it was able to insert
     */
    public boolean insert(K pk) {
        DoubleListNode<K> node = new DoubleListNode<K>(pk);

        // Insert node
        if (this.head == null){
        	this.tail = node;
        }else{
        	node.setNext(this.head);
        	this.head.setPrevious(node);
        }
        // Check head
        this.head = node;

        this.length += 1;
        return true;
	}

	//Erase first node
	@Override
	/**
	 * deletes the head
	 * @return if it was able
	 */
	public boolean delete() {
		//Set tmp list
        DoubleListNode<K> node = this.head.getNext();
        
        //Destroy
        this.head.getNext().setPrevious(null);
        this.head = null;
                
        //Set new list
        this.head = node;
        return true;
	}

	//Erase last node
	@Override
	/**
	 * Deletes the tail
	 * @return the tail removed
	 */
	public K cut() {
		if (this.tail == null){
			return this.tail.getElem();
		} else if (this.tail.getPrevious() == null){
			this.head = null;
			this.tail = null;
		} else {
			this.tail = this.tail.getPrevious();
			this.tail.setNext(null);
		}
		this.length--;
		return this.tail.getElem();
	}

    @Override
    public Iterator<K> iterator() {
        return new DoubleListIterator<K>(this);
    }
}
