package listgenerator;

import java.util.ArrayList;
/**
 * 
 * @author zyoruk
 * Creates an Arraylist that contains
 *
 */

public class NumGenerator {
	private ArrayList<Integer>randomnumbers;
	private int lenght;

	public NumGenerator(){
		this.randomnumbers = new ArrayList<Integer>();
	}

	public ArrayList<Integer> generate(int phowmanynumbers){
		double myDouble;
		int myInt;
		while (phowmanynumbers!=0){
			myDouble = Math.random() * ((phowmanynumbers + 1));//random number
			myInt = (int)myDouble;//casting to int.
			this.randomnumbers.add(myInt); //inserts my new number to the list
			phowmanynumbers--;
			this.lenght++;
		}
		return this.randomnumbers;
	}

	public int getLenght(){
		return this.lenght;
	}
}
