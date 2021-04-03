import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

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

        if(a[right] == k || a[right] == k + 1 || a[right] == k - 1){
            return right;
        }

        return -1;
    }

    public static void main(String[] args) {
        int n, k;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        int [] a = new int[n];
        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        System.out.println(binarySearch(a, n, k)); // output: index
    }
}
