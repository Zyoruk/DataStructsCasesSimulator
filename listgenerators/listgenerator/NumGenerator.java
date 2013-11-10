package listgenerator;

import queue.QueueWithArray;
import queue.QueueWithList;
import doublelist.DoubleCircularList;
import doublelist.DoubleList;
import simplelist.SimpleCircularList;
import simplelist.SimpleList;
import stack.StackWithArray;
import stack.StackWithList;
/**
 * 
 * @author zyoruk
 * Creates an Arraylist that contains x quantity of different integers.
 *
 */

public class NumGenerator {
	
	private int lenght;
	private double myDouble=0;
	private int myInt=0;
	
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
			
			randomnumbers.append(myInt); //inserts my new number to the list
			count--;
			this.lenght++;
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
			
			randomnumbers.append(myInt); //inserts my new number to the list
			count--;
			this.lenght++;
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
			
			randomnumbers.append(myInt); //inserts my new number to the list
			count--;
			this.lenght++;
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
			
			randomnumbers.append(myInt); //inserts my new number to the list
			count--;
			this.lenght++;
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
			
			randomnumbers.append(myInt); //inserts my new number to the list
			count--;
			this.lenght++;
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
			
			randomnumbers.push(myInt); //inserts my new number to the list
			count--;
			this.lenght++;
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
			
			randomnumbers.append(myInt); //inserts my new number to the list
			count--;
			this.lenght++;
		}
		return randomnumbers;
	}
	
	public QueueWithArray<Integer> generateQueueWithArray(int phowmanynumbers){
		int count = phowmanynumbers;
		QueueWithArray<Integer> randomnumbers = new QueueWithArray<Integer> (phowmanynumbers);
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
			
			randomnumbers.Enqueue(myInt); //inserts my new number to the list
			count--;
			this.lenght++;
		}
		return randomnumbers;
	}
	

	public int getLenght(){
		return this.lenght;
	}
}
