import trees.binary.BinaryTree;


public class binaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree<Integer> newBT = new BinaryTree<Integer>();
		newBT.insert(5);
		newBT.insert(2);
		newBT.insert(8);
		newBT.insert(1);
		newBT.insert(3);
		newBT.insert(6);
		newBT.insert(9);

		System.out.println(newBT.describe());
		
		newBT.delete(8);
		
		System.out.println(newBT.describe());
		
		newBT.delete(80);
		
		/*
		newBT.delete(3);
		System.out.println(newBT.describe());
		
		newBT.delete(5);
		System.out.println(newBT.describe());
		*/

	}

}
