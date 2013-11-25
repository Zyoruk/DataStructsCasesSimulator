package interact;

import java.util.InputMismatchException;
import java.util.Scanner;

import array.Array;

import queue.BiQueueWithList;
import queue.QueueWithArray;
import queue.QueueWithList;

import simplelist.SimpleCircularList;
import simplelist.SimpleList;
import stack.StackWithArray;
import stack.StackWithList;
import trees.avl.AVLTree;
import trees.binary.BinaryTree;
import trees.splay.SplayTree;

import doublelist.DoubleCircularList;
import doublelist.DoubleList;

import listgenerator.DataStructureChoose;

public class Simulator {

	/**
	 * @param args
	 */
	static int choose;
	static int size;
	static String exit;
	static Scanner in = new Scanner(System.in);
	private static long start;
	private static long end;
	
	public static void main(String[] args) {
		System.out.println("Welcome to the structure performance simulator");
		System.out.println("Please, choose which option you want to simulate");
		System.out.println("1. Simple Linked list with Double Linked list");
		System.out.println("2. Simple  Linked Circular List with Double  Linked Circular List");
		System.out.println("3. AVL with Splay");
		System.out.println("4. Splay with Binary");
		System.out.println("5. AVL with Binary");
		System.out.println("6. Queue implemented with list and with array");
		System.out.println("7. Stack implemented with list and with array");
		System.out.println("8. Biqueue");
		System.out.println("9. Array with Simple List");
		System.out.println("10. Array with Double List");
		System.out.println("11. Array with Simple Circular List");
		System.out.println("12. Array with Double Circular List");
		menu();
	}
	
	private static void menu(){
		System.out.println("Write the option number:");
		try{
			choose = in.nextInt();
			System.out.println("Please, now enter how large you want the structure to be (larger than 1 less than 100 000): ");
			size = in.nextInt();
			switch (choose) {
				case 1:
				test1();
				break;
				case 2:  choose = 2;
				test2();
				break;
				case 3:  choose = 3;
				test3();
				break;
				case 4:  choose = 4;
				test4();
				break;
				case 5:  choose = 5;
				test5();
				break;
				case 6:  choose = 6;
				test6();
				break;
				case 7:  choose = 7;
				test7();
				break;
				case 8:  choose = 8;
				test8();
				break;
				case 9:  choose = 9;
				test9();
				break;
				case 10: choose = 10;
				test10();
				break;
				case 11: choose = 11;
				test11();
				break;
				case 12: choose = 12;
				test12();
				break;
			}
			System.out.println("Do you want to exit?");
			exit = in.next();
			switch(exit){
				case "No":
					menu();
					break;
				case "Yes":
					break;
				default:
					menu();
					break;
			}
		}catch(Exception e){
			System.out.println("Do you want to exit?");
			exit = in.next();
			switch(exit){
			case "No":
				menu();
				break;
			case "Yes":
				break;
			}
		}
	}
	private static void test1(){
		System.out.println("Start of the test");
		System.out.println("The test will add the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one");
		
		DataStructureChoose test = 
				new DataStructureChoose ("DoubleList", Simulator.size);
		
		System.out.println("Creating Double List with: " + Simulator.size + "Elements");
		DoubleList<Integer> newDoubleList = 
				(DoubleList<Integer>) test.createDataStructure();
		newDoubleList = (DoubleList<Integer>) newDoubleList;

		start = System.nanoTime();
		newDoubleList.insert(89);
		end = System.nanoTime();
		System.out.println("Adding at the beginning lasted: " + (end - start) + "nano seconds");
		
		start = System.nanoTime();
		newDoubleList.append(245);
		end = System.nanoTime();
		System.out.println("Adding at the end lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		newDoubleList.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		newDoubleList.delete();
		end = System.nanoTime();
		System.out.println("Deleting the first element lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		newDoubleList.cut();
		end = System.nanoTime();
		System.out.println("Deleting the end " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		newDoubleList.delete(45);
		end = System.nanoTime();
		System.out.println("Deleting a node lasted: " + (end - start)+ "nano seconds");
		
		System.out.println("Creating Simple List with: " + Simulator.size + "Elements");
		test.setStructKind("SimpleList");
		SimpleList<Integer> newSimpleList = 
				(SimpleList<Integer>) test.createDataStructure();
		
		start = System.nanoTime();
		newSimpleList.insert(567);
		end = System.nanoTime();
		System.out.println("adding at the beginning lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		newSimpleList.append(2234);
		end = System.nanoTime();
		System.out.println("Adding at the end lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		newSimpleList.exists(799);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		newSimpleList.delete();
		end = System.nanoTime();
		System.out.println("Deleting the first element lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		newSimpleList.cut();
		end = System.nanoTime();
		System.out.println("Deleting the last element lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		newSimpleList.delete(75);
		end = System.nanoTime();
		System.out.println("Deleting a node lasted: " + (end - start)+ "nano seconds");
		
	}
	private static void test2(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one");
		
		DataStructureChoose test = 
				new DataStructureChoose ("DoubleCircularList", Simulator.size);
		
		System.out.println("Creating Double Circular List with: " + Simulator.size + "Elements");
		DoubleCircularList<Integer> newDoubleCircularList = 
				(DoubleCircularList<Integer>) test.createDataStructure();
		newDoubleCircularList = (DoubleCircularList<Integer>) newDoubleCircularList;

		
		start = System.nanoTime();
		newDoubleCircularList.append(54);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start) + "nano seconds");
		
		start = System.nanoTime();
		newDoubleCircularList.exists(965);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start) + "nano seconds");
		
		start = System.nanoTime();
		newDoubleCircularList.delete(98);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start) + "nano seconds");
		
		System.out.println("Creating Simple Circular List with: " + Simulator.size + "Elements");
		test.setStructKind("SimpleCircularList");
		SimpleCircularList<Integer> newSimpleCircularList = 
				(SimpleCircularList<Integer>) test.createDataStructure();
		
		start = System.nanoTime();
		newSimpleCircularList.insert(10);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newSimpleCircularList.exists(34);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		newSimpleCircularList.delete(76);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds");
	}
	
	private static void test3(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one");
		
		DataStructureChoose test = 
				new DataStructureChoose ("AVLTree", Simulator.size);
		
		System.out.println("Creating AVL Tree with: " + Simulator.size + "Elements");
		AVLTree<Integer> ourAVLTree = 
				(AVLTree<Integer>) test.createDataStructure();
		ourAVLTree = (AVLTree<Integer>) ourAVLTree;
		
		start = System.nanoTime();
		ourAVLTree.insert(34);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourAVLTree.exists(9);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start) + "nano seconds");

