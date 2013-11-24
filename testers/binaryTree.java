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
		System.out.println(newBT.getRoot().getData());
		System.out.println(newBT.getRoot().getLeft().getData());
		System.out.println(newBT.getRoot().getRight().getData());
//		System.out.println(newBT.inorden().describe());
//		System.out.println(newBT.postorden().describe());
//		System.out.println(newBT.preorden().describe());

	}

}
