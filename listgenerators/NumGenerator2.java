import simplelist.SimpleList;
import trees.binary.BinaryTree;


public class NumGenerator2 {
	
	private SimpleList<Integer> numbers;

	public BinaryTree<Integer> generateBinaryTree (int phowmanynumbers){
		int count = phowmanynumbers;
		BinaryTree<Integer> randomnumbers = new BinaryTree<Integer> ();

		while (count!=0){			
			numbers.append(ramdomNum(phowmanynumbers));
			count--;
		}
		for(int i = 0 ; i < numbers.length() ; i++){
			randomnumbers.insert((Integer) numbers.getRootData());
			numbers.delete();
		}		
		return randomnumbers;
	}
	
	private int ramdomNum(int phowmanynumbers){
		double myDouble = Math.random() * ((phowmanynumbers));//random number
		return (int)myDouble;
	}

}
