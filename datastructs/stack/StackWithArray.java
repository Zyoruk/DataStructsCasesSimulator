/**
 * 
 */
package stack;

import interfaces.StackInterface;

/**
 * @author zyoruk
 * This is a stack implementation using arrays .
 * Implements StackInterface to attach to a model
 */
public class StackWithArray<K> implements StackInterface<K>{
	
	private boolean isEmpty;
	private int[] stack;
	private double _start;
	private double _end;
	
	//Constructor
	public StackWithArray(int size){
		this.stack = new int[size];
		this.isEmpty = true;
		this._start = 0;
		this._end = 0;
	}
	
	@Override
	public boolean push(K pk) {
		_start = System.currentTimeMillis();
		boolean pushed = false;
		if (isEmpty){
			stack[0] = (Integer)pk;
			isEmpty = false;
			pushed = true;
			_end = System.currentTimeMillis();
			return pushed;
		}else if(!(contains(pk))){
			int[] temp = new int[this.stack.length];
			for (int i = 0; i < this.stack.length; i++){
				temp[i+1] = stack[i];
			}
			temp[0] = (Integer)pk;
			stack = temp;
			temp = null;
			pushed = true;
		}
		_end = System.currentTimeMillis();
		System.out.println("The pushing lasted:  " + getExecuteTime());
		return pushed;
	}

	@Override
	public String top() {
		this._start = System.currentTimeMillis();
		String top  =  Integer.toString(stack[0]);
		this._end = System.currentTimeMillis();
		System.out.println("Top lasted:  " + getExecuteTime());
		return top;
	}

	@Override
	public boolean pop() {
		this._start = System.currentTimeMillis();
		boolean popped = false;
		if(isEmpty){
			this._end = System.currentTimeMillis();
			System.out.println("Top lasted:  " + getExecuteTime());
			return popped;
		}
		for (int i = 0; i < this.stack.length;i++){
			if ( stack[i + 1] == 0){
				stack [i] = 0;
				popped = true;
				break;
			}else{
				stack [i] = stack[i + 1];
				popped = true;
			}
		}
		this._end = System.currentTimeMillis();
		System.out.println("Top lasted:  " + getExecuteTime());
		return popped;
	}

	@Override
	public double getExecuteTime() {
		return this._end - this._start;
	}
	
	/**
	 * Checks if the element is already into the stack.
	 * @param pk
	 * @return true if the element exists.
	 */
	public boolean contains(K pk){
		boolean contains = false;
		
		if(isEmpty){
			return contains;
		}
		
		for (int i = 0 ; i < this.stack.length; i++){
			if (stack[i] == (Integer)pk){
				contains = true;
			}
		}
		return contains;
	}

}
