import trees.splay.SplayTree;


public class splayTree {

	public static void main(String args[]){
		
		SplayTree<Integer> ourST = new SplayTree<Integer>();
		ourST.insert(34);
		ourST.insert(45);
		ourST.insert(23);
		
		System.out.println(ourST.length());
		
		System.out.println(ourST.getRoot().getData());
		System.out.println(ourST.getRoot().getRight().getData());
	}
}
