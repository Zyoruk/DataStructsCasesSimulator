import interfaces.ListInterface;
import listgenerator.DataStructureChoose;

import org.junit.Test;

/**
 * 
 */

/**
 * @author zyoruk
 *
 */
public class ChoosingStructs {

	@Test
	public void DoubleListTester(){		
		
		System.out.println("<<<<<<<<<<<<<<<<<TESTING DOUBLE LIST>>>>>>>>>>>>>>");
		DataStructureChoose testDoubleList = 
							new DataStructureChoose ("DoubleList", 20);
		
		ListInterface<Integer> newDoubleList = 
							   testDoubleList.createDataStructure();
		
		System.out.println(testDoubleList.getStructureKind());
		System.out.println(newDoubleList.describe());
		System.out.println("<<<<<<<<<<<<<<<END OF DOUBLE LIST TESTER>>>>>>>>>");
	}
	
	@Test
	public void SimpleCircularListTester(){	
		
		
		System.out.println("<<<<<<<<<<<<<<<<<TESTING SIMPLE CIRCULAR LIST>>>>>>>>>>>>>>");
		DataStructureChoose testSimpleCircularList = 
							new DataStructureChoose ("SimpleCircularList", 20);
		
		ListInterface<Integer> newSimpleCircularList = 
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
		
		ListInterface<Integer> newDoubleCircularList = 
							   testDoubleCircularList.createDataStructure();
		
		System.out.println(testDoubleCircularList.getStructureKind());
		System.out.println(newDoubleCircularList.describe());
		System.out.println("<<<<<<<<<<<<<<<END OF DOUBLE CIRCULAR LIST TESTER>>>>>>>>>");
	}
	
	@Test
	public void QueueTester(){	
		
		
		System.out.println("<<<<<<<<<<<<<<<<<TESTING QUEUE>>>>>>>>>>>>>>");
		DataStructureChoose testQueue = 
							new DataStructureChoose ("Queue", 20);
		
		ListInterface<Integer> newQueue = 
							   testQueue.createDataStructure();
		
		System.out.println(testQueue.getStructureKind());
		System.out.println(newQueue.describe());
		System.out.println("<<<<<<<<<<<<<<<END OF QUEUE TESTER>>>>>>>>>");
	}
	
	@Test
	public void SimpleListTester(){
		System.out.println("<<<<<<<<<<<<<<<<<TESTING SIMPLELIST>>>>>>>>>>>>>>");
		DataStructureChoose testSimpleList = 
							new DataStructureChoose ("SimpleList", 20);
		
		ListInterface<Integer> newSimpleList = 
							   testSimpleList.createDataStructure();
		
		System.out.println(testSimpleList.getStructureKind());
		System.out.println(newSimpleList.describe());
		System.out.println("<<<<<<<<<<<<<<<END OF SIMPLE LIST TESTER>>>>>>>>>");
	}
	
	@Test
	public void StackTester(){
		System.out.println("<<<<<<<<<<<<<<<<<TESTING STACK>>>>>>>>>>>>>>");
		DataStructureChoose testStack = 
							new DataStructureChoose ("Stack", 20);
		
		ListInterface<Integer> newStack = 
							   testStack.createDataStructure();
		
		System.out.println(testStack.getStructureKind());
		System.out.println(newStack.describe());
		System.out.println("<<<<<<<<<<<<<<<END OF STACK TESTER>>>>>>>>>");
	}
}


