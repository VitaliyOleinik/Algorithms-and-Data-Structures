package tasks;

import java.util.Scanner;

public class MPow {
    private static int mPow(int a, int b){
        if (b == 0) return 1;
        if (b == 1) return a;
        int result = mPow(a, b / 2);
        if (b % 2 == 0){
            return result * result;
        }
        return result * result * a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt();
        System.out.println(mPow(a, b));
    }
}
