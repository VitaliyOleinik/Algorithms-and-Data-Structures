package tasks;

public class IterativeAndRecursionProcessFactorial {
    private static long factorialIterative (int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    private static long factorialRecursion (int number){
        if (number == 1){
            return 1;
        }
        return number * factorialRecursion(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorialIterative(5));
        System.out.println(factorialRecursion(4));
    }
}
