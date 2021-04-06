package informatics;

import java.util.Scanner;

public class MergeSortTask766 {
    private static int a[];
    private static void merge(int left, int middle, int right){
        int p1 = middle - left + 1;
        int p2 = right - middle;
        int x1 = 0, x2 = 0;
        int k = left;
        int [] l = new int[p1];
        int [] r = new int[p2];
        for (int i = 0; i < p1; i ++){
            l[i] = a[left + i];
        }
        for (int i = 0; i < p2; i ++){
            r[i] = a[middle + i + 1];
        }

        while (x1 < p1 && x2 < p2){
            if (l[x1] <= r[x2]){
                a[k] = l[x1];
                x1 ++;
            } else {
                a[k] = r[x2];
                x2 ++;
            }
            k ++;
        }

        while (x1 < p1){
            a[k] = l[x1];
            k ++;
            x1 ++;
        }
        while (x2 < p2){
            a[k] = r[x2];
            k ++;
            x2 ++;
        }

    }
    private static void mergeSort(int left, int right){
        if (left < right){
            int middle = (left + right) / 2;
            mergeSort(left, middle);
            mergeSort(middle + 1, right);
            merge(left, middle, right);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i ++){
            a[i] = in.nextInt();
        }
        mergeSort(0, a.length - 1);
        for (int i: a){
            System.out.print(i + " ");
        }
    }
}
