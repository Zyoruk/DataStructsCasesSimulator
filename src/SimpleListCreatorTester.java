import java.util.ArrayList;
import simplelist.SimpleList;
import listgenerator.NumGenerator;
import listgenerator.SimpleListCreator;


public class SimpleListCreatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("NumGeneratorTest");
		NumGenerator numGen = new NumGenerator();		
		ArrayList<Integer> temporal= numGen.generate(20);
		for (int i = 0 ;i<temporal.size();i++){
			System.out.print(temporal.get(i)+"  ");
		}
		System.out.println("");
		System.out.println("#################################################");


		System.out.println("SimpleListCreatorTester");
		SimpleListCreator myNewSimpleList = new SimpleListCreator();
		SimpleList<Integer> simplelist = myNewSimpleList.creator(temporal);
		System.out.println(simplelist.describe());
		System.out.println("#################################################");
	}

}
