import simplelist.SimpleList;

import listgenerator.DoubleCircularListCreator;
import listgenerator.NumGenerator;
import doublelist.DoubleCircularList;


public class DoubleCircularListCreatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumGenerator numGen = new NumGenerator();		
		SimpleList<Integer> temporal= numGen.generate(20);
		System.out.println("DoubleCircularListCreatorTester");
		DoubleCircularListCreator myNewDoubleCircularList = 
												new DoubleCircularListCreator();
		DoubleCircularList<Integer> CircularList = 
									myNewDoubleCircularList.creator(temporal);
		System.out.println(CircularList.describe());
		System.out.println("#################################################");
		
	}

}
