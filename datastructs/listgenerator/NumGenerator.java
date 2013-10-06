package listgenerator;

import java.util.ArrayList;
/**
 * 
 * @author zyoruk
 * Creates an Arraylist that contains x quantity of different integers.
 *
 */

public class NumGenerator {
	private ArrayList<Integer>randomnumbers;
	private int lenght;
	private double myDouble=0;
	private int myInt=0;
	
	public NumGenerator(){
		this.randomnumbers = new ArrayList<Integer>();
	}

	public ArrayList<Integer> generate(int phowmanynumbers){
		int count = phowmanynumbers;
		
		while (count!=0){	
			
			if (randomnumbers.size()!=0 && randomnumbers.contains(myInt)){
				while(randomnumbers.contains(myInt)){
					this.myDouble = Math.random() * ((phowmanynumbers + 1));//random number
					this.myInt = (int)myDouble;//casting to int.
				}
			}else{
				this.myDouble = Math.random() * ((phowmanynumbers + 1));//random number
				this.myInt = (int)myDouble;//casting to int.
			}
			
			this.randomnumbers.add(myInt); //inserts my new number to the list
			count--;
			this.lenght++;
		}
		return this.randomnumbers;
	}

	public int getLenght(){
		return this.lenght;
	}
}
