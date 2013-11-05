import interfaces.ListInterface;
import listgenerator.DataStructureChoose;


public class DataStructChooserTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataStructureChoose test = new DataStructureChoose ("DoubleList", 20);
		ListInterface<Integer> newStruct = test.createDataStructure();
		System.out.println(test.getStructureKind());
		System.out.println(newStruct.describe());
		


	}

}
