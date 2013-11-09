import simplelist.SimpleList;

import listgenerator.DoubleListCreator;
import listgenerator.NumGenerator;
import doublelist.DoubleList;


public class DoubleListCreatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumGenerator numGen = new NumGenerator();		
		SimpleList<Integer> temporal= numGen.generate(20);
		System.out.println("DoubleListCreatorTester");
		DoubleListCreator myNewDoubleList = new DoubleListCreator();
		DoubleList<Integer> DoubleList = myNewDoubleList.creator(temporal);
		System.out.println(DoubleList.describe());
		System.out.println("#################################################");
	}

}
