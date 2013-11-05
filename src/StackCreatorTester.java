import listgenerator.NumGenerator;
import listgenerator.StackCreator;
import serializing.Stack;
import simplelist.SimpleList;


public class StackCreatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long start , end;
		NumGenerator numGen = new NumGenerator();		
		SimpleList<Integer> temporal= numGen.generate(10000);
		System.out.println("StackCreatorTester");
		start = System.currentTimeMillis();
		StackCreator myNewStack = new StackCreator();
		Stack<Integer> Stack = myNewStack.creator(temporal);
		end = System.currentTimeMillis();
		System.out.println(Stack.describe());
		System.out.println("Started  "+start +"  Ended  "+ end +"  LAsted  "+ (end - start));	
		
	}

}
