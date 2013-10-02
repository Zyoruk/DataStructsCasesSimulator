package edu.itcr.startec.datastructs.doublelist;

import java.util.Iterator;

import edu.itcr.startec.datastructs.ListInterface;
import edu.itcr.startec.logicclasses.structs.Base;
import edu.itcr.startec.logicclasses.structs.House;
import edu.itcr.startec.logicclasses.structs.PapaBuilding;
import edu.itcr.startec.logicclasses.units.Harvester;
import edu.itcr.startec.logicclasses.units.Healer;
import edu.itcr.startec.logicclasses.units.Kamikaze;
import edu.itcr.startec.logicclasses.units.Monk;
import edu.itcr.startec.logicclasses.units.PapaBicho;

class DoubleCircularListIterator<K> implements Iterator<K> {

    DoubleCircularList<K> list;
    DoubleListNode<K> current;
    
    public DoubleCircularListIterator(DoubleCircularList<K> list) {
        this.list = list;
        this.current = null;
    }
    
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
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
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
    public int length() {
        return this.length;
    }

    @Override
    public boolean exists(K pk) {
        for(K ck : this) {
            if(ck.equals(pk)) {
                return true;
            }
        }
        return false;
    }

    @Override
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
    
    @Override
    public Iterator<K> iterator() {
        return new DoubleCircularListIterator<K>(this);
    }
    
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
    
    public String searchANDdescribe() {
		StringBuilder result = new StringBuilder();
		for(K k : this) {
			if(k.getClass().equals(PapaBuilding.class)){
				result.append(((PapaBuilding) k).getAttributes());
			}else if(k.getClass().equals(PapaBicho.class)){
				result.append(((PapaBicho) k).getAttributes());
			}else if(k.getClass().equals(Monk.class)){
				result.append(((PapaBicho) k).getAttributes());
			}else if(k.getClass().equals(Harvester.class)){
				result.append(((PapaBicho) k).getAttributes());
			}else if (k.getClass().equals(Healer.class)){
				result.append(((PapaBicho) k).getAttributes());
			}else if(k.getClass().equals(Kamikaze.class)){
				result.append(((PapaBicho) k).getAttributes());
			}else if(k.getClass().equals(Base.class)){
				result.append(((PapaBuilding) k).getAttributes());
			}else if (k.getClass().equals(House.class)){
				result.append(((PapaBuilding) k).getAttributes());
			}
		}
		return result.toString();
	}
    
    //Insert as head
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
        
        this.tail.setNext(this.head);
        this.head.getNext().setPrevious(this.tail);

        this.length += 1;
        return true;
	}
    
    //Delete head
	@Override
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

	@Override
	public boolean cut() {
		// TODO Auto-generated method stub
		return false;
	}
}
