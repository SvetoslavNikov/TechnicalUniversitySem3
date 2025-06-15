package Java.LEETCODE.HEAP;
import java.util.Arrays;

public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    public int[] HeapSort(int[] arr){
        buildHeap(arr);
        for (int i = 0; i < size; i++) {
            arr[i] = deleteMin();
        }

        return arr;
    }

    public void buildHeap(int[] array) {
        heap = Arrays.copyOf(array, array.length);
        size = array.length;
        for (int i = (size / 2) - 1; i >= 0; i--) {
            siftDown(i);
        }
    }


    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full.");
            return;
        }
        heap[size] = value;
        siftUp(size);
        size++;
    }

    public int deleteMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty.");
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftDown(0);
        return min;
    }

    private void siftUp(int i) {
        int parent = (i - 1) / 2;
        while (i > 0 && heap[i] < heap[parent]) {
            swap(i, parent);
            i = parent;
            parent = (i - 1) / 2;
        }
    }

    private void siftDown(int i) {
        while (true) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;

            if (left < size && heap[left] < heap[smallest]) {
                smallest = left;
            }
            if (right < size && heap[right] < heap[smallest]) {
                smallest = right;
            }
            if (smallest != i) {
                swap(i, smallest);
                i = smallest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int tmp = heap[i];
        heap[i] = heap[j];
        heap[j] = tmp;
    }

    public void printHeap() {
        System.out.println("Heap: " + Arrays.toString(Arrays.copyOf(heap, size)));
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(15);

        // Try inserting elements
        minHeap.insert(10);
        minHeap.insert(4);
        minHeap.insert(15);
        minHeap.insert(2);
        minHeap.insert(8);
        minHeap.printHeap(); // Should show [2, 4, 15, 10, 8]

        // Delete min and print
        System.out.println("Deleted min: " + minHeap.deleteMin()); // 2
        minHeap.printHeap(); // Should show updated heap

        // More insertions
        minHeap.insert(1);
        minHeap.insert(20);
        minHeap.printHeap(); // Should show updated heap with 1 at root

        // Delete again
        System.out.println("Deleted min: " + minHeap.deleteMin()); // 1
        minHeap.printHeap();


    }
}
