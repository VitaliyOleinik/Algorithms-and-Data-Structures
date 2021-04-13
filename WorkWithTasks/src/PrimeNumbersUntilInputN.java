import java.util.Scanner;

public class PrimeNumbersUntilInputN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p [] = new int[100001];
        int n = in.nextInt();
        for (int i = 2; i * i <= n; i++ ){
            if (p[i] == 0){
                int k = i;
                while (k + i <= n){
                    k += i;
                    p[k] = 1;
                }
            }
        }

        for (int i = 2; i <= n; i++){
            if (p[i] == 0){
                System.out.print(i + " ");
            }
        }
    }
}
