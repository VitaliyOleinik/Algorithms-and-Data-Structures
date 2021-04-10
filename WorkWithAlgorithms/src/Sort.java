import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), d = in.nextInt();
        int a[] = new int[n];
        int used[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = in.nextInt();
            used[i] = 0;
        }
        Arrays.sort(a);
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++){
            if (used[i] == 0){
                ans++;
                used[i] = 1;
                for (int k = i + 1; k < n; k++) {
                    if (used[k] == 0 && b[i] + b[k] <= d) {
                        used[k] = 1;
                    }
            }
        }
    }
        System.out.print(ans + " ");
}}
