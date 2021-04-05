import java.util.ArrayList;

public class PrimeNumbers {
    private static boolean isPrime(int x){ // O(n^2) or more
        if (x == 1 || x == 0) return false;
        for(int i = 2; i < x; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }

    private static void primeSieve(int n){
        boolean [] marked = new boolean[n + 1];
        marked[1] = true;
        for (int i = 1; i <= n; i++){
            if(!marked[i]){
                // i = 2
                // 4, 6, 8, 10 ...
                // i = 5
                // 10, 15, 20 ...
                for (int j = 2*i; j <= n; j += i){
                    marked[j] = true;
                }
            }
        }
        for (int i = 1; i <= n; i++){
            if (!marked[i]){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        primeSieve(10000);
    }
}
