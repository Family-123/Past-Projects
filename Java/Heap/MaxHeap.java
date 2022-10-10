import java.util.Random;

public class MaxHeap {
	final int SIZE = 7;
	int MaxArray[];
	int currentSize = 0;
	
	public MaxHeap() {
		MaxArray = new int[SIZE];
	}
	
	public void insert(int value) {
		if (currentSize == SIZE) {
			System.out.println("Heap is full");
			return;
		}
		int index = currentSize;
		currentSize++;
		MaxArray[index] = value;
		maxHeapifyDown(index);
	}
	
	private void maxHeapifyUp(int position) {
		int parentIndex = position/2;
		int currentIndex = position;
		
		while (currentIndex > 0 && MaxArray[parentIndex] > MaxArray[currentIndex]) {
			swap(currentIndex, parentIndex);
			currentIndex = parentIndex;
			parentIndex = parentIndex/2;
		}
	}
		
	private void maxHeapifyDown(int position) {
		int parentIndex = position/2;
		int currentIndex = position;
		
		while (currentIndex > 0 && MaxArray[parentIndex] < MaxArray[currentIndex]) {
			swap(currentIndex, parentIndex);
			parentIndex = currentIndex;
			currentIndex = currentIndex/2;
		}
	}
		
	public int findMax() {
		int Max = 0;
		if (MaxArray == null) {
			return -1;
		}
		else {
			for (int i = 0; i < SIZE; i++) {
				if (MaxArray[i] > Max) {
					Max = MaxArray[i];
				}
			}
			return Max;
		}
	}
		
	public int extractMax() {
		int Max = 0;
		int delete_index = 0;
		if (MaxArray == null) {
			return -1;
		}
		else {
			for (int i = 0; i < SIZE; i++) {
				if (MaxArray[i] > Max) {
					Max = MaxArray[i];
					delete_index = i;
				}
			}
			MaxArray[delete_index] = 0;
			return Max;
		}
	}
	
	public int Test_extractMax() { //This is for testing.
		int Max = 0;
		int delete_index = 0;
		if (MaxArray == null) {
			return -1;
		}
		else {
			for (int i = 0; i < SIZE; i++) {
				if (MaxArray[i] > Max) {
					Max = MaxArray[i];
					delete_index = i;
				}
			}
			MaxArray[delete_index] = 0;
			System.out.println("List after extract: ");
			System.out.print("[");
			for (int i = 0; i < MaxArray.length; i++) {
				System.out.print(" " + MaxArray[i]);
			}
			System.out.println(" ]");
			return Max;
		}
	}
	
	public void display() {
		System.out.print("[");
		for (int i = 0; i < SIZE; i++) {
			System.out.print(" " + MaxArray[i]);
		}
	System.out.println(" ]");
	}
	
	public void swap(int a , int b) {
		int temp = MaxArray[a];
		MaxArray[a] = MaxArray[b];
		MaxArray[b] = temp;
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