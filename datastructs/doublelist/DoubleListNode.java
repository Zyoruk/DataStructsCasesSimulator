package doublelist;


/**
 * 
 * @author zyoruk
 * This is the node that a double list and double circular list contains.
 * It has a next node and a previous node.
 * @param <K>
 */
public class DoubleListNode<K> {
    
    private K elem;
    private DoubleListNode<K> next;
    private DoubleListNode<K> previous;
    private int priority;
    
    /**
     * Creates the ndoe with an element
     * @param elem
     */
    public DoubleListNode(K elem) {
        this.elem = elem;
        this.next = null;
        this.previous = null;
        this.priority = 0;
    }
    
    /**
     * Creates the node with the its next node
     * @param elem
     * @param next
     */
    public DoubleListNode(K elem, DoubleListNode<K> next) {
        this.elem = elem;
        this.next = next;
        this.previous = null;
    }
    
    /**
     * Sets the next node to the node
     * @param next
     */
    public void setNext(DoubleListNode<K> next) {
        this.next = next;
    }
    
    /**
     * Sets the previous node to the node
     * @param previous
     */
    public void setPrevious(DoubleListNode<K> previous) {
        this.previous = previous;
    }

    /**
     * Gets the next element
     * @return next node
     */
    public DoubleListNode<K> getNext() {
        return this.next;
    }
    
    /**
     * returns the previous node
     * @return the previous node
     */
    public DoubleListNode<K> getPrevious() {
        return this.previous;
    }
    
    /**
     * Gets the current node data
     * @return return data
     */
    public K getElem() {
        return this.elem;
    }
    /**
     * Gets the priority of the node
     * @return the priority
     */
    public int getPriority() {
        return this.priority;
    }

    /**
     * Sets the priority to the node.
     * @param priori
     */
    public void setPriority(int priori) {
        this.priority = priori;
    }
}