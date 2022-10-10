import java.util.Random;

public class TestHeap {
  public static void main(String[] args) {
	Random random = new Random();
	
    MaxHeap max_heap = new MaxHeap();
	System.out.println("[   MaxHeap  ]");
	System.out.println("______________");
	System.out.println("Empty List:");
	max_heap.display();
	System.out.println(("Find Max: ") + max_heap.findMax());
	System.out.println(("Extract Max: ") + max_heap.Test_extractMax());
	System.out.println(("is Empty? ") + max_heap.isEmpty());
	
	for (int i = 0; i < 7; i++) {
		int a = random.nextInt(100);
		max_heap.insert(a);
	}
	System.out.println("");
	System.out.println("List with Integers:");
	max_heap.display();
	System.out.println(("Find Max: ") + max_heap.findMax());
	System.out.println(("Extract Max: ") + max_heap.Test_extractMax());
	System.out.println(("is Empty? ") + max_heap.isEmpty());
	System.out.println("");
	
	System.out.println("");
	
	MinHeap min_heap = new MinHeap();
	System.out.println("[   MinHeap  ]");
	System.out.println("______________");
	System.out.println("Empty List:");
	min_heap.display();
	System.out.println(("Find Min: ") + min_heap.findMin());
	System.out.println(("Extract Min: ") + min_heap.Test_extractMin());
	System.out.println(("is Empty? ") + min_heap.isEmpty());
	
	for (int i = 0; i < 7; i++) {
		int b = random.nextInt(100);
		min_heap.insert(b);
	}
	System.out.println("");
	System.out.println("List with Integers:");
	min_heap.display();
	System.out.println(("Find Min: ") + min_heap.findMin());
	System.out.println(("Extract Min: ") + min_heap.Test_extractMin());
	System.out.println(("is Empty? ") + min_heap.isEmpty());
  }
}