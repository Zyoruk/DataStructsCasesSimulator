package listgenerator;
import simplelist.SimpleList;
import trees.binary.BinaryTree;


public class NumGenerator2 {
	
	private SimpleList<Integer> numbers;
	public NumGenerator2(){
		numbers = new SimpleList<Integer>();
	}
	public SimpleList<Integer> generateRandomSimpleList (int phowmanynumbers){
		int count = phowmanynumbers;
		while (count!=0){		
			int RNumb = randomNum(phowmanynumbers);
			if (!numbers.exists(RNumb)){
				numbers.append(RNumb);
				count--;
			}
		}
		return numbers;
	}
	
	private int randomNum(int phowmanynumbers){
		double myDouble = Math.random() * ((phowmanynumbers));//random number
		return (int)myDouble;
	}

}
