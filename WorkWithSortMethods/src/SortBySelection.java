import java.util.Scanner;

public class SortBySelection {
    public static void main(String[] args) {
        int a[] = new int [1001];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i ++){
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n - 1; i ++){
            for (int j = i + 1; j < n; j ++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i: a){
            System.out.print(i + " ");
        }
    }
}
