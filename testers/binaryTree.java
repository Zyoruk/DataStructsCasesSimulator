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
		
		System.out.println("***************************");

		System.out.println(newBT.describe());
		
		System.out.println("***************************");
		
		newBT.delete(8);
		
		System.out.println("***************************");

		System.out.println(newBT.describe());
		
		System.out.println("***************************");
		
		newBT.delete(1);
		
		System.out.println("***************************");
		
		System.out.println(newBT.describe());
		
		System.out.println("***************************");
		
		if(newBT.exists(43)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		System.out.println(newBT.describe());
		
		System.out.println("***************************");
		
		if(newBT.exists(5)){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		System.out.println(newBT.describe());
		
		System.out.println("***************************");

	}

}
