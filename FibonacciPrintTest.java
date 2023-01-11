import java.util.Arrays;

public class FibonacciPrintTest {
	public static void main(String[] args){
		FibonacciHeap printTestHeap = new FibonacciHeap(); // create a new heap
		// insert 1,2,3,4,5
		printTestHeap.insert(1);
		printTestHeap.insert(2);
		printTestHeap.insert(3);
		printTestHeap.insert(4);
		printTestHeap.insert(5);
		HeapPrinter heapPrinter = new HeapPrinter(System.out); //create new HeapPrinter object
		System.out.println("heapPrinter: values- false:");
		heapPrinter.print(printTestHeap, false); // print the heap structure. values = false
		System.out.println("heapPrinter: values- true:");
		heapPrinter.print(printTestHeap, true); // print the heap structure. values = true
		printTestHeap.deleteMin();
		System.out.println("heapPrinter: values- false:");
		heapPrinter.print(printTestHeap, false);
		System.out.println("heapPrinter: values- true:");
		heapPrinter.print(printTestHeap, true);
	}

}
