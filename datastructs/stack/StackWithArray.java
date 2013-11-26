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

	private int[] stack;
	private int index;

	
	//Constructor
	public StackWithArray(int size){
        if (size <= 0)

            throw new IllegalArgumentException("Stack's capacity must be positive");
		this.stack = new int[size];
		this.index = -1;
	}
	
	@Override
	public boolean push(K pk) {
		if (index == this.stack.length){
			resize();
		}
		index++;
		this.stack[index] = (Integer) pk;
		return true;
	}

	@Override
	public String top() {
		String top  =  Integer.toString(stack[index]);
		return top;
	}

	@Override
	public boolean pop() {
//		this._start = System.currentTimeMillis();
		boolean popped = false;
		if (!(isEmpty())){
			index --;
			popped = true;
		}		
//		this._end = System.currentTimeMillis();
//		System.out.println("Top lasted:  " + getExecuteTime());
		return popped;
	}

//	@Override
//	public double getExecuteTime() {
//		return this._end - this._start;
//	}
	
	/**
	 * Checks if the element is already into the stack.
	 * @param pk
	 * @return true if the element exists.
	 */
	public boolean contains(K pk){
		boolean contains = false;
		
		if(isEmpty()){
			return contains;
		}
		
		for (int i = 0 ; i < this.stack.length; i++){
			if (stack[i] == (Integer)pk){
				contains = true;
			}
		}
		return contains;
	}
	
	public int length(){
		return this.stack.length;
	}
	
	public String describe(){
        StringBuilder result = new StringBuilder();

        result.append("List: ");
        for(int i = 0; i < this.stack.length;i++) {
            result.append(String.format("%s ", Integer.toString(stack[i])));
        }
        result.append("\n");

        result.append(String.format("Length: %d\n", this.stack.length));
        return result.toString();
		
	}

	@Override
	public boolean isEmpty() {
		return index == -1;
	}

	@Override
	public boolean exists(K pk) {
		boolean exists = false;
		for (int i = 0; i < this.stack.length;i++){
			if (this.stack[i] == (Integer)pk){
				exists = true;
			}
		}
		return exists;
	}

	private void resize(){
		int [] temp = new int [ (int)(this.stack.length + 
								(this.stack.length *40)/100) ];
		for (int i = 0 ; i < this.stack.length; i ++){
			temp[i] = this.stack[i];
		}
		this.stack = temp;
	}
}
