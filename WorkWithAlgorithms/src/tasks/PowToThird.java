package tasks;

import java.util.Scanner;

public class PowToThird {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        double l = 1;
        double r = x;
        double eps = 0.000001;
        while (r - l > eps){
            double m = (l + r) / 2.0;
            if (m * m * m > x){
                r = m;
            } else {
                l = m;
            }
        }

        System.out.printf("%.10f", r);
    }
}
