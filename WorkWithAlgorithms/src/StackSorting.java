import java.util.Stack;

public class StackSorting {
    private static Stack<Integer> sortStack(Stack<Integer> input){
        Stack<Integer> tmpStack = new Stack<>();

        while (!input.empty()) {
            // pop out the first element
            int tmp = input.firstElement();
            input.pop();

            // while temporary stack is not empty and top
            // of stack is greater than temp
            while (!tmpStack.empty() && tmpStack.firstElement() > tmp)
            {
                // pop from temporary stack and push
                // it to the input stack
                input.push(tmpStack.firstElement());
                tmpStack.pop();
            }

            // push temp in tempory of stack
            tmpStack.push(tmp);
        }
        return tmpStack;
    }

    public static void main(String[] args) {
        Stack<Integer> input = new Stack<>();
        input.push(34);
        input.push(3);
        input.push(31);
        input.push(98);
        input.push(92);
        input.push(23);

        // This is the temporary stack
        Stack<Integer> tmpStack = sortStack(input);
        System.out.println("Sorted numbers are: ");

        while (!tmpStack.empty()) {
            System.out.print(tmpStack.firstElement() + " ");
            tmpStack.pop();
        }
    }
}
