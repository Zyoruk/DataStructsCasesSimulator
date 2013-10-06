import java.util.ArrayList;

import listgenerator.NumGenerator;
import listgenerator.StackCreator;
import serializing.Stack;


public class StackCreatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumGenerator numGen = new NumGenerator();		
		ArrayList<Integer> temporal= numGen.generate(20);
		System.out.println("StackCreatorTester");
		StackCreator myNewStack = new StackCreator();
		Stack<Integer> Stack = myNewStack.creator(temporal);
		System.out.println(Stack.describe());
		System.out.println("#################################################");
	}

}
