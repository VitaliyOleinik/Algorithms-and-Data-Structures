package informatics;

import java.util.Arrays;
import java.util.Scanner;

public class SortTask1418 {
    private static int binarySearch(int [] a, int n, int k){
        int left = 0;
        int right = n - 1;

        while(left < right){
            int middle = (left + right) / 2;
            if(a[middle] < k){
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        if(a[right] == k){ // cut -> || a[right] == k + 1 || a[right] == k - 1
            return a[right];
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a [] = new int[n];
        for (int i = 0; i < n; i ++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        for (int i: a){
            System.out.print(i + " ");
        }
        System.out.println("\n" + "---------");
        int cnt = 0;
        for (int i = 0; i < n; i ++){
            System.out.print(binarySearch(a, n, a[i]) + " ");
            if (binarySearch(a, n, a[i]) != a[i + 1]){
                cnt ++;
                System.out.println(a[i]);
            }
        }
        System.out.println("\n" + cnt);
    }
}
