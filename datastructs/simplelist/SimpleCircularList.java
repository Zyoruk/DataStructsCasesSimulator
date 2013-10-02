package edu.itcr.startec.datastructs.simplelist;

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

class SimpleCircularListIterator<K> implements Iterator<K> {

    SimpleCircularList<K> list;
    SimpleListNode<K> current;
    
    public SimpleCircularListIterator(SimpleCircularList<K> list) {
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

public class SimpleCircularList<K> implements ListInterface<K>, Iterable<K> {
    
    protected int length;
    protected SimpleListNode<K> head;
    protected SimpleListNode<K> tail;

    public SimpleCircularList() {
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

        SimpleListNode<K> node = new SimpleListNode<K>(pk);

        if(isEmpty()) {
            this.head = node;
        } else {
            this.tail.setNext(node);
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
        
        // Search node
        SimpleListNode<K> previous = null;
        SimpleListNode<K> current = this.head;
        while(current != null) {
            if(current.getElem().equals(pk)) {
                break;
            }
            previous = current;
            current = current.getNext();
        }

        // If not found
        if(current == null) {
            return false;
        }

        // Found, check head
        if(current == this.head) {
            this.head = current.getNext();
        }
        // Found, check tail
        if(current == this.tail) {
            this.tail = previous;
        }

        // Remove node
        if(previous != null) {
            previous.setNext(current.getNext());
        }
        current.setNext(null);
        current = null;
        this.length -= 1;
        return true;
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

        SimpleListNode<K> node = new SimpleListNode<K>(pk);

        // Check valid position
        if((pos < 0) || (pos > this.length)) {
            return false;
        }

        // Search position
        SimpleListNode<K> previous = null;
        SimpleListNode<K> current = this.head;
        for(int i = 0; i != pos; i++) {
            previous = current;
            current = current.getNext();
        }

        // Insert node
        node.setNext(current);
        if(previous != null) {
            previous.setNext(node);
        }

        // Check head
        if(current == this.head) {
            this.head = node;
        }
        // Check tail
        if(previous == this.tail) {
            this.tail = node;
        }

        this.length += 1;
        return true;
    }
    
    @Override
    public boolean insert(K pk) {
        SimpleListNode<K> node = new SimpleListNode<K>(pk);

        // Insert node
        node.setNext(this.head);

        // Check head
        this.head = node;

        this.length += 1;
        return true;
    }

    @Override
    public boolean clear() {
        SimpleListNode<K> temp = null;
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
        return new SimpleCircularListIterator<K>(this);
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

    @Override
    public boolean delete() {
        //Set tmp list
        SimpleListNode<K> node = this.head.getNext();
        
        //Destroy
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
