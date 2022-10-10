public class MinHeap {
	final int SIZE = 7;
	int MinArray[];
	int currentSize = 0;
	
	public MinHeap() {
		MinArray = new int[SIZE];
	}
	
	public void insert(int value) {
		if (currentSize == SIZE) {
			System.out.println("Heap is full");
			return;
		}
		int index = currentSize;
		currentSize++;
		MinArray[index] = value;
		minHeapifyUp(index);
	}
	
	private void minHeapifyUp(int position) {
		int parentIndex = position/2;
		int currentIndex = position;
		
		while (currentIndex > 0 && MinArray[parentIndex] > MinArray[currentIndex]) {
			swap(currentIndex, parentIndex);
			currentIndex = parentIndex;
			parentIndex = parentIndex/2;
		}
	}
		
	private void minHeapifyDown(int position) {
		int parentIndex = position/2;
		int currentIndex = position;
		
		while (currentIndex > 0 && MinArray[parentIndex] < MinArray[currentIndex]) {
			swap(currentIndex, parentIndex);
			parentIndex = currentIndex;
			currentIndex = currentIndex/2;
		}
	}
		
	public int findMin() {
		int Min = 100;
		if (MinArray == null) {
			return -1;
		}
		else {
			for (int i = 0; i < SIZE; i++) {
				if (MinArray[i] < Min) {
					Min = MinArray[i];
				}
			}
			return Min;
		}
	}
		
	public int extractMin() {
		int Min = 100;
		int delete_index = 0;
		
		if (MinArray == null) {
			return -1;
		}
		else {
			for (int i = 0; i < SIZE; i++) {
				if (MinArray[i] < Min) {
					Min = MinArray[i];
					delete_index = i;
				}
			}
			MinArray[delete_index] = 0;
			return Min;
		}
	}
	
	public int Test_extractMin() { // This is for testing.
		int Min = 100;
		int delete_index = 0;
		
		if (MinArray == null) {
			return -1;
		}
		else {
			for (int i = 0; i < SIZE; i++) {
				if (MinArray[i] < Min) {
					Min = MinArray[i];
					delete_index = i;
				}
			}
			MinArray[delete_index] = 0;
			System.out.println("List after extract: ");
			System.out.print("[");
			for (int i = 0; i < MinArray.length; i++) {
				System.out.print(" " + MinArray[i]);
			}
			System.out.println(" ]");
			return Min;
		}
	}
	
	public void display() {
		System.out.print("[");
		for (int i = 0; i < MinArray.length; i++) {
			System.out.print(" " + MinArray[i]);
		}
	System.out.println(" ]");
	}
	
	public void swap(int a , int b) {
		int temp = MinArray[a];
		MinArray[a] = MinArray[b];
		MinArray[b] = temp;
	}
	
	public boolean isEmpty() {
		return (currentSize == 0);
	}
}

class Node {
  private Node left;
  private Node right;
  private int data;
  
  public Node(int data) {
    left = right = null;
    this.data = data;
  }
  
  public int getData() {
    return data;
  }
  public Node getLeft() {
    return left;
  }
  public Node getRight() {
    return right;
  }
  
  public void setLeft(Node left) {
    this.left = left;
  }
  public void setRight(Node right) {
    this.right = right;
  }  
  public void setData(int data) {
    this.data = data;
  }
}