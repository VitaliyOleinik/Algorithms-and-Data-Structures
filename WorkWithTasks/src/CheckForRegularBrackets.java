import java.util.Scanner;
import java.util.Stack;

public class CheckForRegularBrackets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i ++){
            if (st.empty()){
                st.push(s.charAt(i));
            }
            else {
                if (st.firstElement() == '(' && s.charAt(i) == ')') {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }
        }
        if (st.empty()) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }
    }
}
