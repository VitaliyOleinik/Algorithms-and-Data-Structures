import java.util.Scanner;
import java.util.Stack;

public class CheckForAllTypesOfBrackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i ++){
            if (stack.empty())
                stack.push(s.charAt(i));
            else if (stack.firstElement() == '('
                    && s.charAt(i) == ')') stack.pop();
            else if (stack.firstElement() == '['
                    && s.charAt(i) == ']') stack.pop();
            else if (stack.firstElement() == '{'
                    && s.charAt(i) == '}') stack.pop();
            else stack.push(s.charAt(i));
        }
        if (stack.empty()) System.out.println("YES");
        else System.out.println("NO");
    }
}
