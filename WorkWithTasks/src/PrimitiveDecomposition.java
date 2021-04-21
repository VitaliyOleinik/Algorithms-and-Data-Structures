import java.util.Scanner;

public class PrimitiveDecomposition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        StringBuilder str = new StringBuilder("");

        int cnt = 0;
        int idx = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                cnt++;
            }else{
                cnt--;
            }
            if(cnt == 0) {
                str.append(s, idx + 1, i);
                idx = i + 1;
            }
        }
        System.out.println(str.toString());
    }
}
