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
	
	private double myDouble=0;
	private int myInt=0;
	private SimpleList<Integer> numbers;
	
	public SimpleList<Integer> generateSimpleList(int phowmanynumbers){
		int count = phowmanynumbers;
		SimpleList<Integer> randomnumbers = new SimpleList<Integer> ();
		while (count!=0){	
			
			if (randomnumbers.length()!=0 && randomnumbers.exists(myInt)){
				while(randomnumbers.exists(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.append(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}

	public DoubleList<Integer> generateDoubleList(int phowmanynumbers){
		int count = phowmanynumbers;
		DoubleList<Integer> randomnumbers = new DoubleList<Integer> ();
		while (count!=0){	
			
			if (randomnumbers.length()!=0 && randomnumbers.exists(myInt)){
				while(randomnumbers.exists(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.append(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}
	
	public SimpleCircularList<Integer> generateSimpleCircularList(int phowmanynumbers){
		int count = phowmanynumbers;
		SimpleCircularList<Integer> randomnumbers = new SimpleCircularList<Integer> ();
		while (count!=0){	
			
			if (randomnumbers.length()!=0 && randomnumbers.exists(myInt)){
				while(randomnumbers.exists(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.append(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}
	
	public DoubleCircularList<Integer> generateDoubleCircularList(int phowmanynumbers){
		int count = phowmanynumbers;
		DoubleCircularList<Integer> randomnumbers = new DoubleCircularList<Integer> ();
		while (count!=0){	
			
			if (randomnumbers.length()!=0 && randomnumbers.exists(myInt)){
				while(randomnumbers.exists(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.append(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}
	
	public StackWithList<Integer> generateStackWithList(int phowmanynumbers){
		int count = phowmanynumbers;
		StackWithList<Integer> randomnumbers = new StackWithList<Integer> ();
		while (count!=0){	
			
			if (randomnumbers.length()!=0 && randomnumbers.exists(myInt)){
				while(randomnumbers.exists(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.append(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}
	
	public StackWithArray<Integer> generateStackWithArray(int phowmanynumbers){
		int count = phowmanynumbers;
		StackWithArray<Integer> randomnumbers = new StackWithArray<Integer> (phowmanynumbers);
		while (count!=0){	
			
			if (randomnumbers.length()!=0 && randomnumbers.contains(myInt)){
				while(randomnumbers.contains(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.push(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}
	
	public QueueWithList<Integer> generateQueueWithList(int phowmanynumbers){
		int count = phowmanynumbers;
		QueueWithList<Integer> randomnumbers = new QueueWithList<Integer> ();
		while (count!=0){	
			
			if (randomnumbers.length()!=0 && randomnumbers.exists(myInt)){
				while(randomnumbers.exists(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.append(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}
	
	public QueueWithArray<Integer> generateQueueWithArray(int phowmanynumbers){
		int count = phowmanynumbers;
		QueueWithArray<Integer> randomnumbers = new QueueWithArray<Integer> (phowmanynumbers);
		while (count!=0){	
			
			if (randomnumbers.length() != 0 && randomnumbers.contains(myInt)){
				while(randomnumbers.contains(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.Enqueue(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}
	
	public BiQueueWithList<Integer> generateBiQueueWithList(int phowmanynumbers){
		int count = phowmanynumbers;
		BiQueueWithList<Integer> randomnumbers = new BiQueueWithList<Integer> ();
		while (count!=0){	
			
			if (randomnumbers.length() != 0 && randomnumbers.exists(myInt)){
				while(randomnumbers.exists(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.Enqueue(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}
	
	public PriorityQueue<Integer> generatePriorityQueue (int phowmanynumbers){
		int count = phowmanynumbers;
		PriorityQueue<Integer> randomnumbers = new PriorityQueue<Integer> ();
		while (count!=0){	
			
			if (randomnumbers.length() != 0 && randomnumbers.exists(myInt)){
				while(randomnumbers.exists(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.Enqueue(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}
	
	public Array<Integer> generateArray (int phowmanynumbers){
		int count = phowmanynumbers;
		Array<Integer> randomnumbers = new Array<Integer> ();
		while (count!=0){	
			
			if (randomnumbers.length() != 0 && randomnumbers.exists(myInt)){
				while(randomnumbers.exists(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.add(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}
	
	public AVLTree<Integer> generateAVLTree (int phowmanynumbers){
		int count = phowmanynumbers;
		AVLTree<Integer> randomnumbers = new AVLTree<Integer> ();
		while (count!=0){	
			
			if (randomnumbers.length() != 0 && randomnumbers.exists(myInt)){
				while(randomnumbers.exists(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.insert(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}
	
	public BinaryTree<Integer> generateBinaryTree (int phowmanynumbers){
		int count = phowmanynumbers;
		BinaryTree<Integer> randomnumbers = new BinaryTree<Integer> ();
		while (count!=0){
			if (randomnumbers.length() != 0 && randomnumbers.exists(myInt)){	
				while(randomnumbers.exists(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.insert(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}
	
	public SplayTree<Integer> generateSplayTree (int phowmanynumbers){
		int count = phowmanynumbers;
		SplayTree<Integer> randomnumbers = new SplayTree<Integer> ();
		while (count!=0){	
			
			if (randomnumbers.length() != 0 && randomnumbers.exists(myInt)){
				while(randomnumbers.exists(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			numbers.append(myInt);
			randomnumbers.insert(myInt); //inserts my new number to the list
			count--;
		}
		return randomnumbers;
	}
	
	public SimpleList<Integer> getList(){
		return this.numbers;
	}
}
