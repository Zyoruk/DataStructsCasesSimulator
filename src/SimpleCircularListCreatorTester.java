import java.util.ArrayList;

import listgenerator.NumGenerator;
import listgenerator.SimpleCircularListCreator;
import simplelist.SimpleCircularList;


public class SimpleCircularListCreatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumGenerator numGen = new NumGenerator();		
		ArrayList<Integer> temporal= numGen.generate(20);
		System.out.println("SimpleCircularListCreatorTester");
		SimpleCircularListCreator myNewSimpleCircularList = 
												new SimpleCircularListCreator();
		SimpleCircularList<Integer> SimpleCircularList = 
									myNewSimpleCircularList.creator(temporal);
		System.out.println(SimpleCircularList.describe());
		System.out.println("#################################################");
	}

}
