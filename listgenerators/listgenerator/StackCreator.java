package listgenerator;

import simplelist.SimpleList;
import stack.StackWithList;

public  class StackCreator{
	private static StackWithList<Integer> _myStack;
	
	public StackCreator(){
		StackCreator.set_myStack(new StackWithList<Integer>());
	}
	

	public StackWithList<Integer> creator(SimpleList<Integer> simpleList){
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


	public static StackWithList<Integer> get_myStack() {
		return _myStack;
	}


	public static void set_myStack(StackWithList<Integer> _myStack) {
		StackCreator._myStack = _myStack;
	}
}

