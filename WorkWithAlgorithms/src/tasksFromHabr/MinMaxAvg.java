package tasksFromHabr;

import java.util.Random;

public class MinMaxAvg {
    public static void main(String[] args) {
        int n = 100;
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < a.length; i ++) {
            a[i] = random.nextInt();
        }

        int min = a[0];
        int max = a[0];
        int avg = 0;

        for (int j : a) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
            avg += j / a.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
