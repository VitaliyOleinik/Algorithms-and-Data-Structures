package informatics;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTask4 {

    private static boolean binarySearch(int [] a, int n, int k){
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
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), k = in.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i ++){
            a[i] = in.nextInt();
        }
        //Arrays.sort(a);
        int [] b = new int[k];
        for (int i = 0; i < k; i++){
            b[i] = in.nextInt();
        }
        for (int i = 0; i < k; i ++){
            if (binarySearch(a, n, b[i])){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
