import trees.splay.SplayTree;


public class splayTree {

	public static void main(String args[]){
		
		SplayTree<Integer> ourST = new SplayTree<Integer>();
		ourST.insert(34);
//		System.out.println(ourST.getRoot().getData());
		ourST.insert(45);
//		System.out.println(ourST.getRoot().getData());
		
		ourST.insert(23);
		
		ourST.insert(66);
		System.out.println(ourST.getRoot().getData());
		
		System.out.println(ourST.getRoot().getRight().getData());
//		ourST.insert(23);
//		ourST.insert(34);

	}
}
