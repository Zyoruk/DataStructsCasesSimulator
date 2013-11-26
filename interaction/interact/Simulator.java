package interact;

import java.util.Scanner;

import array.Array;

import queue.BiQueueWithList;
import queue.PriorityQueue;
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

/**
 * 
 * @author zyoruk
 * This is mostly the interface with console.
 *
 */
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
	
	/**
	 * We start the interface.
	 * @param args
	 */
	public static void main(String[] args) {
		mainMenu();

	}
	
	/**
	 * Here you can choose wether watching some tests or playing with the 
	 * structures.
	 */
	private static void mainMenu(){
		System.out.println("						Welcome to the main menu\n");
		System.out.println("This programm is meant to compare several structures. " +
				   "You will be able to interact with a simulator of tests or using" +
				   " the\n" +
				   "Structures directly.\n");
System.out.println("Authors: Daniel Jenkins(jeukel)\n" +
					"	 Luis Ángel Simón(Zyoruk)\n");
		System.out.println("Please choose: \n");
		System.out.println("1)Do you want to see tests?" + 
							"\n2)Do you want to use data structures?\n");
		System.out.println("Enter 1 or 2 and hit enter ");
		
		try{
			choose = in.nextInt();
			switch (choose){
			case 1 :
				simulatorMenu();
				break;
			case 2 :
				structureInteractionMenu();
				break;	
			}
			System.out.println("Do you want to exit the Main Menu?(Yes / No)");
			exitMainMenu();
		}catch(Exception e){
			System.out.println("Do you want to exit the Main Menu?(Yes / No)");
			exitMainMenu();
		}
	}
	
	/**
	 * Method to exit from the main menu. If you  don't write the correct option
	 * then it will keep asking.
	 */
	private static void exitMainMenu(){
		exit = in.next();
		switch(exit){
			case "No":
				mainMenu();
				break;
			case "Yes":
				break;
			default:
				exitMainMenu();
				break;
		}
	}

	/**
	 * This is the testers menu.
	 */
	private static void simulatorMenu(){
		System.out.println("						Welcome to the structure " +
				"performance simulator\n");
		System.out.println("Please, choose which option you want to simulate: ");
		System.out.println("	1. Simple Linked list with Double Linked list");
		System.out.println("	2. Simple  Linked Circular List with Double " +
				" Linked Circular List");
		System.out.println("	3. AVL with Splay");
		System.out.println("	4. Splay with Binary");
		System.out.println("	5. AVL with Binary");
		System.out.println("	6. Queue implemented with list and with array");
		System.out.println("	7. Stack implemented with list and with array");
		System.out.println("	8. Biqueue");
		System.out.println("	9. Array with Simple List");
		System.out.println("	10. Array with Double List");
		System.out.println("	11. Array with Simple Circular List");
		System.out.println("	12. Array with Double Circular List");
		simulator();
	}
	
	/**
	 * this will ask the user which option and how large he  / she wants the 
	 * structure
	 */
	private static void simulator(){
		try{
			System.out.println("Write the option number and hit enter: " +
					"(1 to 12)");
			choose = in.nextInt();
			System.out.println("Please, now enter how large you want the " +
					"structure to be  and hit enter: (larger than 1 less " +
					"than 100 000)");
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
				default:
					System.out.println("Invalid integer");
					break;
			}
			System.out.println("Do you want to exit the simulator? (Yes / No)");
			exitSimulator();
		}catch(Exception e){
			System.out.println("Do you want to exit the simulator? (Yes / No)");
			exitSimulator();
		}
	}
	
	/**
	 * this will exit the simulator.
	 */
	private static void exitSimulator(){
		try{
			exit = in.next();
			switch(exit){
			case "No":
				simulator();
				break;
			case "Yes":
				break;
			default:
				exitSimulator();
				break;
			}
		}catch (Exception e){
			System.out.println("Please enter Yes or No");
			exitSimulator();
		}
	}
	
	/**
	 * If the user choosed to play with structures, this is the menu.
	 */
	private	static void structureInteractionMenu(){
		System.out.println("					Welcome to the structure Interaction menu\n");
		System.out.println("Please, choose which structure you want to interact with: \n " +
				"	1) Simple List\n" +
				"	2) Double List\n" +
				"	3) Simple Circular Linked list\n" +
				"	4) Doubly Linked Circular List\n" +
				"	5) AVL tree\n" +
				"	6) Binary Tree\n" +
				"	7) Splay Tree\n" +
				"	8) Queue implemented with list\n" +
				"	9) Queue implemented with array\n" +
				"	10) Priority Queue\n" +
				"	11) Biqueue\n" +
				"	12) Array\n");
		structureInteraction();
	}
	
	/**
	 * This will ask for the option.
	 */
	private static void structureInteraction(){
		try{
			System.out.println("Enter the number: ");
			choose = in.nextInt();
			switch (choose){
			case 1:
				structureMenu("SimpleList");
				break;
			case 2:
				structureMenu("DoubleList");
				break;
			case 3:
				structureMenu("SimpleCircularList");
				break;
			case 4:
				structureMenu("DoubleCircularList");
				break;
			case 5:
				structureMenu("AVLTree");
				break;
			case 6:
				structureMenu("BinaryTree");
				break;
			case 7:
				structureMenu("SplayTree");	
				break;
			case 8:
				structureMenu("QueueWithList");				
				break;
			case 9:
				structureMenu("QueueWithArray");
				break;
			case 10:
				structureMenu("PriorityQueue");
				break;
			case 11:
				structureMenu("Biqueue");
				break;
			case 12:
				structureMenu("Array");
				break;
			default:
				System.out.println("Invalid choose");
				break;
			}
			System.out.println("Do you want to end? (Yes / No)");
			exitStructureInteraction();
		}catch (Exception e){

			System.out.println("Do you want to end? (Yes / No)");
			exitStructureInteraction();
		}
	}
	
	/**
	 * This will exit the structure interaction
	 */
	private static void exitStructureInteraction(){
		try{
			exit = in.next();
			switch (exit){
			case "Yes":
				break;
			case "No":
				structureInteractionMenu();
				break;
			default:
				exitStructureInteraction();
				break;
			}
		}catch (Exception e){
			System.out.println("Please enter Yes or No");
			exitStructureInteraction();
		}
	}
	/**
	 * this will ask the size of the structure
	 * @param pType string
	 */
	private static void structureMenu(String pType){

		try{
			System.out.println("Enter the size of the structure:");
			size = in.nextInt();
			DataStructureChoose ourDataStruct = new DataStructureChoose(pType, size);

			if (ourDataStruct.getStructureKind() == "DoubleList"){
				DoubleList<Integer> newDoubleList = 
						(DoubleList<Integer>) ourDataStruct.createDataStructure();
				newDoubleList = (DoubleList<Integer>) newDoubleList;
				DoubleListMenu(newDoubleList);
				
			}else if(ourDataStruct.getStructureKind() == "SimpleList"){
				SimpleList<Integer> SimpleList = 
						(SimpleList<Integer>) ourDataStruct.createDataStructure();
				SimpleList = (SimpleList<Integer>) SimpleList;
				SimpleListMenu(SimpleList);
				
				
			}else if(ourDataStruct.getStructureKind() == "SimpleCircularList"){
				SimpleCircularList<Integer> SimpleCircularList = 
						(SimpleCircularList<Integer>) ourDataStruct.createDataStructure();
				SimpleCircularList = (SimpleCircularList<Integer>) SimpleCircularList;
				SimpleCircularListMenu(SimpleCircularList);
				
			}else if(ourDataStruct.getStructureKind()  == "DoubleCircularList"){
				DoubleCircularList<Integer> DoubleCircularList = 
						(DoubleCircularList<Integer>) ourDataStruct.createDataStructure();
				DoubleCircularList = (DoubleCircularList<Integer>) DoubleCircularList;
				DoubleCircularListMenu(DoubleCircularList);
								

			}else if(ourDataStruct.getStructureKind() == "QueueWithArray"){
				QueueWithArray<Integer> QueueWithArray = 
						(QueueWithArray<Integer>) ourDataStruct.createDataStructure();
				QueueWithArray = (QueueWithArray<Integer>) QueueWithArray;
				QueueWithArrayMenu(QueueWithArray);
								
			}else if(ourDataStruct.getStructureKind() == "QueueWithList"){
				QueueWithList<Integer> QueueWithList = 
						(QueueWithList<Integer>) ourDataStruct.createDataStructure();
				QueueWithList = (QueueWithList<Integer>) QueueWithList;
				QueueWithListMenu(QueueWithList);
					
			}else if(ourDataStruct.getStructureKind()  == "StackWithArray"){
				StackWithArray<Integer> StackWithArray = 
						(StackWithArray<Integer>) ourDataStruct.createDataStructure();
				StackWithArray = (StackWithArray<Integer>) StackWithArray;
				StackWithArrayMenu(StackWithArray);
				
			}else if(ourDataStruct.getStructureKind()  == "StackWithList"){
				StackWithList<Integer> StackWithList = 
						(StackWithList<Integer>) ourDataStruct.createDataStructure();
				StackWithList = (StackWithList<Integer>) StackWithList;
				StackWithListMenu(StackWithList);
					
				
			}else if(ourDataStruct.getStructureKind()  == "PriorityQueue"){
				PriorityQueue<Integer> PriorityQueue = 
						(PriorityQueue<Integer>) ourDataStruct.createDataStructure();
				PriorityQueue = (PriorityQueue<Integer>) PriorityQueue;
				PriorityQueueMenu(PriorityQueue);
				
			}else if(ourDataStruct.getStructureKind()  == "BiQueueWithList"){
				BiQueueWithList<Integer> BiQueueWithList = 
						(BiQueueWithList<Integer>) ourDataStruct.createDataStructure();
				BiQueueWithList = (BiQueueWithList<Integer>) BiQueueWithList;
				BiqueueWithListMenu(BiQueueWithList);

			}else if(ourDataStruct.getStructureKind()  == "Array"){
				Array<Integer> Array = 
						(Array<Integer>) ourDataStruct.createDataStructure();
				Array = (Array<Integer>) Array;
				ArrayMenu(Array);
				
			}else if(ourDataStruct.getStructureKind() == "AVLTree"){
				AVLTree<Integer> AVLTree = 
						(AVLTree<Integer>) ourDataStruct.createDataStructure();
				AVLTree = (AVLTree<Integer>) AVLTree;
				
			}else if(ourDataStruct.getStructureKind()  == "BinaryTree"){
				BinaryTree<Integer> BinaryTree = 
						(BinaryTree<Integer>) ourDataStruct.createDataStructure();
				BinaryTree = (BinaryTree<Integer>) BinaryTree;
				BinaryTreeMenu(BinaryTree);
				
			}else if(ourDataStruct.getStructureKind()  == "SplayTree"){
				SplayTree<Integer> SplayTree = 
						(SplayTree<Integer>) ourDataStruct.createDataStructure();
				SplayTree = (SplayTree<Integer>) SplayTree;
			}
			System.out.println("Do you want to end playing with the structures?");
			exitStructureInteraction();
		}catch (Exception e){
			System.out.println("Do you want to end playing with the structures?");
			exitStructureInteraction();
		}
	}
	
	
	// From this point, every method is a menu specially for each structure.
	// Each will receive the structure created before.

	private static void BinaryTreeMenu(BinaryTree<Integer> BinaryTree){
		System.out.println("\nWhat do you want to do ?");
		System.out.println("	1) Insert");
		System.out.println("	2) Search");
		System.out.println("	3) Delete");
		System.out.println("	4) Print");
		System.out.println("Enter your option and hit enter: (from 1 to 4)");
		try{
			choose = in.nextInt();
			switch (choose){
			case 1:
				try{
					System.out.println("Insert the number to add: ");
					size = in.nextInt();
					start = System.nanoTime();
					BinaryTree.insert(size);
					end = System.nanoTime();
					System.out.println("Adding lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 2:
				try{
					System.out.println("Insert the number to search: ");
					size = in.nextInt();
					start = System.nanoTime();
					System.out.println("Does that number exist? " + BinaryTree.exists(size));
					end = System.nanoTime();
					System.out.println("Adding lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 3:
				try{
					System.out.println("Insert the number to delete: ");
					size = in.nextInt();
					start = System.nanoTime();
					BinaryTree.delete(size);
					end = System.nanoTime();
					System.out.println("Delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 4 : 
				BinaryTree.describe();
				System.out.println("\n");
			}
			System.out.println("Do you want to exit the Binary Tree ? (Yes / No)");
			exitBinaryTree(BinaryTree);
		}catch(Exception e){
			System.out.println("Do you want to exit the Binary Tree ? (Yes / No)");
			exitBinaryTree(BinaryTree);
		}
	}
	
	private static void exitBinaryTree(BinaryTree<Integer> BinaryTree){
		try{
			exit = in.next();
			switch (exit){
			case "Yes":
				break;
			case "No":
				BinaryTreeMenu(BinaryTree);
				break;
			default:
				BinaryTreeMenu(BinaryTree);
				break;
			}
		}catch (Exception e){
			
			System.out.println("Please enter Yes or No");
			exitBinaryTree(BinaryTree);
		}
	}
	private static void ArrayMenu (Array<Integer> Array){
		System.out.println("\nWhat do you want to do ?");
		System.out.println("	1) Insert");
		System.out.println("	2) Search");
		System.out.println("	3) Delete");
		System.out.println("	4) Print");
		System.out.println("Enter your option and hit enter: (from 1 to 4)");
		try{
			choose = in.nextInt();
			switch (choose){
			case 1:
				try{
					System.out.println("Insert the number to add: ");
					size = in.nextInt();
					start = System.nanoTime();
					Array.append(size);
					end = System.nanoTime();
					System.out.println("Adding lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 2:
				try{
					System.out.println("Insert the number to search: ");
					size = in.nextInt();
					start = System.nanoTime();
					System.out.println("Does that number exist? " + Array.exists(size));
					end = System.nanoTime();
					System.out.println("Adding lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 3:
				try{
					System.out.println("Insert the number to delete: ");
					size = in.nextInt();
					start = System.nanoTime();
					Array.delete(size);
					end = System.nanoTime();
					System.out.println("Delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 4 : 
				System.out.println(Array.describe());
			}
			System.out.println("Do you want to exit the ArrayMenu ? (Yes / No)");
			exitArrayMenu(Array);
		}catch(Exception e){
			System.out.println("Do you want to exit the ArrayMenu ? (Yes / No)");
			exitArrayMenu(Array);
		}
	}
	
	private static void exitArrayMenu(Array<Integer> Array){
		try{
			exit = in.next();
			switch (exit){
			case "Yes":
				break;
			case "No":
				ArrayMenu(Array);
				break;
			default:
				ArrayMenu(Array);
				break;
			}
		}catch (Exception e){
			System.out.println("Please enter Yes or No");
			exitArrayMenu(Array);
		}
	}
		
	private static void BiqueueWithListMenu(BiQueueWithList<Integer> BiQueueWithList){

		System.out.println("What do you want to do ?");
		System.out.println("	1) Insert at the beginning");
		System.out.println("	2) Insert at the end");
		System.out.println("	3) Search");
		System.out.println("	4) Delete the beginning");
		System.out.println("	5) Delete the end");
		System.out.println("	6) Print");
		System.out.println("Enter your option");
		try{
			choose = in.nextInt();
			switch (choose){
			case 1:
				try{
					System.out.println("Insert the number to add: ");
					size = in.nextInt();
					start = System.nanoTime();
					BiQueueWithList.insert(size);
					end = System.nanoTime();
					System.out.println("Adding lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 2:
				try{
					System.out.println("Insert the number to add: ");
					size = in.nextInt();
					start = System.nanoTime();
					BiQueueWithList.append(size);
					end = System.nanoTime();
					System.out.println("Adding lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 3:
				try{
					System.out.println("Insert the number to search");
					size = in.nextInt();
					start = System.nanoTime();
					System.out.println("Does that number exist?" + BiQueueWithList.exists(size));
					end = System.nanoTime();
					System.out.println("Search lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 4:
				try{
					start = System.nanoTime();
					BiQueueWithList.delete();
					end = System.nanoTime();
					System.out.println("Delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 5:
				try{
					start = System.nanoTime();
					BiQueueWithList.cut();
					end = System.nanoTime();
					System.out.println("Delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 6:
				System.out.println(BiQueueWithList.describe());
			}
			System.out.println("Do you want to exit the Biqueue With List Menu ? (Yes / No)");
			exitBiqueueWithListMenu(BiQueueWithList);
		}catch (Exception e){	
			System.out.println("Do you want to exit the Biqueue With List menu ? (Yes / No)");
			exitBiqueueWithListMenu(BiQueueWithList);
		}
						
	}
	
	private static void exitBiqueueWithListMenu(BiQueueWithList<Integer> BiqueueWithList){
		try{
			exit = in.next();
			switch (exit){
			case "Yes":
				break;
			case "No":
				BiqueueWithListMenu(BiqueueWithList);
				break;
			default:
				exitBiqueueWithListMenu(BiqueueWithList);
				break;
			}
		}catch (Exception e){
			System.out.println("Please enter Yes or No");
			exitBiqueueWithListMenu(BiqueueWithList);
		}
	}
		
	private static void PriorityQueueMenu(PriorityQueue<Integer> PriorityQueue){

		System.out.println("What do you want to do ?");
		System.out.println("1) Dequeue");
		System.out.println("2) Enqueue");
		System.out.println("3) Print");
		System.out.println("Enter your option");
		try{
			choose = in.nextInt();
			switch (choose){
			case 1:
				try{
					System.out.println("Insert the number to enqueue: ");
					size = in.nextInt();
					start = System.nanoTime();
					PriorityQueue.Enqueue(size);
					end = System.nanoTime();
					System.out.println("Enqueueing lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 2:
				try{
					start = System.nanoTime();
					PriorityQueue.Dequeue();
					end = System.nanoTime();
					System.out.println("Dequeueing lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 3 :
				System.out.println(PriorityQueue.describe());
			}
			System.out.println("Do you want to exit the Priority Queue Menu? (Yes / No)");
			exitPriorityQueueMenu(PriorityQueue);
		}catch (Exception e){
			System.out.println("Do you want to exit the Priority Queue Menu? (Yes / No)");
			exitPriorityQueueMenu(PriorityQueue);
		}
			
	}
	
	private static void exitPriorityQueueMenu(PriorityQueue<Integer> PriorityQueue){
		try{
			exit = in.next();
			switch (exit){
			case "Yes":
				break;
			case "No":
				PriorityQueueMenu(PriorityQueue);
				break;
			default:
				exitPriorityQueueMenu(PriorityQueue);
				break;
			}
		}catch (Exception e){
			
			System.out.println("Please enter Yes or No");
			exitPriorityQueueMenu(PriorityQueue);
		}
	}
		
	private static void StackWithListMenu(StackWithList<Integer> StackWithList){
		
		System.out.println("What do you want to do ?");
		System.out.println("1) pop");
		System.out.println("2) top");
		System.out.println("3) push");
		System.out.println("4) Print");
		System.out.println("Enter your option");
		try{
			choose = in.nextInt();
			switch (choose){
			case 1:
				try{
					start = System.nanoTime();
					StackWithList.pop();
					end = System.nanoTime();
					System.out.println("Pop lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 2:
				try{
					start = System.nanoTime();
					StackWithList.top();
					end = System.nanoTime();
					System.out.println("Top lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 3 : 
				try{
					System.out.println("Insert the number to push: ");
					size = in.nextInt();
					start = System.nanoTime();
					StackWithList.push(size);
					end = System.nanoTime();
					System.out.println("push lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 4 :
				System.out.println(StackWithList.describe());
			}
			System.out.println("Do you want to exit the stack with list menu ? (Yes / No)");
			exitStackWithListMenu(StackWithList);
		}catch (Exception e){
			System.out.println("Do you want to exit the Stack with list menu ? (Yes / No)");
			exitStackWithListMenu(StackWithList);
		}
	}
	
	private static void exitStackWithListMenu(StackWithList<Integer> StackWithList){
		try{
			exit = in.next();
			switch (exit){
			case "Yes":
				break;
			case "No":
				StackWithListMenu(StackWithList);
				break;
			default:
				exitStackWithListMenu(StackWithList);
				break;
			}
		}catch (Exception e){
			System.out.println("Please enter Yes or No");
			exitStackWithListMenu(StackWithList);
		}
	}
		
	private static void StackWithArrayMenu(StackWithArray<Integer> StackWithArray){
		System.out.println("What do you want to do ?");
		System.out.println("1) pop");
		System.out.println("2) top");
		System.out.println("3) push");
		System.out.println("4) print");
		System.out.println("Enter your option");
		try{
			choose = in.nextInt();
			switch (choose){
			case 1:
				try{
					start = System.nanoTime();
					StackWithArray.pop();
					end = System.nanoTime();
					System.out.println("Pop lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 2:
				try{
					start = System.nanoTime();
					StackWithArray.top();
					end = System.nanoTime();
					System.out.println("Top lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 3 : 
				try{
					System.out.println("Insert the number to push: ");
					size = in.nextInt();
					start = System.nanoTime();
					StackWithArray.push(size);
					end = System.nanoTime();
					System.out.println("Push lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 4 :
				System.out.println(StackWithArray.describe());
			}
			System.out.println("Do you want to exit the Stack with array menu ? (Yes / No)");
			exitStackWithArrayMenu(StackWithArray);
		}catch (Exception e){		
			System.out.println("Do you want to exit the Stack with array menu ? (Yes / No)");
			exitStackWithArrayMenu(StackWithArray);
		}		
	}
	
	private static void exitStackWithArrayMenu(StackWithArray<Integer> StackWithArray){
		try{
			exit = in.next();
			switch (exit){
			case "Yes":
				break;
			case "No":
				StackWithArrayMenu(StackWithArray);
				break;
			default:
				exitStackWithArrayMenu(StackWithArray);
				break;
			}
		}catch (Exception e){
			System.out.println("Please enter Yes or No");
			exitStackWithArrayMenu(StackWithArray);
		}
	}
		
	private static void QueueWithListMenu(QueueWithList<Integer> QueueWithList){
		System.out.println("What do you want to do ?");
		System.out.println("1) Dequeue");
		System.out.println("2) Enqueue");
		System.out.println("3) Print");
		System.out.println("Enter your option");
		try{
			choose = in.nextInt();
			switch (choose){
			case 1:
				try{
					System.out.println("Insert the number to enqueue: ");
					size = in.nextInt();
					start = System.nanoTime();
					QueueWithList.Enqueue(size);
					end = System.nanoTime();
					System.out.println("Enqueueing lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 2:
				try{
					start = System.nanoTime();
					QueueWithList.Dequeue();
					end = System.nanoTime();
					System.out.println("Dequeueing lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 3:
				System.out.println(QueueWithList.describe());
			}
			System.out.println("Do you want to exit the queue with list menu ? (Yes / No)");
			exitQueueWithListMenu(QueueWithList);
		}catch (Exception e){
			System.out.println("Do you want to exit the queue with list menu ? (Yes / No)");
			exitQueueWithListMenu(QueueWithList);
		}
	}
	
	private static void exitQueueWithListMenu(QueueWithList<Integer> QueueWithList){
		try{
			exit = in.next();
			switch (exit){
			case "Yes":
				break;
			case "No":
				QueueWithListMenu(QueueWithList);
				break;
			default:
				exitQueueWithListMenu(QueueWithList);
				break;
			}
		}catch (Exception e){
			System.out.println("Please enter Yes or No");
			exitQueueWithListMenu(QueueWithList);
		}
	}
		
	private static void QueueWithArrayMenu(QueueWithArray<Integer> QueueWithArray){


		System.out.println("What do you want to do ?");
		System.out.println("1) Dequeue");
		System.out.println("2) Enqueue");
		System.out.println("3) Print");
		System.out.println("Enter your option");
		try{
			choose = in.nextInt();
			switch (choose){
			case 1:
				try{
					System.out.println("Insert the number to enqueue: ");
					size = in.nextInt();
					start = System.nanoTime();
					QueueWithArray.Enqueue(size);
					end = System.nanoTime();
					System.out.println("Queue lasted: " + (end - start));
					break;
				}catch(Exception e){
				}
			case 2:
				try{
					start = System.nanoTime();
					QueueWithArray.Dequeue();
					end = System.nanoTime();
					System.out.println("Dequeue lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 3:
				System.out.println(QueueWithArray.describe());
			}
			System.out.println("Do you want to exit the Queue with array ? (Yes / No)");
			exitQueueWithArrayMenu(QueueWithArray);
		}catch (Exception e){
			System.out.println("Do you want to exit the queue with array ? (Yes / No)");
			exitQueueWithArrayMenu(QueueWithArray);
		}
	}
	
	private static void exitQueueWithArrayMenu(QueueWithArray<Integer> QueueWithArray){
		try{
			exit = in.next();
			switch (exit){
			case "Yes":
				break;
			case "No":
				QueueWithArrayMenu(QueueWithArray);
				break;
			default:
				exitQueueWithArrayMenu(QueueWithArray);
				break;
			}
		}catch (Exception e){
			System.out.println("Please enter Yes or No");
			exitQueueWithArrayMenu(QueueWithArray);
		}
	}
		
	private static void DoubleCircularListMenu(DoubleCircularList<Integer> DoubleCircularList){

		System.out.println("What do you want to do ?");
		System.out.println("1) Insert");
		System.out.println("2) Search");
		System.out.println("3) Delete");
		System.out.println("4) Delete a node");
		System.out.println("5) Print");
		System.out.println("Enter your option");
		try{
			choose = in.nextInt();
			switch (choose){
			case 1:
				try{
					System.out.println("Insert the number to add: ");
					size = in.nextInt();
					start = System.nanoTime();
					DoubleCircularList.append(size);
					end = System.nanoTime();
					System.out.println("Insert lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 2:
				try{
					System.out.println("Insert the number to search");
					size = in.nextInt();
					start = System.nanoTime();
					System.out.println("Does that number exist?" + DoubleCircularList.exists(size));
					end = System.nanoTime();
					System.out.println("Search lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 3:
				try{
					start = System.nanoTime();
					DoubleCircularList.delete();
					end = System.nanoTime();
					System.out.println("Delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 4:
				try{
					System.out.println("Insert the number to delete");
					size = in.nextInt();
					start = System.nanoTime();
					DoubleCircularList.delete(size);
					end = System.nanoTime();
					System.out.println("Delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 5:
				System.out.println(DoubleCircularList.describe());
			}
			System.out.println("Do you want to exit the Double circular list menu ? (Yes / No)");
			exitDoubleCircularListMenu(DoubleCircularList);
		}catch (Exception e){
			System.out.println("Do you want to exit the double circular list menu? (Yes / No)");
			exitDoubleCircularListMenu(DoubleCircularList);
		}
	}
	
	private static void exitDoubleCircularListMenu(DoubleCircularList<Integer> DoubleCircularList){
		try{
			exit = in.next();
			switch (exit){
			case "Yes":
				break;
			case "No":
				DoubleCircularListMenu(DoubleCircularList);
				break;
			default:
				exitDoubleCircularListMenu(DoubleCircularList);
				break;
			}
		}catch (Exception e){
			System.out.println("Please enter Yes or No");
			exitDoubleCircularListMenu(DoubleCircularList);
		}
	}
	private static void SimpleCircularListMenu(SimpleCircularList<Integer> SimpleCircularList){
		System.out.println("What do you want to do ?");
		System.out.println("1) Insert");
		System.out.println("2) Search");
		System.out.println("3) Delete");
		System.out.println("4) Delete a node");
		System.out.println("5) Print");
		System.out.println("Enter your option");
		try{
			choose = in.nextInt();
			switch (choose){
			case 1:
				try{
					System.out.println("Insert the number to add: ");
					size = in.nextInt();
					start = System.nanoTime();
					SimpleCircularList.append(size);
					end = System.nanoTime();
					System.out.println("Insert lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 2:
				try{
					System.out.println("Insert the number to search");
					size = in.nextInt();
					start = System.nanoTime();
					System.out.println("Does that number exist?" + SimpleCircularList.exists(size));
					end = System.nanoTime();
					System.out.println("Search lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 3:
				try{
					start = System.nanoTime();
					SimpleCircularList.delete();
					end = System.nanoTime();
					System.out.println("Delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 4:
				try{
					System.out.println("Insert the number to delete");
					size = in.nextInt();
					start = System.nanoTime();
					SimpleCircularList.delete(size);
					end = System.nanoTime();
					System.out.println("Delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 5:
				System.out.println(SimpleCircularList.describe());
			}
			System.out.println("Do you want to exit the simple circular list ? (Yes / No)");
			exitSimpleCircularListMenu(SimpleCircularList);
		}catch (Exception e){
			System.out.println("Do you want to exit the simple circular list ? (Yes / No)");
			exitSimpleCircularListMenu(SimpleCircularList);
		}
						
	}
	
	
	private static void exitSimpleCircularListMenu(SimpleCircularList<Integer> SimpleCircularList){
		try{
			exit = in.next();
			switch (exit){
			case "Yes":
				break;
			case "No":
				SimpleCircularListMenu(SimpleCircularList);
				break;
			default:
				exitSimpleCircularListMenu(SimpleCircularList);
				break;
			}
		}catch (Exception e){
			System.out.println("Please enter Yes or No");
			exitSimpleCircularListMenu(SimpleCircularList);
		}
	}
	
	private static void DoubleListMenu(DoubleList<Integer> newDoubleList){
		System.out.println("What do you want to do ?");
		System.out.println("1) Insert at the beginning");
		System.out.println("2) Insert at the end");
		System.out.println("3) Search");
		System.out.println("4) Delete the beginning");
		System.out.println("5) Delete the end");
		System.out.println("6) Delete a node");
		System.out.println("7) Print");
		System.out.println("Enter your option");
		try{
			choose = in.nextInt();
			switch (choose){
			case 1:
				try{
					System.out.println("Insert the number to add: ");
					size = in.nextInt();
					start = System.nanoTime();
					newDoubleList.insert(size);
					end = System.nanoTime();
					System.out.println("Add lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 2: 
				try{
					System.out.println("Insert the number to add: ");
					size = in.nextInt();
					start = System.nanoTime();
					newDoubleList.append(size);
					end = System.nanoTime();
					System.out.println("Adding lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 3:
				try{
					System.out.println("Insert the number to search");
					size = in.nextInt();
					start = System.nanoTime();
					System.out.println("Does that number exist?" + newDoubleList.exists(size));
					end = System.nanoTime();
					System.out.println("search lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 4 :
				try{
					start = System.nanoTime();
					newDoubleList.delete();
					end = System.nanoTime();
					System.out.println("Delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 5:
				try{
					start = System.nanoTime();
					newDoubleList.cut();
					end = System.nanoTime();
					System.out.println("Delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 6:
				try{
					System.out.println("Insert the number to delete");
					size = in.nextInt();
					start = System.nanoTime();
					System.out.println(newDoubleList.delete(size));
					end = System.nanoTime();
					System.out.println("Delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 7:
				System.out.println(newDoubleList.describe());
			}
			System.out.println("Do you want to exit the double list menu ? (Yes / No)");
			exitDoubleListMenu(newDoubleList);
		}catch (Exception e){		
			System.out.println("Do you want to exit the double list menu ? (Yes / No)");
			exitDoubleListMenu(newDoubleList);
		}
		
	}
	
	
	private static void exitDoubleListMenu(DoubleList<Integer> newDoubleList){
		try{
			exit = in.next();
			switch (exit){
			case "Yes":
				break;
			case "No":
				DoubleListMenu(newDoubleList);
				break;
			default:
				exitDoubleListMenu(newDoubleList);
				break;
			}
		}catch (Exception e){
			System.out.println("Please enter Yes or No");
			DoubleListMenu(newDoubleList);
		}
	}
	
	private static void SimpleListMenu(SimpleList<Integer> SimpleList){
		System.out.println("What do you want to do ?");
		System.out.println("1) Insert at the beginning");
		System.out.println("2) Insert at the end");
		System.out.println("3) Search");
		System.out.println("4) Delete the beginning");
		System.out.println("5) Delete the end");
		System.out.println("6) Delete a node");
		System.out.println("7) Print");
		System.out.println("Enter your option");
		try{
			choose = in.nextInt();
			switch (choose){
			case 1:
				try{
					System.out.println("Insert the number to add: ");
					size = in.nextInt();
					start = System.nanoTime();
					SimpleList.insert(size);
					end = System.nanoTime();
					System.out.println("Adding lasted: " + (end - start));
					break;
				}catch(Exception e){
				}
			case 2: 
				try{
					System.out.println("Insert the number to add: ");
					size = in.nextInt();
					start = System.nanoTime();
					SimpleList.append(size);
					end = System.nanoTime();
					System.out.println("Adding lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 3:
				try{
					System.out.println("Insert the number to search");
					size = in.nextInt();
					start = System.nanoTime();
					System.out.println("Does that number exist?" + SimpleList.exists(size));
					end = System.nanoTime();
					System.out.println("Search lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 4 :
				try{
					start = System.nanoTime();
					SimpleList.delete();
					end = System.nanoTime();
					System.out.println("delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 5:
				try{
					start = System.nanoTime();
					SimpleList.cut();
					end = System.nanoTime();
					System.out.println("Delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 6:
				try{
					System.out.println("Insert the number to delete");
					size = in.nextInt();
					start = System.nanoTime();
					System.out.println(SimpleList.delete(size));
					end = System.nanoTime();
					System.out.println("Delete lasted: " + (end - start));
					break;
				}catch(Exception e){
					break;
				}
			case 7:
				System.out.println(SimpleList.describe());
			}
			System.out.println("Do you want to exit the simple list menu ? (Yes / No)");
			exitSimpleListenu(SimpleList);
		}catch (Exception e){
			System.out.println("Do you want to exit the simple list menu ? (Yes / No)");
			exitSimpleListenu(SimpleList);
		}
	}
	
	private static void exitSimpleListenu(SimpleList<Integer> SimpleList){
		try{
			exit = in.next();
			switch (exit){
			case "Yes":
				break;
			case "No":
				SimpleListMenu(SimpleList);
				break;
			default:
				exitSimpleListenu(SimpleList);
				break;
			}
		}catch (Exception e){
			System.out.println("Please enter Yes or No");
			exitSimpleListenu(SimpleList);
		}
	}
	
	//From this point, all the test corresponding to the simulator begin.
	
	private static void test1(){
		System.out.println("Start of the test");
		System.out.println("The test will add the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one\n");
		
		DataStructureChoose test = 
				new DataStructureChoose ("DoubleList", Simulator.size);
		
		System.out.println("Creating Double List with: " + Simulator.size + "Elements\n");
		DoubleList<Integer> newDoubleList = 
				(DoubleList<Integer>) test.createDataStructure();
		newDoubleList = (DoubleList<Integer>) newDoubleList;

		start = System.nanoTime();
		newDoubleList.insert(89);
		end = System.nanoTime();
		System.out.println("Adding at the beginning lasted: " + (end - start) + "nano seconds\n");
		
		start = System.nanoTime();
		newDoubleList.append(245);
		end = System.nanoTime();
		System.out.println("Adding at the end lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		newDoubleList.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		newDoubleList.delete();
		end = System.nanoTime();
		System.out.println("Deleting the first element lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		newDoubleList.cut();
		end = System.nanoTime();
		System.out.println("Deleting the end " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		newDoubleList.delete(45);
		end = System.nanoTime();
		System.out.println("Deleting a node lasted: " + (end - start)+ "nano seconds\n");
		
		System.out.println("Creating Simple List with: " + Simulator.size + "Elements");
		test.setStructKind("SimpleList");
		SimpleList<Integer> newSimpleList = 
				(SimpleList<Integer>) test.createDataStructure();
		
		start = System.nanoTime();
		newSimpleList.insert(567);
		end = System.nanoTime();
		System.out.println("adding at the beginning lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		newSimpleList.append(2234);
		end = System.nanoTime();
		System.out.println("Adding at the end lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		newSimpleList.exists(799);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		newSimpleList.delete();
		end = System.nanoTime();
		System.out.println("Deleting the first element lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		newSimpleList.cut();
		end = System.nanoTime();
		System.out.println("Deleting the last element lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		newSimpleList.delete(75);
		end = System.nanoTime();
		System.out.println("Deleting a node lasted: " + (end - start)+ "nano seconds\n");
		
	}
	private static void test2(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one\n");
		
		DataStructureChoose test = 
				new DataStructureChoose ("DoubleCircularList", Simulator.size);
		
		System.out.println("Creating Double Circular List with: " + Simulator.size + "Elements\n");
		DoubleCircularList<Integer> newDoubleCircularList = 
				(DoubleCircularList<Integer>) test.createDataStructure();
		newDoubleCircularList = (DoubleCircularList<Integer>) newDoubleCircularList;

		
		start = System.nanoTime();
		newDoubleCircularList.append(54);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start) + "nano seconds\n");
		
		start = System.nanoTime();
		newDoubleCircularList.exists(965);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start) + "nano seconds\n");
		
		start = System.nanoTime();
		newDoubleCircularList.delete(98);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start) + "nano seconds");
		
		System.out.println("Creating Simple Circular List with: " + Simulator.size + "Elements\n");
		test.setStructKind("SimpleCircularList");
		SimpleCircularList<Integer> newSimpleCircularList = 
				(SimpleCircularList<Integer>) test.createDataStructure();
		
		start = System.nanoTime();
		newSimpleCircularList.insert(10);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newSimpleCircularList.exists(34);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		newSimpleCircularList.delete(76);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds\n");
	}
	
	private static void test3(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one\n");
		
		DataStructureChoose test = 
				new DataStructureChoose ("AVLTree", Simulator.size);
		
		System.out.println("Creating AVL Tree with: " + Simulator.size + "Elements\n");
		AVLTree<Integer> ourAVLTree = 
				(AVLTree<Integer>) test.createDataStructure();
		ourAVLTree = (AVLTree<Integer>) ourAVLTree;
		
		start = System.nanoTime();
		ourAVLTree.insert(34);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourAVLTree.exists(9);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start) + "nano seconds\n");

		start = System.nanoTime();
		ourAVLTree.delete(753);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start) + "nano seconds\n");
		
		System.out.println("Creating Splay Tree: " + Simulator.size + "Elements\n");
		test.setStructKind("SplayTree");
		SplayTree<Integer> newSplayTree = 
				(SplayTree<Integer>) test.createDataStructure();

		start = System.nanoTime();
		newSplayTree.insert(142);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		newSplayTree.exists(435);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newSplayTree.delete(642);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds\n");
	}
	
	private static void test4(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one\n");
		
		DataStructureChoose test = 
				new DataStructureChoose ("SplayTree", Simulator.size);
		
		System.out.println("Creating Splay Tree with: " + Simulator.size + "Elements\n");
		SplayTree<Integer> ourSplayTree = 
				(SplayTree<Integer>) test.createDataStructure();
		ourSplayTree = (SplayTree<Integer>) ourSplayTree;
		
		start = System.nanoTime();
		ourSplayTree.insert(87);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		ourSplayTree.exists(12);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourSplayTree.delete(97);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds\n");
		
		System.out.println("Creating Splay Tree: " + Simulator.size + "Elementsv");
		test.setStructKind("BinaryTree");
		BinaryTree<Integer> newBinaryTree = 
				(BinaryTree<Integer>) test.createDataStructure();

		start = System.nanoTime();
		newBinaryTree.insert(53);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newBinaryTree.exists(23);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newBinaryTree.delete(65);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds\n");
	}
	
	private static void test5(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one\n");
		
		DataStructureChoose test = 
				new DataStructureChoose ("AVLTree", Simulator.size);
		
		System.out.println("Creating Splay Tree with: " + Simulator.size + "Elements\n");
		AVLTree<Integer> ourAVLTree = 
				(AVLTree<Integer>) test.createDataStructure();
		ourAVLTree = (AVLTree<Integer>) ourAVLTree;
		
		start = System.nanoTime();
		ourAVLTree.insert(123);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourAVLTree.exists(431);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourAVLTree.delete(612);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds\n");
		
		System.out.println("Creating Splay Tree: " + Simulator.size + "Elements\n");
		test.setStructKind("BinaryTree");
		BinaryTree<Integer> newBinaryTree = 
				(BinaryTree<Integer>) test.createDataStructure();

		start = System.nanoTime();
		newBinaryTree.insert(14);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newBinaryTree.exists(345);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newBinaryTree.delete(75);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds\n");
	}
	private static void test6(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one\n");
		
		DataStructureChoose test = 
				new DataStructureChoose ("QueueWithArray", Simulator.size);
		
		System.out.println("Creating Queue with array: " + Simulator.size + "Elements\n");
		QueueWithArray<Integer> ourQWA = 
				(QueueWithArray<Integer>) test.createDataStructure();
		ourQWA = (QueueWithArray<Integer>) ourQWA;

		start = System.nanoTime();
		ourQWA.Enqueue(4);
		end = System.nanoTime();
		System.out.println("Enqueueing lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourQWA.Dequeue();
		end = System.nanoTime();
		System.out.println("Dequeueing lasted: " + (end - start)+ "nano seconds\n");
		
		System.out.println("Creating Queue with List: " + Simulator.size + "Elements\n");
		test.setStructKind("QueueWithList");
		QueueWithList<Integer> ourQWL = 
				(QueueWithList<Integer>) test.createDataStructure();

		start = System.nanoTime();
		ourQWL.Enqueue(89);
		end = System.nanoTime();
		System.out.println("Enqueueing lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourQWL.Dequeue();
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds\n");
	}
	
	private static void test7(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one\n");
		
		DataStructureChoose test = 
				new DataStructureChoose ("StackWithArray", Simulator.size);
		
		System.out.println("Creating Queue with array: " + Simulator.size + "Elements\n");
		StackWithArray<Integer> ourSWA = 
				(StackWithArray<Integer>) test.createDataStructure();
		ourSWA = (StackWithArray<Integer>) ourSWA;
		
		start = System.nanoTime();
		ourSWA.push(234);
		end = System.nanoTime();
		System.out.println("Push lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		ourSWA.pop();
		end = System.nanoTime();
		System.out.println("Pop lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		ourSWA.top();
		end = System.nanoTime();
		System.out.println("Top lasted: " + (end - start)+ "nano seconds\n");
		
		System.out.println("Creating Queue with List: " + Simulator.size + "Elements\n");
		test.setStructKind("StackWithList");
		StackWithList<Integer> ourQWL = 
				(StackWithList<Integer>) test.createDataStructure();

		start = System.nanoTime();
		ourQWL.push(54);
		end = System.nanoTime();
		System.out.println("Push lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		ourQWL.top();
		end = System.nanoTime();
		System.out.println("Top lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourQWL.pop();
		end = System.nanoTime();
		System.out.println("Pop lasted: " + (end - start)+ "nano seconds\n");
	}
	
	private static void test8(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one\n");
		
		DataStructureChoose test = 
				new DataStructureChoose ("BiqueueWithList", Simulator.size);
		
		System.out.println("Creating Queue with array: " + Simulator.size + "Elements\n");
		BiQueueWithList<Integer> ourBQWL = 
				(BiQueueWithList<Integer>) test.createDataStructure();
		ourBQWL = (BiQueueWithList<Integer>) ourBQWL;
		
		start = System.nanoTime();
		ourBQWL.insert(13);
		end = System.nanoTime();
		System.out.println("Inserting at the beginning: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		ourBQWL.Dequeue();
		end = System.nanoTime();
		System.out.println("Deleting the beginning lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourBQWL.InsertAtEnd(345);
		end = System.nanoTime();
		System.out.println("Insert at the end lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourBQWL.cut();
		end = System.nanoTime();
		System.out.println("Deleting the last lasted: " + (end - start)+ "nano seconds\n");
	}
	private static void test9(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one\n");
		
		DataStructureChoose test = 
				new DataStructureChoose ("Array", Simulator.size);
		
		System.out.println("Creating array: " + Simulator.size + "Elements\n");
		Array<Integer> ourArray = 
				(Array<Integer>) test.createDataStructure();
		ourArray = (Array<Integer>) ourArray;

		start = System.nanoTime();
		ourArray.append(193);
		end = System.nanoTime();
		System.out.println("Add lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourArray.delete(780);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourArray.exists(3677);
		end = System.nanoTime();
		System.out.println("Search lasted: " + (end - start)+ "nano seconds");
		
		System.out.println("Creating Simple List with: " + Simulator.size + "Elements\n");
		test.setStructKind("SimpleList");
		SimpleList<Integer> newSimpleList = 
				(SimpleList<Integer>) test.createDataStructure();

		start = System.nanoTime();
		newSimpleList.append(12314);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newSimpleList.exists(9134);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newSimpleList.delete(345);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds\n");
	}
	
	private static void test10(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one\n");
		
		DataStructureChoose test = 
				new DataStructureChoose ("Array", Simulator.size);
		
		System.out.println("Creating array: " + Simulator.size + "Elements\n");
		Array<Integer> ourArray = 
				(Array<Integer>) test.createDataStructure();
		ourArray = (Array<Integer>) ourArray;
		
		start = System.nanoTime();
		ourArray.append(34);
		end = System.nanoTime();
		System.out.println("Add lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourArray.delete(435);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourArray.exists(976);
		end = System.nanoTime();
		System.out.println("Search lasted: " + (end - start)+ "nano seconds\n");
		
		System.out.println("Creating Double List with: " + Simulator.size + "Elements\n");
		test.setStructKind("DoubleList");
		DoubleList<Integer> newDoubleList = 
				(DoubleList<Integer>) test.createDataStructure();

		start = System.nanoTime();
		newDoubleList.append(19);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newDoubleList.exists(29);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newDoubleList.delete(37);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds\n");
	}
	
	private static void test12(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one\n");
		
		DataStructureChoose test = 
				new DataStructureChoose ("Array", Simulator.size);
		
		System.out.println("Creating array: " + Simulator.size + "Elements\n");
		Array<Integer> ourArray = 
				(Array<Integer>) test.createDataStructure();
		ourArray = (Array<Integer>) ourArray;

		start = System.nanoTime();
		ourArray.append(476);
		end = System.nanoTime();
		System.out.println("Add lasted: " + (end - start)+ "nano seconds\n");
		
		start = System.nanoTime();
		ourArray.delete(489);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourArray.exists(439);
		end = System.nanoTime();
		System.out.println("Search lasted: " + (end - start)+ "nano seconds\n");
		
		System.out.println("Creating Double Circular List with: " + Simulator.size + "Elements\n");
		test.setStructKind("DoubleCircularList");
		DoubleCircularList<Integer> newDoubleCircularList = 
				(DoubleCircularList<Integer>) test.createDataStructure();

		start = System.nanoTime();
		newDoubleCircularList.append(43);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newDoubleCircularList.exists(2352);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newDoubleCircularList.delete(523);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds\n");
	}
	
	private static void test11(){
		System.out.println("Start of the test");
		System.out.println("The test will the elements to each structure");
		System.out.println("Then, it will do the corresponding operations for each one\n");
		
		DataStructureChoose test = 
				new DataStructureChoose ("Array", Simulator.size);
		
		System.out.println("Creating array: " + Simulator.size + "Elements\n");
		Array<Integer> ourArray = 
				(Array<Integer>) test.createDataStructure();
		ourArray = (Array<Integer>) ourArray;

		start = System.nanoTime();
		ourArray.append(25);
		end = System.nanoTime();
		System.out.println("Add lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourArray.delete(234);
		end = System.nanoTime();
		System.out.println("Delete lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		ourArray.exists(7654);
		end = System.nanoTime();
		System.out.println("Search lasted: " + (end - start)+ "nano seconds\n");
		
		System.out.println("Creating Simple Circular List with: " + Simulator.size + "Elements\n");
		test.setStructKind("SimpleCircularList");
		SimpleCircularList<Integer> newSimpleCircularList = 
				(SimpleCircularList<Integer>) test.createDataStructure();
		
		start = System.nanoTime();
		newSimpleCircularList.append(2234);
		end = System.nanoTime();
		System.out.println("Adding lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newSimpleCircularList.exists(9999);
		end = System.nanoTime();
		System.out.println("Searching lasted: " + (end - start)+ "nano seconds\n");

		start = System.nanoTime();
		newSimpleCircularList.delete(444);
		end = System.nanoTime();
		System.out.println("Deleting lasted: " + (end - start)+ "nano seconds\n");
	}
	
}