		start = System.nanoTime();
		ourAVLTree.delete(753);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start) + "nano seconds");
		
		System.out.println("Creating Splay Tree: " + Simulator.size + "Elements");
		test.setStructKind("SplayTree");
		SplayTree<Integer> newSplayTree = 
				(SplayTree<Integer>) test.createDataStructure();

		start = System.nanoTime();
		newSplayTree.insert(142);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		newSplayTree.exists(435);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newSplayTree.delete(642);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds");
	}
	
	private static void test4(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one");
		
		DataStructureChoose test = 
				new DataStructureChoose ("SplayTree", Simulator.size);
		
		System.out.println("Creating Splay Tree with: " + Simulator.size + "Elements");
		SplayTree<Integer> ourSplayTree = 
				(SplayTree<Integer>) test.createDataStructure();
		ourSplayTree = (SplayTree<Integer>) ourSplayTree;
		
		start = System.nanoTime();
		ourSplayTree.insert(87);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		ourSplayTree.exists(12);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourSplayTree.delete(97);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds");
		
		System.out.println("Creating Splay Tree: " + Simulator.size + "Elements");
		test.setStructKind("BinaryTree");
		BinaryTree<Integer> newBinaryTree = 
				(BinaryTree<Integer>) test.createDataStructure();

		start = System.nanoTime();
		newBinaryTree.insert(53);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newBinaryTree.exists(23);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newBinaryTree.delete(65);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds");
	}
	
	private static void test5(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one");
		
		DataStructureChoose test = 
				new DataStructureChoose ("AVLTree", Simulator.size);
		
		System.out.println("Creating Splay Tree with: " + Simulator.size + "Elements");
		AVLTree<Integer> ourAVLTree = 
				(AVLTree<Integer>) test.createDataStructure();
		ourAVLTree = (AVLTree<Integer>) ourAVLTree;
		
		start = System.nanoTime();
		ourAVLTree.insert(123);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourAVLTree.exists(431);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourAVLTree.delete(612);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds");
		
		System.out.println("Creating Splay Tree: " + Simulator.size + "Elements");
		test.setStructKind("BinaryTree");
		BinaryTree<Integer> newBinaryTree = 
				(BinaryTree<Integer>) test.createDataStructure();

		start = System.nanoTime();
		newBinaryTree.insert(14);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newBinaryTree.exists(345);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newBinaryTree.delete(75);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds");
	}
	private static void test6(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one");
		
		DataStructureChoose test = 
				new DataStructureChoose ("QueueWithArray", Simulator.size);
		
		System.out.println("Creating Queue with array: " + Simulator.size + "Elements");
		QueueWithArray<Integer> ourQWA = 
				(QueueWithArray<Integer>) test.createDataStructure();
		ourQWA = (QueueWithArray<Integer>) ourQWA;

		start = System.nanoTime();
		ourQWA.Enqueue(4);
		end = System.nanoTime();
		System.out.println("Enqueueing lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourQWA.Dequeue();
		end = System.nanoTime();
		System.out.println("Dequeueing lasted: " + (end - start)+ "nano seconds");
		
		System.out.println("Creating Queue with List: " + Simulator.size + "Elements");
		test.setStructKind("QueueWithList");
		QueueWithList<Integer> ourQWL = 
				(QueueWithList<Integer>) test.createDataStructure();

		start = System.nanoTime();
		ourQWL.Enqueue(89);
		end = System.nanoTime();
		System.out.println("Enqueueing lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourQWL.Dequeue();
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds");
	}
	
	private static void test7(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one");
		
		DataStructureChoose test = 
				new DataStructureChoose ("StackWithArray", Simulator.size);
		
		System.out.println("Creating Queue with array: " + Simulator.size + "Elements");
		StackWithArray<Integer> ourSWA = 
				(StackWithArray<Integer>) test.createDataStructure();
		ourSWA = (StackWithArray<Integer>) ourSWA;
		
		start = System.nanoTime();
		ourSWA.push(234);
		end = System.nanoTime();
		System.out.println("Push lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		ourSWA.pop();
		end = System.nanoTime();
		System.out.println("Pop lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		ourSWA.top();
		end = System.nanoTime();
		System.out.println("Top lasted: " + (end - start)+ "nano seconds");
		
		System.out.println("Creating Queue with List: " + Simulator.size + "Elements");
		test.setStructKind("StackWithList");
		StackWithList<Integer> ourQWL = 
				(StackWithList<Integer>) test.createDataStructure();

		start = System.nanoTime();
		ourQWL.push(54);
		end = System.nanoTime();
		System.out.println("Push lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		ourQWL.top();
		end = System.nanoTime();
		System.out.println("Top lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourQWL.pop();
		end = System.nanoTime();
		System.out.println("Pop lasted: " + (end - start)+ "nano seconds");
	}
	
	public static void test8(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one");
		
		DataStructureChoose test = 
				new DataStructureChoose ("BiqueueWithList", Simulator.size);
		
		System.out.println("Creating Queue with array: " + Simulator.size + "Elements");
		BiQueueWithList<Integer> ourBQWL = 
				(BiQueueWithList<Integer>) test.createDataStructure();
		ourBQWL = (BiQueueWithList<Integer>) ourBQWL;
		
		start = System.nanoTime();
		ourBQWL.insert(13);
		end = System.nanoTime();
		System.out.println("Inserting at the beginning: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		ourBQWL.Dequeue();
		end = System.nanoTime();
		System.out.println("Deleting the beginning lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourBQWL.InsertAtEnd(345);
		end = System.nanoTime();
		System.out.println("Insert at the end lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourBQWL.cut();
		end = System.nanoTime();
		System.out.println("Deleting the last lasted: " + (end - start)+ "nano seconds");
	}
	public static void test9(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one");
		
		DataStructureChoose test = 
				new DataStructureChoose ("Array", Simulator.size);
		
		System.out.println("Creating array: " + Simulator.size + "Elements");
		Array<Integer> ourArray = 
				(Array<Integer>) test.createDataStructure();
		ourArray = (Array<Integer>) ourArray;

		start = System.nanoTime();
		ourArray.append(193);
		end = System.nanoTime();
		System.out.println("Add lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourArray.delete(780);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourArray.search(3677);
		end = System.nanoTime();
		System.out.println("Search lasted: " + (end - start)+ "nano seconds");
		
		System.out.println("Creating Simple List with: " + Simulator.size + "Elements");
		test.setStructKind("SimpleList");
		SimpleList<Integer> newSimpleList = 
				(SimpleList<Integer>) test.createDataStructure();

		start = System.nanoTime();
		newSimpleList.append(12314);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newSimpleList.exists(9134);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newSimpleList.delete(345);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds");
	}
	
	public static void test10(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one");
		
		DataStructureChoose test = 
				new DataStructureChoose ("Array", Simulator.size);
		
		System.out.println("Creating array: " + Simulator.size + "Elements");
		Array<Integer> ourArray = 
				(Array<Integer>) test.createDataStructure();
		ourArray = (Array<Integer>) ourArray;
		
		start = System.nanoTime();
		ourArray.append(34);
		end = System.nanoTime();
		System.out.println("Add lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourArray.delete(435);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourArray.search(976);
		end = System.nanoTime();
		System.out.println("Search lasted: " + (end - start)+ "nano seconds");
		
		System.out.println("Creating Double List with: " + Simulator.size + "Elements");
		test.setStructKind("DoubleList");
		DoubleList<Integer> newDoubleList = 
				(DoubleList<Integer>) test.createDataStructure();

		start = System.nanoTime();
		newDoubleList.append(19);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newDoubleList.exists(29);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newDoubleList.delete(37);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds");
	}
	
	public static void test12(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one");
		
		DataStructureChoose test = 
				new DataStructureChoose ("Array", Simulator.size);
		
		System.out.println("Creating array: " + Simulator.size + "Elements");
		Array<Integer> ourArray = 
				(Array<Integer>) test.createDataStructure();
		ourArray = (Array<Integer>) ourArray;

		start = System.nanoTime();
		ourArray.append(476);
		end = System.nanoTime();
		System.out.println("Add lasted: " + (end - start)+ "nano seconds");
		
		start = System.nanoTime();
		ourArray.delete(489);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourArray.search(439);
		end = System.nanoTime();
		System.out.println("Search lasted: " + (end - start)+ "nano seconds");
		
		System.out.println("Creating Double Circular List with: " + Simulator.size + "Elements");
		test.setStructKind("DoubleCircularList");
		DoubleCircularList<Integer> newDoubleCircularList = 
				(DoubleCircularList<Integer>) test.createDataStructure();

		start = System.nanoTime();
		newDoubleCircularList.append(43);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newDoubleCircularList.exists(2352);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newDoubleCircularList.delete(523);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds");
	}
	
	public static void test11(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one");
		
		DataStructureChoose test = 
				new DataStructureChoose ("Array", Simulator.size);
		
		System.out.println("Creating array: " + Simulator.size + "Elements");
		Array<Integer> ourArray = 
				(Array<Integer>) test.createDataStructure();
		ourArray = (Array<Integer>) ourArray;

		start = System.nanoTime();
		ourArray.append(25);
		end = System.nanoTime();
		System.out.println("Add lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourArray.delete(234);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		ourArray.search(7654);
		end = System.nanoTime();
		System.out.println("Search lasted: " + (end - start)+ "nano seconds");
		
		System.out.println("Creating Simple Circular List with: " + Simulator.size + "Elements");
		test.setStructKind("SimpleCircularList");
		SimpleCircularList<Integer> newSimpleCircularList = 
				(SimpleCircularList<Integer>) test.createDataStructure();
		
		start = System.nanoTime();
		newSimpleCircularList.append(2234);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newSimpleCircularList.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds");

		start = System.nanoTime();
		newSimpleCircularList.delete(444);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds");
	}
	
}
