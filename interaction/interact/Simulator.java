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
		mainMenu();

	}
	private static void mainMenu(){
		System.out.println("Welcome to the main menu");
		System.out.println("Please choose: ");
		System.out.println("1)Do you want to see tests?" + 
							"\n2)Do you want to use data structures?");
		System.out.println("Enter 1 or 2 and hit enter ");
		
		try{
			choose = in.nextInt();
			switch (choose){
			case 1 :
				simulatorMenu();
			case 2 :
				structureInteractionMenu();
				break;	
			}
			System.out.println("Do you want to exit the Main Menu?");
			exitMainMenu();
		}catch(Exception e){
			System.out.println("Do you want to exit? the Main Menu");
			exitMainMenu();
		}
	}
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

	private static void simulatorMenu(){
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
		simulator();
	}
	
	private static void simulator(){
		try{
			System.out.println("Write the option number:");
			choose = in.nextInt();
			System.out.println("Please, now enter how large you want the structure to be (larger than 1 less than 100 000): ");
			size = in.nextInt();
			switch (choose) {
				case 1:
				test1();
				case 2:  choose = 2;
				test2();
				case 3:  choose = 3;
				test3();
				case 4:  choose = 4;
				test4();
				case 5:  choose = 5;
				test5();
				case 6:  choose = 6;
				test6();
				case 7:  choose = 7;
				test7();
				case 8:  choose = 8;
				test8();
				case 9:  choose = 9;
				test9();
				case 10: choose = 10;
				test10();
				case 11: choose = 11;
				test11();
				case 12: choose = 12;
				test12();
				default:
					System.out.println("Invalid integer");
			}
			System.out.println("Do you want to exit the simulator?");
			exitSimulator();
		}catch(Exception e){
			System.out.println("Do you want to exitthe simulator?");
			exitSimulator();
		}
	}
	
	private static void exitSimulator(){
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
	}
	
	private	static void structureInteractionMenu(){
		System.out.println("Welcome to the structure Interaction menu");
		System.out.println("Please, choose which structure you want to interact with\n " +
				"1) Simple List\n" +
				"2) Double List\n" +
				"3) Simple Circular Linked list\n" +
				"4) Doubly Linked Circular List\n" +
				"5) AVL tree\n" +
				"6) Binary Tree\n" +
				"7) Splay Tree\n" +
				"8) Queue implemented with list\n" +
				"9) Queue implemented with array\n" +
				"10) Priority Queue\n" +
				"11) Biqueue\n" +
				"12) Array\n");
		structureInteraction();
	}
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
				
			}
		}catch (Exception e){
		}
	}
	
	private static void structureMenu(String pType){
		try{
			System.out.println("Enter the size of the structure:");
			size = in.nextInt();
			DataStructureChoose ourDataStruct = new DataStructureChoose(pType, size);

			if (ourDataStruct.getStructureKind() == "DoubleList"){
				DoubleList<Integer> newDoubleList = 
						(DoubleList<Integer>) ourDataStruct.createDataStructure();
				newDoubleList = (DoubleList<Integer>) newDoubleList;
				System.out.println("What do you want to do ?");
				System.out.println("1) Insert at the beginning");
				System.out.println("2) Insert at the end");
				System.out.println("3) Search");
				System.out.println("4) Delete the beginning");
				System.out.println("5) Delete the end");
				System.out.println("6) Delete a node");
				System.out.println("Enter your option");
				try{
					choose = in.nextInt();
					switch (choose){
					case 1:
						try{
							System.out.println("Insert the number to add: ");
							size = in.nextInt();
							newDoubleList.insert(size);
						}catch(Exception e){
						}
					case 2: 
						try{
							System.out.println("Insert the number to add: ");
							size = in.nextInt();
							newDoubleList.append(size);
						}catch(Exception e){
						}
					case 3:
						try{
							System.out.println("Insert the number to search");
							size = in.nextInt();
							System.out.println("Does that number exist?" + newDoubleList.exists(size));
						}catch(Exception e){
						}
					case 4 :
						try{
							newDoubleList.delete();
						}catch(Exception e){
						}
					case 5:
						try{
							newDoubleList.cut();
						}catch(Exception e){
						}
					case 6:
						try{
							System.out.println("Insert the number to delete");
							size = in.nextInt();
							System.out.println("Does that number exist?" + newDoubleList.exists(size));
						}catch(Exception e){
						}
					}
				}catch (Exception e){					
				}
				
				
			}else if(ourDataStruct.getStructureKind() == "SimpleList"){
				SimpleList<Integer> SimpleList = 
						(SimpleList<Integer>) ourDataStruct.createDataStructure();
				SimpleList = (SimpleList<Integer>) SimpleList;
				System.out.println("What do you want to do ?");
				System.out.println("1) Insert at the beginning");
				System.out.println("2) Insert at the end");
				System.out.println("3) Search");
				System.out.println("4) Delete the beginning");
				System.out.println("5) Delete the end");
				System.out.println("6) Delete a node");
				System.out.println("Enter your option");
				try{
					choose = in.nextInt();
					switch (choose){
					case 1:
						try{
							System.out.println("Insert the number to add: ");
							size = in.nextInt();
							SimpleList.insert(size);
						}catch(Exception e){
						}
					case 2: 
						try{
							System.out.println("Insert the number to add: ");
							size = in.nextInt();
							SimpleList.append(size);
						}catch(Exception e){
						}
					case 3:
						try{
							System.out.println("Insert the number to search");
							size = in.nextInt();
							System.out.println("Does that number exist?" + SimpleList.exists(size));
						}catch(Exception e){
						}
					case 4 :
						try{
							SimpleList.delete();
						}catch(Exception e){
						}
					case 5:
						try{
							SimpleList.cut();
						}catch(Exception e){
						}
					case 6:
						try{
							System.out.println("Insert the number to delete");
							size = in.nextInt();
							System.out.println("Does that number exist?" + SimpleList.exists(size));
						}catch(Exception e){
						}
					}
				}catch (Exception e){					
				}
				
				
				
			}else if(ourDataStruct.getStructureKind() == "SimpleCircularList"){
				SimpleCircularList<Integer> SimpleCircularList = 
						(SimpleCircularList<Integer>) ourDataStruct.createDataStructure();
				SimpleCircularList = (SimpleCircularList<Integer>) SimpleCircularList;
				System.out.println("What do you want to do ?");
				System.out.println("1) Insert");
				System.out.println("2) Search");
				System.out.println("3) Delete");
				System.out.println("4) Delete a node");
				System.out.println("Enter your option");
				try{
					choose = in.nextInt();
					switch (choose){
					case 1:
						try{
							System.out.println("Insert the number to add: ");
							size = in.nextInt();
							SimpleCircularList.append(size);
						}catch(Exception e){
						}
					case 2:
						try{
							System.out.println("Insert the number to search");
							size = in.nextInt();
							System.out.println("Does that number exist?" + SimpleCircularList.exists(size));
						}catch(Exception e){
						}
					case 3:
						try{
							SimpleCircularList.delete();
						}catch(Exception e){
						}
					case 4:
						try{
							System.out.println("Insert the number to delete");
							size = in.nextInt();
							System.out.println("Does that number exist?" + SimpleCircularList.exists(size));
						}catch(Exception e){
						}
					}
				}catch (Exception e){					
				}
								

			}else if(ourDataStruct.getStructureKind()  == "DoubleCircularList"){
				DoubleCircularList<Integer> DoubleCircularList = 
						(DoubleCircularList<Integer>) ourDataStruct.createDataStructure();
				DoubleCircularList = (DoubleCircularList<Integer>) DoubleCircularList;

				System.out.println("What do you want to do ?");
				System.out.println("1) Insert");
				System.out.println("2) Search");
				System.out.println("3) Delete");
				System.out.println("4) Delete a node");
				System.out.println("Enter your option");
				try{
					choose = in.nextInt();
					switch (choose){
					case 1:
						try{
							System.out.println("Insert the number to add: ");
							size = in.nextInt();
							DoubleCircularList.append(size);
						}catch(Exception e){
						}
					case 2:
						try{
							System.out.println("Insert the number to search");
							size = in.nextInt();
							System.out.println("Does that number exist?" + DoubleCircularList.exists(size));
						}catch(Exception e){
						}
					case 3:
						try{
							DoubleCircularList.delete();
						}catch(Exception e){
						}
					case 4:
						try{
							System.out.println("Insert the number to delete");
							size = in.nextInt();
							System.out.println("Does that number exist?" + DoubleCircularList.exists(size));
						}catch(Exception e){
						}
					}
				}catch (Exception e){					
				}
								

			}else if(ourDataStruct.getStructureKind() == "QueueWithArray"){
				QueueWithArray<Integer> QueueWithArray = 
						(QueueWithArray<Integer>) ourDataStruct.createDataStructure();
				QueueWithArray = (QueueWithArray<Integer>) QueueWithArray;
				

				System.out.println("What do you want to do ?");
				System.out.println("1) Dequeue");
				System.out.println("2) Enqueue");
				System.out.println("Enter your option");
				try{
					choose = in.nextInt();
					switch (choose){
					case 1:
						try{
							System.out.println("Insert the number to enqueue: ");
							size = in.nextInt();
							QueueWithArray.Enqueue(size);
						}catch(Exception e){
						}
					case 3:
						try{
							QueueWithArray.Dequeue();
						}catch(Exception e){
						}
					}
				}catch (Exception e){					
				}
								
			}else if(ourDataStruct.getStructureKind() == "QueueWithList"){
				QueueWithList<Integer> QueueWithList = 
						(QueueWithList<Integer>) ourDataStruct.createDataStructure();
				QueueWithList = (QueueWithList<Integer>) QueueWithList;
				System.out.println("What do you want to do ?");
				System.out.println("1) Dequeue");
				System.out.println("2) Enqueue");
				System.out.println("Enter your option");
				try{
					choose = in.nextInt();
					switch (choose){
					case 1:
						try{
							System.out.println("Insert the number to enqueue: ");
							size = in.nextInt();
							QueueWithList.Enqueue(size);
						}catch(Exception e){
						}
					case 3:
						try{
							QueueWithList.Dequeue();
						}catch(Exception e){
						}
					}
				}catch (Exception e){					
				}
					
			}else if(ourDataStruct.getStructureKind()  == "StackWithArray"){
				StackWithArray<Integer> StackWithArray = 
						(StackWithArray<Integer>) ourDataStruct.createDataStructure();
				StackWithArray = (StackWithArray<Integer>) StackWithArray;
				System.out.println("What do you want to do ?");
				System.out.println("1) pop");
				System.out.println("2) top");
				System.out.println("2) push");
				System.out.println("Enter your option");
				try{
					choose = in.nextInt();
					switch (choose){
					case 1:
						try{
							StackWithArray.pop();
						}catch(Exception e){
						}
					case 2:
						try{
							StackWithArray.top();
						}catch(Exception e){
						}
					case 3 : 
						try{
							System.out.println("Insert the number to push: ");
							size = in.nextInt();
							StackWithArray.push(size);
						}catch(Exception e){
						}
					}
				}catch (Exception e){					
				}
					
				
			}else if(ourDataStruct.getStructureKind()  == "StackWithList"){
				StackWithList<Integer> StackWithList = 
						(StackWithList<Integer>) ourDataStruct.createDataStructure();
				StackWithList = (StackWithList<Integer>) StackWithList;
				
				System.out.println("What do you want to do ?");
				System.out.println("1) pop");
				System.out.println("2) top");
				System.out.println("2) push");
				System.out.println("Enter your option");
				try{
					choose = in.nextInt();
					switch (choose){
					case 1:
						try{
							StackWithList.pop();
						}catch(Exception e){
						}
					case 2:
						try{
							StackWithList.top();
						}catch(Exception e){
						}
					case 3 : 
						try{
							System.out.println("Insert the number to push: ");
							size = in.nextInt();
							StackWithList.push(size);
						}catch(Exception e){
						}
					}
				}catch (Exception e){					
				}
					
				
			}else if(ourDataStruct.getStructureKind()  == "PriorityQueue"){
				PriorityQueue<Integer> PriorityQueue = 
						(PriorityQueue<Integer>) ourDataStruct.createDataStructure();
				PriorityQueue = (PriorityQueue<Integer>) PriorityQueue;
				
				System.out.println("What do you want to do ?");
				System.out.println("1) Dequeue");
				System.out.println("2) Enqueue");
				System.out.println("Enter your option");
				try{
					choose = in.nextInt();
					switch (choose){
					case 1:
						try{
							System.out.println("Insert the number to enqueue: ");
							size = in.nextInt();
							PriorityQueue.Enqueue(size);
						}catch(Exception e){
						}
					case 3:
						try{
							PriorityQueue.Dequeue();
						}catch(Exception e){
						}
					}
				}catch (Exception e){					
				}
					
			}else if(ourDataStruct.getStructureKind()  == "BiQueueWithList"){
				BiQueueWithList<Integer> BiQueueWithList = 
						(BiQueueWithList<Integer>) ourDataStruct.createDataStructure();
				BiQueueWithList = (BiQueueWithList<Integer>) BiQueueWithList;
				
				System.out.println("What do you want to do ?");
				System.out.println("1) Insert at the beginning");
				System.out.println("2) Insert at the end");
				System.out.println("3) Search");
				System.out.println("4) Delete the beginning");
				System.out.println("5) Delete the end");
				System.out.println("Enter your option");
				try{
					choose = in.nextInt();
					switch (choose){
					case 1:
						try{
							System.out.println("Insert the number to add: ");
							size = in.nextInt();
							BiQueueWithList.insert(size);
						}catch(Exception e){
						}
					case 2:
						try{
							System.out.println("Insert the number to add: ");
							size = in.nextInt();
							BiQueueWithList.append(size);
						}catch(Exception e){
						}
					case 3:
						try{
							System.out.println("Insert the number to search");
							size = in.nextInt();
							System.out.println("Does that number exist?" + BiQueueWithList.exists(size));
						}catch(Exception e){
						}
					case 4:
						try{
							System.out.println("Insert the number to delete: ");
							size = in.nextInt();
							BiQueueWithList.delete();
						}catch(Exception e){
						}
					case 5:
						try{
							System.out.println("Insert the number to delete");
							size = in.nextInt();
							BiQueueWithList.cut();
						}catch(Exception e){
						}
					}
				}catch (Exception e){					
				}
								

			}else if(ourDataStruct.getStructureKind()  == "Array"){
				Array<Integer> Array = 
						(Array<Integer>) ourDataStruct.createDataStructure();
				Array = (Array<Integer>) Array;
				System.out.println("What do you want to do ?");
				System.out.println("1) Insert");
				System.out.println("2) Search");
				System.out.println("3) Delete");
				System.out.println("Enter your option");
				try{
					choose = in.nextInt();
					switch (choose){
					case 1:
						try{
							System.out.println("Insert the number to add: ");
							size = in.nextInt();
							Array.append(size);
						}catch(Exception e){
						}
					case 2:
						try{
							System.out.println("Insert the number to search");
							size = in.nextInt();
							System.out.println("Does that number exist?" + Array.exists(size));
						}catch(Exception e){
						}
					case 3:
						try{
							System.out.println("Insert the number to delete: ");
							size = in.nextInt();
							Array.delete(size);
						}catch(Exception e){
						}
					}
				}catch(Exception e){					
				}
			}else if(ourDataStruct.getStructureKind() == "AVLTree"){
				AVLTree<Integer> AVLTree = 
						(AVLTree<Integer>) ourDataStruct.createDataStructure();
				AVLTree = (AVLTree<Integer>) AVLTree;
				
			}else if(ourDataStruct.getStructureKind()  == "BinaryTree"){
				BinaryTree<Integer> BinaryTree = 
						(BinaryTree<Integer>) ourDataStruct.createDataStructure();
				BinaryTree = (BinaryTree<Integer>) BinaryTree;
				
			}else if(ourDataStruct.getStructureKind()  == "SplayTree"){
				SplayTree<Integer> SplayTree = 
						(SplayTree<Integer>) ourDataStruct.createDataStructure();
				SplayTree = (SplayTree<Integer>) SplayTree;
			}
		}catch (Exception e){
			
		}
	}
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
		ourArray.search(3677);
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
		ourArray.search(976);
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
		ourArray.search(439);
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
		ourArray.search(7654);
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
