import listgenerator.NumGenerator;
import listgenerator.QueueCreator;
import serializing.Queue;
import simplelist.SimpleList;


public class QueueCreatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NumGenerator numGen = new NumGenerator();		
		SimpleList<Integer> temporal= numGen.generate(20);
		System.out.println("QueueCreatorTester");
		QueueCreator myNewQueue = new QueueCreator();
		Queue<Integer> Queue = myNewQueue.creator(temporal);
		System.out.println(Queue.describe());
		System.out.println("#################################################");
	}

}
