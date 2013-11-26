package doublelist;

import interfaces.ListInterface;

import java.util.Iterator;
/**
 * 
 * @author zyoruk
 * Lets us move trough the structure
 * @param <K>
 */
class DoubleCircularListIterator<K> implements Iterator<K> {

    DoubleCircularList<K> list;
    DoubleListNode<K> current;
    
    public DoubleCircularListIterator(DoubleCircularList<K> list) {
        this.list = list;
        this.current = null;
    }
    
    /**
     * If the element has a next element
     * @return True or false depending if it has or not a next element 
     */
    @Override
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
     * Returns the element of the next element.
     * @return K which is the element
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
 * A Doubly linked circular list is a list that has a tail pointing to the head
 * and viceversa. This means that it is circular. Also, every elemement has a 
 * next pointer and a previous one.
 * @param <K>
 */
public class DoubleCircularList<K> implements ListInterface<K>, Iterable<K> {
    
    protected int length;
    protected DoubleListNode<K> head;
    protected DoubleListNode<K> tail;

    public DoubleCircularList() {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }
    
    @Override
    /**
     * The list is empty when the head is null.
     * @return True or false depending
     */
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    /**
     * This list will add to the last position the element.
     * @return a boolean depending if it was able to do it.
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
     * The list will delete the element.
     * @return a boolean if it was able to do the delete
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
     * Lets us know how many elements the list has.
     * @return an integer 
     */
    public int length() {
        return this.length;
    }

    @Override
    /**
     * Search for an element.
     * @return If the element is in the list true, false if not.
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
     * Inserts the element into de position.
     * @return boolean 
     */
    public boolean insert(int pos, K pk) {
        DoubleListNode<K> node = new DoubleListNode<K>(pk);
        int i;
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
     * Empties the list.
     * @return boolean
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
    
    /**
     * This uses a string builder.
     * It will give us the elements of the list , the length, tail and head.
     * @return the string
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
    
    /**
     * Inserts the element as the head of the list.
     * @return boolean
     */
    @Override
    public boolean insert(K pk) {
        DoubleListNode<K> node = new DoubleListNode<K>(pk);

        // Insert node
        node.setNext(this.head);
        node.setPrevious(this.tail);
        
        this.head = node;
        //First insert
        if(isEmpty()) {
            this.tail = node;
        }
        System.out.println(this.head);
        System.out.println(this.tail);
        this.tail.setNext(this.head);
        this.head.getNext().setPrevious(this.tail);

        this.length += 1;
        return true;
	}
    
    /**
     * Delete the head.
     * @return if it was able to do it
     */
	@Override
	public boolean delete() {
		//Set tmp list
        DoubleListNode<K> node = this.head.getNext();
        
        //Destroy
        this.head.getNext().setPrevious(this.tail);
        this.head = null;
                
        //Set new list
        this.head = node;
        return true;
	}

	@Override
	/**
	 * Deletes the tail of the list.
	 * @return the tail deleted
	 */
	public K cut() {		
		//Set tmp list
        DoubleListNode<K> node = this.tail.getPrevious();
        
        //Destroy
        this.tail.getPrevious().setNext(this.head);
        this.tail = null;
                
        //Set new list
        this.tail = node;
        return node.getElem();
	}

    @Override
    public Iterator<K> iterator() {
        return new DoubleCircularListIterator<K>(this);
    }
}
