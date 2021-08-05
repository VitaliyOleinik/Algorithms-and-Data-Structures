package tasks;

import java.util.Scanner;
import java.util.Vector;

public class PrefixFunction {

    private static Vector<Integer>prefix_function(String s){
        int n = s.length();
        Vector<Integer> p = new Vector<>(n);
        p.add(0,0);
        for (int i = 1; i < n; i++) {
            int j = p.get(i - 1);
            while (j > 0 && s.charAt(j) != s.charAt(i))
                j = p.get(j - 1);
            if (s.charAt(j) == s.charAt(i)) j++;
            p.set(i, j);
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Vector<Integer>p = prefix_function(s);
        for(int i = 0; i < s.length(); i++){
            System.out.print(p.get(i) + " ");
        }
    }
}
