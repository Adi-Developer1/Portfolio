import java.util.ArrayList;
import java.util.List;

public class CustomHeap {
    final List<Integer> heap;   // To store heap elements
    final int childExponent;    // The exponent to calculate the number of children per node

    // Constructor to initialize the heap with a specified child exponent
    public CustomHeap(int childExponent) {
        this.heap = new ArrayList<>();
        this.childExponent = childExponent;
    }

    // Helper method to get the number of children per node based on the exponent
    private int getNumberOfChildren() {
        return (int) Math.pow(2, childExponent);
    }

    // Method to insert an element into the heap
    public void insert(int value) {
        heap.add(value);
        heapifyUp(heap.size() - 1); // Maintain heap property after insert
    }

    // Method to remove and return the maximum element from the heap
    public int popMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty.");
        }
        
        int maxValue = heap.get(0);
        int lastValue = heap.remove(heap.size() - 1);
        
        if (!heap.isEmpty()) {
            heap.set(0, lastValue);
            heapifyDown(0); // Maintain heap property after removal
        }
        
        return maxValue;
    }

    // Method to maintain heap property after inserting a new element
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / getNumberOfChildren();
            if (heap.get(index) > heap.get(parentIndex)) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    // Method to maintain heap property after removing the maximum element
    private void heapifyDown(int index) {
        int numChildren = getNumberOfChildren();
        int largest = index;

        while (true) {
            int leftMostChildIndex = numChildren * index + 1;
            int rightMostChildIndex = Math.min(leftMostChildIndex + numChildren - 1, heap.size() - 1);

            for (int i = leftMostChildIndex; i <= rightMostChildIndex; i++) {
                if (i < heap.size() && heap.get(i) > heap.get(largest)) {
                    largest = i;
                }
            }

            if (largest != index) {
                swap(index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }

    // Utility method to swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Main method for testing the heap implementation
    public static void main(String[] args) {
        CustomHeap heap = new CustomHeap(1); // For 2^1 children (binary heap)
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);
        heap.insert(25);

        System.out.println("Max Element: " + heap.popMax()); // Should print 30
        System.out.println("Max Element: " + heap.popMax()); // Should print 25
    }
}
