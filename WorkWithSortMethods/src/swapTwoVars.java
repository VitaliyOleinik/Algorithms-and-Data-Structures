public class swapTwoVars {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        a = a + b; // 5 + 7 = 12
        b = a - b; // 12 - 7 = 5
        a = a - b; // 12 - 5 = 7
    }
}
