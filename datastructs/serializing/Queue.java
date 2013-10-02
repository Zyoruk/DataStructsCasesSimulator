package serializing;

import doublelist.DoubleList;

public class Queue<K> extends DoubleList<K>{	
	
	public void Enqueue(K pk){
		super.insert(pk);
	}
	
	public void Dequeue(){
		super.cut();
	}

	public String Peek(){
		return super.returnElem();
	}

}
