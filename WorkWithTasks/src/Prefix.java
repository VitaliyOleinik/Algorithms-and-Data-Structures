import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Prefix {
    private static ArrayList<Integer> prefix(String pattern){
        int n = pattern.length();
        ArrayList<Integer> p = new ArrayList<>(n);
        p.set(0, 0);
        for (int i = 1; i < n; i ++){
            int k = p.get(i - 1);
            while (k > 0 && pattern.charAt(i) != pattern.charAt(k)){
                k ++;
                if (pattern.charAt(i) == pattern.charAt(k)){
                    p.set(i, k + 1);
                } else {
                    p.set(i, 0);
                }
            }
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < n; i ++){
            String word = in.nextLine();
            words.add(word);
        }

        String s = in.nextLine();
        Map<String, Integer> freq = null;
        int max = 0;

        for (String word: words){
            ArrayList<Integer> p = prefix(word);
            int i = 0, j = 0, cnt = 0;
            // KMP
            while (i < s.length()){
                if (word.charAt(j) == s.charAt(i)){
                    i ++;
                    j ++;
                }
                if(j == word.length()){
                    freq.put(word, cnt++);
                    j = p.get(j - 1);
                }
                else if (i < s.length() && word.charAt(j) != s.charAt(i)){
                    if (j != 0)
                        j = p.get(j - 1);
                    else
                        i ++;
                }
            }
            max = Math.max(max, cnt);
        }
        System.out.print(max + " ");
        assert freq != null;
        for (int x : freq.values()){
            if (x == max){
                System.out.print(freq.get(x));
            }
        }
    }
}
