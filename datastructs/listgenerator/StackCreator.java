package listgenerator;

import serializing.Stack;
import simplelist.SimpleList;

public  class StackCreator{
	private static Stack<Integer> _myStack;
	
	public StackCreator(){
		StackCreator.set_myStack(new Stack<Integer>());
	}
	

	public Stack<Integer> creator(SimpleList<Integer> simpleList){
		SimpleList<Integer> temp= simpleList;
		int counter = simpleList.length();
		while(temp.length()!=0){
			if (_myStack.length()!= counter){
				get_myStack().append(temp.deleteHead());
			}else{
				break;
			}
		}
		temp = simpleList;
		return _myStack;

	}


	public static Stack<Integer> get_myStack() {
		return _myStack;
	}


	public static void set_myStack(Stack<Integer> _myStack) {
		StackCreator._myStack = _myStack;
	}
}

