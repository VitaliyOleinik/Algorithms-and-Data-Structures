import java.util.Scanner;

public class countSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, k;
        n = in.nextInt();
        int b[] = new int[10];
        for (int i = 0; i < n; i ++){
            k = in.nextInt();
            b[k] ++;
        }
        // counter of each element in array
//        for (int i = 0; i < n; i ++){
//            System.out.print(b[i] + " ");
//        }
        System.out.println();
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < b[i]; j ++){
                System.out.print(i + " ");
            }
        }
    }
}
