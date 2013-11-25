import trees.splay.SplayTree;


public class splayTree {

	public static void main(String args[]){
		
		SplayTree<Integer> ourST = new SplayTree<Integer>();
		ourST.insert(34);
		ourST.insert(45);
		
		System.out.println(ourST.inorden().describe());
	}
}
