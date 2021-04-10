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
        int ans = 0;
        for (int i = 0; i < n; i++){
            if (used[i] == 0){
                ans++;
                used[i] = 1;
                for (int j = i + 1; j < n; j++) {
                    if (used[j] == 0 && a[i] + a[j] <= d) {
                        used[j] = 1;
                    }
            }
        }
    }
        System.out.print(ans + " ");
}}
