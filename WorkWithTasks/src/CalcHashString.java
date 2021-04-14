import java.util.Scanner;

public class CalcHashString {
    private static int [] p = new int[10001];
    private static int [] pref = new int[10001];

    static private void preCalc(){
        p[0] = 1;
        for (int i = 1; i < 10001; i ++){
            p[i] = (p[i] - 97) * 2^p[i];
        }
    }

    static private int hashString(String s){
        int h = 0;
        for (int i = 0; i < s.length(); i ++){
            h += ((s.charAt(i) - 'a') * p[i]);
        }
        return h;
    }

    static private void hashCalc(String s){
        for (int i = 0; i < s.length(); i ++){
            pref[i] = ((s.charAt(i) - 'a') * p[i]);
            if (i != 0){
                pref[i] += pref[i - 1];
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        preCalc();
        String text = in.nextLine(), pat;
        hashCalc(text);
        int t = in.nextInt();
        int n = text.length();
        for (int i = 0; i < t; i ++){
            String sub = in.nextLine();
            boolean issub = false;
            int hash = hashString(sub);
            int cnt = 0;
            int m = sub.length();
            for (int k = 0; k < n - m + 1; k ++){
                int j = k + m;
                int hashik = pref[j];
                if (k != 0){
                    hashik -= pref[k - 1];
                }
                if (hashik == hash * p[k]){
                    issub = true;
                    break;
                }
            }
        }
    }
}
