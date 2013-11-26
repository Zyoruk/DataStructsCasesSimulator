import trees.splay.SplayTree;




public class ST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SplayTree<Integer> tree = new SplayTree<Integer>();
			
		tree.insert(5);
		System.out.println(tree.getRoot().getData());
		
		tree.insert(4);			
		System.out.println(tree.getRoot().getData());
		
		tree.insert(6);
		System.out.println(tree.getRoot().getData());
		
		System.out.println("*****************");
		
		System.out.println(tree.getRoot().getRight().getData());
		System.out.println(tree.getRoot().getRight().getRight().getData());
		//System.out.println(tree.getRoot().getRight().getLeft().getData());
		
		//tree.describe();
		
		/*
		
		tree.insert(7);
		System.out.println(tree.getRoot().getData());
		
		tree.insert(3);
		System.out.println(tree.getRoot().getData());
		
		tree.insert(2);
		System.out.println(tree.getRoot().getData());
		
		tree.insert(8);
		System.out.println(tree.getRoot().getData());
		
		*/
			
	}

}
