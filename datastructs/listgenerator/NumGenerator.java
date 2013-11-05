package listgenerator;

import simplelist.SimpleList;
/**
 * 
 * @author zyoruk
 * Creates an Arraylist that contains x quantity of different integers.
 *
 */

public class NumGenerator {
	private SimpleList<Integer> randomnumbers;
	private int lenght;
	private double myDouble=0;
	private int myInt=0;
	
	public NumGenerator(){
		this.randomnumbers = new SimpleList<Integer>();
	}

	public SimpleList<Integer> generate(int phowmanynumbers){
		int count = phowmanynumbers;
		
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
			
			this.randomnumbers.append(myInt); //inserts my new number to the list
			count--;
			this.lenght++;
		}
		return this.randomnumbers;
	}

	public int getLenght(){
		return this.lenght;
	}
}
