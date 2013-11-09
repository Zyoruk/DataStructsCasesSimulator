import simplelist.SimpleList;
import listgenerator.NumGenerator;
import listgenerator.SimpleListCreator;


public class SimpleListCreatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumGenerator numGen = new NumGenerator();		
		SimpleList<Integer> temporal= numGen.generate(20);
		System.out.println("SimpleListCreatorTester");
		SimpleListCreator myNewSimpleList = new SimpleListCreator();
		SimpleList<Integer> simplelist = myNewSimpleList.creator(temporal);
		System.out.println(simplelist.describe());
		System.out.println("#################################################");
	}

}
