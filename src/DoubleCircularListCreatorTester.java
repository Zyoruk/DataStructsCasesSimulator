import java.util.ArrayList;

import listgenerator.DoubleCircularListCreator;
import listgenerator.NumGenerator;
import doublelist.DoubleCircularList;


public class DoubleCircularListCreatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumGenerator numGen = new NumGenerator();		
		ArrayList<Integer> temporal= numGen.generate(20);
		System.out.println("DoubleCircularListCreatorTester");
		DoubleCircularListCreator myNewDoubleCircularList = 
												new DoubleCircularListCreator();
		DoubleCircularList<Integer> CircularList = 
									myNewDoubleCircularList.creator(temporal);
		System.out.println(CircularList.describe());
		System.out.println("#################################################");
	}

}
