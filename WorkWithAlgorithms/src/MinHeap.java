import java.util.ArrayList;
import java.util.Scanner;

public class MinHeap {
    public ArrayList<Integer> a = new ArrayList<>();
    public int size;
    MinHeap(){
        size = 0;
    }

    int parent (int i){
        return ((i - 1) / 2);
    }
    int left (int i){
        return  i * 2 + 1;
    }
    int right (int i){
        return i * 2 + 2;
    }
    int getMin(){
        return a.get(0);
    }

    void insert (int k) {
        a.add(k);
        size ++;
        int i = size - 1; // index of last element

        while (i > 0 && a.get(parent(i))  > a.get(i)){
            // swap
            int temp = a.get(parent(i));
            a.set(a.get(parent(i)), a.get(i));
            a.set(a.get(i), temp);
            i = parent(i);
        }
    }

    void heapify_down (int i){
        // get left and right child of node at index i
        int l = left(i);
        int r = right(i);

        int largest = i;

        // compare A[i] with its left and right child
        // and find largest value
        if (l < size && a.get(l) > a.get(i))
            largest = l;
        if (r < size && a.get(r) > a.get(largest))
            largest = r;
        // swap with child having greater value and
        // call heapify-down on the child
        if (largest != i) {
            int temp = a.get(i);
            a.set(i, a.get(largest));
            a.set(largest, temp);
            heapify_down(largest);
        }
    }

    void pop(){
        // replace the root of the heap with the last element
        a.set(0, a.get(size));
        a.remove(size);

        // call heapify-down on root node
        heapify_down(0);
    }

    void print(){
        for (int i = 0; i < size; i ++){
            System.out.print(a.get(i) + " ");
        }
    }

    int extractMin (){
        int root_value = a.get(0);
        int temp = a.get(0);
        a.set(a.get(0), a.get(size - 1));
        a.set(a.get(size - 1), temp);
        size --;
        heapify_down(0);
        return root_value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MinHeap minHeap = new MinHeap();
        int n = in.nextInt(), k;
        for (int i = 0; i < n; i ++){
            k = in.nextInt();
            minHeap.insert(k);
        }
        //minHeap.print();
        for (int i = 0; i < n; i ++){
            System.out.print(minHeap.extractMin());
        }
    }
}
