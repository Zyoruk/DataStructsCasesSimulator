package listgenerator;

import java.util.ArrayList;

import serializing.Stack;

public class StackCreator{
	private Stack<Integer> _myStack;
	
	public StackCreator(){
		this._myStack = new Stack<Integer>();
	}
	

	public Stack<Integer> creator(ArrayList<Integer> pNumbersToAdd){
		while(pNumbersToAdd.size()!=0){
			_myStack.push(pNumbersToAdd.remove(0));
		}
		return this._myStack;
	}
}

