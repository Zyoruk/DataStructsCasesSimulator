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
		
		/*
		System.out.println(newBT.getRoot().getLeft().getLeft().getData());
		System.out.println(newBT.getRoot().getLeft().getRight().getData());
		System.out.println(newBT.getRoot().getRight().getLeft().getData());
		System.out.println(newBT.getRoot().getRight().getRight().getData());
		*/

		System.out.println(newBT.describe());


	}

}
