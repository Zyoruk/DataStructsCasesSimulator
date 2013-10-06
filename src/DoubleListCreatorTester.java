import java.util.ArrayList;

import listgenerator.DoubleListCreator;
import listgenerator.NumGenerator;
import doublelist.DoubleList;


public class DoubleListCreatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumGenerator numGen = new NumGenerator();		
		ArrayList<Integer> temporal= numGen.generate(20);
		System.out.println("DoubleListCreatorTester");
		DoubleListCreator myNewDoubleList = new DoubleListCreator();
		DoubleList<Integer> DoubleList = myNewDoubleList.creator(temporal);
		System.out.println(DoubleList.describe());
		System.out.println("#################################################");
	}

}
