import trees.binary.BinaryTree;


public class binaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree<Integer> newBT = new BinaryTree<Integer>();
		newBT.insert(2);
		newBT.insert(1);
		newBT.insert(3);

		System.out.println(newBT.describe());


	}

}
