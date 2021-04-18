import java.util.ArrayList;

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

        while (i > 0 && a.get(parent(i))  > a.get(i){
            // swap
            int temp = a.get(parent(i));
            a.set(a.get(parent(i)), a.get(i));
            a.set(a.get(i), temp);
            i = parent(i);
        }
    }

    void pop(){
        // replace the root of the heap with the last element
        a.set(0, a.get(size));
        a.remove(size);

        // call heapify-down on root node

    }

    void print(){
        for (int i = 0; i < size; i ++){
            System.out.print(a.get(i) + " ");
        }
    }
}
