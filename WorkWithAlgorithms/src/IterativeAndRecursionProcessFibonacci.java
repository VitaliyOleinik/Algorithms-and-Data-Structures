public class IterativeAndRecursionProcessFibonacci {
    private static long recursionFibonacci (int number){
        if (number == 0){
            return 0;
        }
        if (number == 1){
            return 1;
        }
        return recursionFibonacci(number - 1) + recursionFibonacci(number - 2);
    }

    private static int iterativeFibonacci (int number){
        if (number <= 1){
            return 1;
        }
        int fib = 1;
        int prevFib = 1;
        for (int i = 2; i < number; i++){
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }

    public static void main(String[] args) {
        // System.out.println(recursionFibonacci(6));
        for(int i = 0; i < 50; i++){
            System.out.println("eto chislo: " + i + " 4islo fib: " + recursionFibonacci(i) + "; ");
        }
        //System.out.println(iterativeFibonacci(7));
    }
}
