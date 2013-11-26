import interfaces.DataStructure;
import listgenerator.DataStructureChoose;

import org.junit.Test;

import queue.QueueWithArray;
import trees.binary.BinaryTree;

import doublelist.DoubleList;

/**
 * 
 */

/**
 * @author zyoruk
 *
 */
public class ChoosingStructs {

	double _start = 0;
	double _end = 0;
	@Test
	public void BinayTreeTester(){
		
		System.out.println("<<<<<<<<<<<<<<<<<TESTING BINARY TREE>>>>>>>>>>>>>>");
		DataStructureChoose testBinaryTree = 
							new DataStructureChoose ("BinaryTree", 20);
		
		
		DataStructure<Integer> newDoubleList = 
							   testBinaryTree.createDataStructure();
		newDoubleList = (BinaryTree<Integer>) newDoubleList;
		System.out.println(testBinaryTree.getStructureKind());
		System.out.println(newDoubleList.describe());
		System.out.println("<<<<<<<<<<<<<<<END OF BINARY TREE TESTER>>>>>>>>>");
	}
	
	@Test
	public void DoubleListTester(){		
		
		System.out.println("<<<<<<<<<<<<<<<<<TESTING DOUBLE LIST>>>>>>>>>>>>>>");
		DataStructureChoose testDoubleList = 
							new DataStructureChoose ("DoubleList", 20);
		
		DataStructure<Integer> newDoubleList = 
							   testDoubleList.createDataStructure();
		newDoubleList = (DoubleList<Integer>) newDoubleList;
		System.out.println(testDoubleList.getStructureKind());
		System.out.println(newDoubleList.describe());
		System.out.println("<<<<<<<<<<<<<<<END OF DOUBLE LIST TESTER>>>>>>>>>");
	}
	
	@Test
	public void SimpleCircularListTester(){	
		
		
		System.out.println("<<<<<<<<<<<<<<<<<TESTING SIMPLE CIRCULAR LIST>>>>>>>>>>>>>>");
		DataStructureChoose testSimpleCircularList = 
							new DataStructureChoose ("SimpleCircularList", 20);
		
		DataStructure<Integer> newSimpleCircularList = 
							   testSimpleCircularList.createDataStructure();
		
		System.out.println(testSimpleCircularList.getStructureKind());
		System.out.println(newSimpleCircularList.describe());
		System.out.println("<<<<<<<<<<<<<<<END OF SIMPLE CIRCULAR LIST TESTER>>>>>>>>>");
	}
	
	@Test
	public void DoubleCircularListTester(){	
		
		
		System.out.println("<<<<<<<<<<<<<<<<<TESTING DOUBLE CIRCULAR LIST>>>>>>>>>>>>>>");
		DataStructureChoose testDoubleCircularList = 
							new DataStructureChoose ("DoubleCircularList", 20);
		
		DataStructure<Integer> newDoubleCircularList = 
							   testDoubleCircularList.createDataStructure();
		
		System.out.println(testDoubleCircularList.getStructureKind());
		System.out.println(newDoubleCircularList.describe());
		System.out.println("<<<<<<<<<<<<<<<END OF DOUBLE CIRCULAR LIST TESTER>>>>>>>>>");
	}
	
	@Test
	public void QueueWithListTester(){	
		
		
		System.out.println("<<<<<<<<<<<<<<<<<TESTING  QUEUE WITH LIST >>>>>>>>>>>>>>");
		DataStructureChoose testQueue = 
							new DataStructureChoose ("QueueWithList", 20);
		
		DataStructure<Integer> newQueue = 
							   testQueue.createDataStructure();
		
		System.out.println(testQueue.getStructureKind());
		System.out.println(newQueue.describe());
		System.out.println("<<<<<<<<<<<<<<<END OF QUEUE WITH LIST TESTER>>>>>>>>>");
	}
	
	@Test
	public void SimpleListTester(){
		System.out.println("<<<<<<<<<<<<<<<<<TESTING SIMPLELIST>>>>>>>>>>>>>>");
		DataStructureChoose testSimpleList = 
							new DataStructureChoose ("SimpleList", 20);
		
		DataStructure<Integer> newSimpleList = 
							   testSimpleList.createDataStructure();
		
		System.out.println(testSimpleList.getStructureKind());
		System.out.println(newSimpleList.describe());
		System.out.println("<<<<<<<<<<<<<<<END OF SIMPLE LIST TESTER>>>>>>>>>");
	}
	
	@Test
	public void StackWithListTester(){
		System.out.println("<<<<<<<<<<<<<<<<<TESTING STACK WITH LIST >>>>>>>>>>>>>>");
		DataStructureChoose testStack = 
							new DataStructureChoose ("StackWithList", 20);
		
		DataStructure<Integer> newStack = 
							   testStack.createDataStructure();
		
		System.out.println(testStack.getStructureKind());
		System.out.println(newStack.describe());
		System.out.println("<<<<<<<<<<<<<<<END OF STACK WITH LIST TESTER>>>>>>>>>");
	}
	
	@Test
	public void StackWithArrayTester(){
		System.out.println("<<<<<<<<<<<<<<<<<TESTING STACK WITH ARRAY >>>>>>>>>>>>>>");
		DataStructureChoose testStack = 
							new DataStructureChoose ("StackWithArray", 20);
		
		DataStructure<Integer> newStack = 
							   testStack.createDataStructure();
		
		System.out.println(testStack.getStructureKind());
		System.out.println(newStack.describe());
		System.out.println("<<<<<<<<<<<<<<<END OF STACK WITH ARRAY TESTER>>>>>>>>>");
	}
	
	@Test
	public void QueueWithArrayTester(){
		System.out.println("<<<<<<<<<<<<<<<<<TESTING QUEUE WITH ARRAY >>>>>>>>>>>>>>");
		DataStructureChoose testQueue = 
							new DataStructureChoose ("QueueWithArray", 20);
		DataStructure<Integer> newQueue = 
							   testQueue.createDataStructure();
		newQueue = (QueueWithArray<Integer>) newQueue;
		System.out.println(testQueue.getStructureKind());
		System.out.println(newQueue.describe());
		System.out.println(newQueue.isEmpty());
		System.out.println("<<<<<<<<<<<<<<<END OF QUEUE WITH ARRAY TESTER>>>>>>>>>");
	}
}


