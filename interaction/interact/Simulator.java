package interact;

import interfaces.DataStructure;

import java.io.IOException;
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
		// TODO Auto-generated method stub
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
		System.out.println("Write the option number:");
		try{
			choose = in.nextInt();
			System.out.println("Please, now enter how large you want the structure to be (larger than 1 less than 100 000): ");
			size = in.nextInt();
			switch (choose) {
				case 1:  choose = 1;
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
		}catch(InputMismatchException e){
			System.out.println("You didn't entered an integer");
			System.out.println("Exiting");
			
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
		System.out.println("Adding at the beginning lasted: " + (end - start));
		
		start = System.nanoTime();
		newDoubleList.append(245);
		end = System.nanoTime();
		System.out.println("Adding at the end lasted: " + (end - start));
		
		start = System.nanoTime();
		newDoubleList.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start));
		
		start = System.nanoTime();
		newDoubleList.delete();
		end = System.nanoTime();
		System.out.println("Deleting the first element lasted: " + (end - start));
		
		start = System.nanoTime();
		newDoubleList.cut();
		end = System.nanoTime();
		System.out.println("Deleting the end " + (end - start));
		
		start = System.nanoTime();
		newDoubleList.delete(444);
		end = System.nanoTime();
		System.out.println("Deleting a node lasted: " + (end - start));
		
		System.out.println("Creating Simple List with: " + Simulator.size + "Elements");
		test.setStructKind("SimpleList");
		SimpleList<Integer> newSimpleList = 
				(SimpleList<Integer>) test.createDataStructure();
		
		start = System.nanoTime();
		newSimpleList.insert(2);
		end = System.nanoTime();
		System.out.println("adding at the beginning lasted: " + (end - start));
		
		start = System.nanoTime();
		newSimpleList.append(2234);
		end = System.nanoTime();
		System.out.println("Adding at the end lasted: " + (end - start));
		
		start = System.nanoTime();
		newSimpleList.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start));
		
		start = System.nanoTime();
		newSimpleList.delete();
		end = System.nanoTime();
		System.out.println("Deleting the first element lasted: " + (end - start));
		
		start = System.nanoTime();
		newSimpleList.cut();
		end = System.nanoTime();
		System.out.println("Deleting the last element lasted: " + (end - start));
		
		start = System.nanoTime();
		newSimpleList.delete(444);
		end = System.nanoTime();
		System.out.println("Deleting a node lasted: " + (end - start));
		
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

		
		System.out.println("Add");
		start = System.nanoTime();
		newDoubleCircularList.append(2234);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start) + "nano seconds");
		
		System.out.println("Search");
		start = System.nanoTime();
		newDoubleCircularList.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start) + "nano seconds");
		
		System.out.println("Delete the beginning");
		start = System.nanoTime();
		newDoubleCircularList.delete();
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start) + "nano seconds");
		
		System.out.println("Deleting a node");
		start = System.nanoTime();
		newDoubleCircularList.delete(444);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start) + "nano seconds");
		
		System.out.println("Creating Simple Circular List with: " + Simulator.size + "Elements");
		test.setStructKind("SimpleCircularList");
		SimpleCircularList<Integer> newSimpleCircularList = 
				(SimpleCircularList<Integer>) test.createDataStructure();
		
		System.out.println("Add at the beginning");
		start = System.nanoTime();
		newSimpleCircularList.insert(2);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		newSimpleCircularList.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start));
		
		System.out.println("Delete the beginning");
		start = System.nanoTime();
		newSimpleCircularList.delete();
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Deleting a node");
		start = System.nanoTime();
		newSimpleCircularList.delete(444);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start));
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
		
		System.out.println("Add at the end");
		start = System.nanoTime();
		ourAVLTree.insert(2234);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		ourAVLTree.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start));
		
		System.out.println("Delete the beginning");
		start = System.nanoTime();
		ourAVLTree.delete(45);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Creating Splay Tree: " + Simulator.size + "Elements");
		test.setStructKind("SplayTree");
		SplayTree<Integer> newSplayTree = 
				(SplayTree<Integer>) test.createDataStructure();

		System.out.println("Add");
		start = System.nanoTime();
		newSplayTree.insert(2234);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		newSplayTree.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start));
		
		System.out.println("Deleting a node");
		start = System.nanoTime();
		newSplayTree.delete(444);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start));
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
		
		System.out.println("Add");
		start = System.nanoTime();
		ourSplayTree.insert(2234);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		ourSplayTree.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start));
		
		System.out.println("Delete");
		start = System.nanoTime();
		ourSplayTree.delete(45);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Creating Splay Tree: " + Simulator.size + "Elements");
		test.setStructKind("BinaryTree");
		BinaryTree<Integer> newBinaryTree = 
				(BinaryTree<Integer>) test.createDataStructure();

		System.out.println("Add");
		start = System.nanoTime();
		newBinaryTree.insert(2234);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		newBinaryTree.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start));
		
		System.out.println("Deleting");
		start = System.nanoTime();
		newBinaryTree.delete(444);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start));
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
		
		System.out.println("Add");
		start = System.nanoTime();
		ourAVLTree.insert(2234);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		ourAVLTree.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start));
		
		System.out.println("Delete");
		start = System.nanoTime();
		ourAVLTree.delete(45);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Creating Splay Tree: " + Simulator.size + "Elements");
		test.setStructKind("BinaryTree");
		BinaryTree<Integer> newBinaryTree = 
				(BinaryTree<Integer>) test.createDataStructure();

		System.out.println("Add");
		start = System.nanoTime();
		newBinaryTree.insert(2234);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		newBinaryTree.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start));
		
		System.out.println("Deleting");
		start = System.nanoTime();
		newBinaryTree.delete(444);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start));
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
		
		System.out.println("Enqueue");
		start = System.nanoTime();
		ourQWA.Enqueue(2234);
		end = System.nanoTime();
		System.out.println("Enqueueing lasted: " + (end - start));
		
		System.out.println("Dequeue");
		start = System.nanoTime();
		ourQWA.Dequeue();
		end = System.nanoTime();
		System.out.println("Dequeueing lasted: " + (end - start));
		
		System.out.println("Creating Queue with List: " + Simulator.size + "Elements");
		test.setStructKind("QueueWithList");
		QueueWithList<Integer> ourQWL = 
				(QueueWithList<Integer>) test.createDataStructure();

		System.out.println("Enqueueing");
		start = System.nanoTime();
		ourQWL.Enqueue(2234);
		end = System.nanoTime();
		System.out.println("Enqueueing lasted: " + (end - start));
		
		System.out.println("Dequeueing");
		start = System.nanoTime();
		ourQWL.Dequeue();
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start));
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
		
		System.out.println("Push");
		start = System.nanoTime();
		ourSWA.push(234);
		end = System.nanoTime();
		System.out.println("Push lasted: " + (end - start));
		
		System.out.println("Pop");
		start = System.nanoTime();
		ourSWA.pop();
		end = System.nanoTime();
		System.out.println("Pop lasted: " + (end - start));
		
		System.out.println("Top");
		start = System.nanoTime();
		ourSWA.top();
		end = System.nanoTime();
		System.out.println("Top lasted: " + (end - start));
		
		System.out.println("Creating Queue with List: " + Simulator.size + "Elements");
		test.setStructKind("StackWithList");
		StackWithList<Integer> ourQWL = 
				(StackWithList<Integer>) test.createDataStructure();

		System.out.println("Push");
		start = System.nanoTime();
		ourQWL.push(2234);
		end = System.nanoTime();
		System.out.println("Push lasted: " + (end - start));
		
		System.out.println("Top");
		start = System.nanoTime();
		ourQWL.top();
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start));
		
		System.out.println("Pop");
		start = System.nanoTime();
		ourQWL.pop();
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start));
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
		
		System.out.println("Enqueue");
		start = System.nanoTime();
		ourBQWL.insert(12333);
		end = System.nanoTime();
		System.out.println("Emqueue lasted: " + (end - start));
		
		System.out.println("Dequeue");
		start = System.nanoTime();
		ourBQWL.Dequeue();
		end = System.nanoTime();
		System.out.println("Dequeue lasted: " + (end - start));
		
		System.out.println("Insert at end");
		start = System.nanoTime();
		ourBQWL.InsertAtEnd(345);
		end = System.nanoTime();
		System.out.println("Insert lasted: " + (end - start));
		
		
		System.out.println("Delete beginning");
		start = System.nanoTime();
		ourBQWL.DeleteFirst();
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start));
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
		
		System.out.println("Insert");
		start = System.nanoTime();
		ourArray.append(12333);
		end = System.nanoTime();
		System.out.println("Emqueue lasted: " + (end - start));
		
		System.out.println("Delete");
		start = System.nanoTime();
		ourArray.delete(13);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		ourArray.search(345);
		end = System.nanoTime();
		System.out.println("Insert lasted: " + (end - start));
		
		System.out.println("Creating Simple List with: " + Simulator.size + "Elements");
		test.setStructKind("SimpleList");
		SimpleList<Integer> newSimpleList = 
				(SimpleList<Integer>) test.createDataStructure();
		
		System.out.println("Add at the end");
		start = System.nanoTime();
		newSimpleList.append(2234);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		newSimpleList.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start));
		
		System.out.println("Deleting a node");
		start = System.nanoTime();
		newSimpleList.delete(444);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start));
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
		
		System.out.println("Insert");
		start = System.nanoTime();
		ourArray.append(12333);
		end = System.nanoTime();
		System.out.println("Emqueue lasted: " + (end - start));
		
		System.out.println("Delete");
		start = System.nanoTime();
		ourArray.delete(13);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		ourArray.search(345);
		end = System.nanoTime();
		System.out.println("Insert lasted: " + (end - start));
		
		System.out.println("Creating Double List with: " + Simulator.size + "Elements");
		test.setStructKind("DoubleList");
		DoubleList<Integer> newDoubleList = 
				(DoubleList<Integer>) test.createDataStructure();
		
		System.out.println("Add at the end");
		start = System.nanoTime();
		newDoubleList.append(2234);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		newDoubleList.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start));
		
		System.out.println("Deleting a node");
		start = System.nanoTime();
		newDoubleList.delete(444);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start));
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
		
		System.out.println("Insert");
		start = System.nanoTime();
		ourArray.append(12333);
		end = System.nanoTime();
		System.out.println("Emqueue lasted: " + (end - start));
		
		System.out.println("Delete");
		start = System.nanoTime();
		ourArray.delete(13);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		ourArray.search(345);
		end = System.nanoTime();
		System.out.println("Insert lasted: " + (end - start));
		
		System.out.println("Creating Double Circular List with: " + Simulator.size + "Elements");
		test.setStructKind("DoubleCircularList");
		DoubleCircularList<Integer> newDoubleCircularList = 
				(DoubleCircularList<Integer>) test.createDataStructure();
		
		System.out.println("Add");
		start = System.nanoTime();
		newDoubleCircularList.append(2234);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		newDoubleCircularList.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start));
		
		System.out.println("Deleting a node");
		start = System.nanoTime();
		newDoubleCircularList.delete(444);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start));
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
		
		System.out.println("Insert");
		start = System.nanoTime();
		ourArray.append(12333);
		end = System.nanoTime();
		System.out.println("Emqueue lasted: " + (end - start));
		
		System.out.println("Delete");
		start = System.nanoTime();
		ourArray.delete(13);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		ourArray.search(345);
		end = System.nanoTime();
		System.out.println("Insert lasted: " + (end - start));
		
		System.out.println("Creating Simple Circular List with: " + Simulator.size + "Elements");
		test.setStructKind("SimpleCircularList");
		SimpleCircularList<Integer> newSimpleCircularList = 
				(SimpleCircularList<Integer>) test.createDataStructure();
		
		System.out.println("Add");
		start = System.nanoTime();
		newSimpleCircularList.append(2234);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start));
		
		System.out.println("Search");
		start = System.nanoTime();
		newSimpleCircularList.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start));
		
		System.out.println("Deleting a node");
		start = System.nanoTime();
		newSimpleCircularList.delete(444);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start));
	}
	
}
