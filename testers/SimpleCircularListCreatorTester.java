import listgenerator.NumGenerator;
import listgenerator.SimpleCircularListCreator;
import simplelist.SimpleCircularList;
import simplelist.SimpleList;


public class SimpleCircularListCreatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumGenerator numGen = new NumGenerator();		
		SimpleList<Integer> temporal= numGen.generate(20);
		System.out.println("SimpleCircularListCreatorTester");
		SimpleCircularListCreator myNewSimpleCircularList = 
												new SimpleCircularListCreator();
		SimpleCircularList<Integer> SimpleCircularList = 
									myNewSimpleCircularList.creator(temporal);
		System.out.println(SimpleCircularList.describe());
		System.out.println("#################################################");
	}

}
