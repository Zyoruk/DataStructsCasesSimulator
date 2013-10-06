import java.util.ArrayList;

import listgenerator.NumGenerator;
import listgenerator.QueueCreator;
import serializing.Queue;


public class QueueCreatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumGenerator numGen = new NumGenerator();		
		ArrayList<Integer> temporal= numGen.generate(20);
		System.out.println("QueueCreatorTester");
		QueueCreator myNewQueue = new QueueCreator();
		Queue<Integer> Queue = myNewQueue.creator(temporal);
		System.out.println(Queue.describe());
		System.out.println("#################################################");
	}

}
