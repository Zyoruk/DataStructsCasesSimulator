package listgenerator;

import java.util.ArrayList;

import serializing.Stack;

public  class StackCreator{
	private static Stack<Integer> _myStack;
	
	public StackCreator(){
		StackCreator.set_myStack(new Stack<Integer>());
	}
	

	public Stack<Integer> creator(ArrayList<Integer> pNumbersToAdd){
		ArrayList<Integer> temp= pNumbersToAdd;
		int counter = pNumbersToAdd.size();
		while(temp.size()!=0){
			if (_myStack.length()!= counter){
				get_myStack().append(temp.remove(0));
			}else{
				break;
			}
		}
		temp = pNumbersToAdd;
		return _myStack;

	}


	public static Stack<Integer> get_myStack() {
		return _myStack;
	}


	public static void set_myStack(Stack<Integer> _myStack) {
		StackCreator._myStack = _myStack;
	}
}

