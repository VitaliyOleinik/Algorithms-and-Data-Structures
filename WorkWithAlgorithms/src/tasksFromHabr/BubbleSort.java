package tasksFromHabr;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int n = 5;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i ++) {
            array[i] = random.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
