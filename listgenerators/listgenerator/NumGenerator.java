package listgenerator;

import array.Array;
import queue.BiQueueWithList;
import queue.PriorityQueue;
import queue.QueueWithArray;
import queue.QueueWithList;
import doublelist.DoubleCircularList;
import doublelist.DoubleList;
import simplelist.SimpleCircularList;
import simplelist.SimpleList;
import stack.StackWithArray;
import stack.StackWithList;
import trees.avl.AVLTree;
import trees.binary.BinaryTree;
import trees.splay.SplayTree;
/**
 * 
 * @author zyoruk
 * Creates an Arraylist that contains x quantity of different integers.
 *
 */

public class NumGenerator {
	
	public SimpleList<Integer> generateSimpleList(int phowmanynumbers){
		NumGenerator2 numGen = new NumGenerator2();
		SimpleList<Integer> randomnumbers = numGen.generateRandomSimpleList(phowmanynumbers);
		return randomnumbers;
	}

	public DoubleList<Integer> generateDoubleList(int phowmanynumbers){
		DoubleList<Integer> randomnumbers = new DoubleList<Integer> ();
		NumGenerator2 numGen = new NumGenerator2();
		for (Integer k : numGen.generateRandomSimpleList(phowmanynumbers)){
			randomnumbers.insert(k); //inserts my new number to the list
		}
		return randomnumbers;
	}
	
	public SimpleCircularList<Integer> generateSimpleCircularList(int phowmanynumbers){
		SimpleCircularList<Integer> randomnumbers = new SimpleCircularList<Integer> ();
		NumGenerator2 numGen = new NumGenerator2();
		for (Integer k : numGen.generateRandomSimpleList(phowmanynumbers)){
			randomnumbers.append(k); //inserts my new number to the list
		}
		return randomnumbers;
	}
	
	public DoubleCircularList<Integer> generateDoubleCircularList(int phowmanynumbers){
		DoubleCircularList<Integer> randomnumbers = new DoubleCircularList<Integer> ();
		NumGenerator2 numGen = new NumGenerator2();
		for (Integer k : numGen.generateRandomSimpleList(phowmanynumbers)){
			randomnumbers.append(k); //inserts my new number to the list
		}
		return randomnumbers;
	}
	
	public StackWithList<Integer> generateStackWithList(int phowmanynumbers){
		StackWithList<Integer> randomnumbers = new StackWithList<Integer> ();
		NumGenerator2 numGen = new NumGenerator2();
		for (Integer k : numGen.generateRandomSimpleList(phowmanynumbers)){
			randomnumbers.push(k); //inserts my new number to the list
		}
		return randomnumbers;
	}
	
	public StackWithArray<Integer> generateStackWithArray(int phowmanynumbers){
		StackWithArray<Integer> randomnumbers = new StackWithArray<Integer> (phowmanynumbers);
		NumGenerator2 numGen = new NumGenerator2();
		for (Integer k : numGen.generateRandomSimpleList(phowmanynumbers)){
			randomnumbers.push(k); //inserts my new number to the list
		}
		return randomnumbers;
	}
	
	public QueueWithList<Integer> generateQueueWithList(int phowmanynumbers){
		QueueWithList<Integer> randomnumbers = new QueueWithList<Integer> ();
		NumGenerator2 numGen = new NumGenerator2();
		for (Integer k : numGen.generateRandomSimpleList(phowmanynumbers)){
			randomnumbers.Enqueue(k); //inserts my new number to the list
		}
		return randomnumbers;
	}
	
	public QueueWithArray<Integer> generateQueueWithArray(int phowmanynumbers){
		QueueWithArray<Integer> randomnumbers = new QueueWithArray<Integer> (phowmanynumbers);
		NumGenerator2 numGen = new NumGenerator2();
		for (Integer k : numGen.generateRandomSimpleList(phowmanynumbers)){
			randomnumbers.Enqueue(k); //inserts my new number to the list
		}
		return randomnumbers;
	}
	
	public BiQueueWithList<Integer> generateBiQueueWithList(int phowmanynumbers){
		BiQueueWithList<Integer> randomnumbers = new BiQueueWithList<Integer> ();
		NumGenerator2 numGen = new NumGenerator2();
		for (Integer k : numGen.generateRandomSimpleList(phowmanynumbers)){
			randomnumbers.Enqueue(k); //inserts my new number to the list
		}
		return randomnumbers;
	}
	
	public PriorityQueue<Integer> generatePriorityQueue (int phowmanynumbers){
		PriorityQueue<Integer> randomnumbers = new PriorityQueue<Integer> ();
		NumGenerator2 numGen = new NumGenerator2();
		for (Integer k : numGen.generateRandomSimpleList(phowmanynumbers)){
			randomnumbers.Enqueue(k, 1); //inserts my new number to the list
		}
		return randomnumbers;
	}
	
	public Array<Integer> generateArray (int phowmanynumbers){
		Array<Integer> randomnumbers = new Array<Integer> ();
		NumGenerator2 numGen = new NumGenerator2();
		for (Integer k : numGen.generateRandomSimpleList(phowmanynumbers)){
			randomnumbers.add(k); //inserts my new number to the list
		}
		return randomnumbers;
	}
	
	public AVLTree<Integer> generateAVLTree (int phowmanynumbers){

		AVLTree<Integer> randomnumbers = new AVLTree<Integer> ();
		NumGenerator2 numGen = new NumGenerator2();
		for (Integer k : numGen.generateRandomSimpleList(phowmanynumbers)){
			randomnumbers.insert(k); //inserts my new number to the list
		}
		return randomnumbers;
	}
	
	public BinaryTree<Integer> generateBinaryTree (int phowmanynumbers){
		BinaryTree<Integer> randomnumbers = new BinaryTree<Integer> ();
		NumGenerator2 numGen = new NumGenerator2();
		for (Integer k : numGen.generateRandomSimpleList(phowmanynumbers)){
			randomnumbers.insert(k); //inserts my new number to the list
		}
		return randomnumbers;
	}
	
	public SplayTree<Integer> generateSplayTree (int phowmanynumbers){
		SplayTree<Integer> randomnumbers = new SplayTree<Integer> ();
		NumGenerator2 numGen = new NumGenerator2();
		for (Integer k : numGen.generateRandomSimpleList(phowmanynumbers)){
			randomnumbers.insert(k); //inserts my new number to the list
		}
		return randomnumbers;
	}
}
