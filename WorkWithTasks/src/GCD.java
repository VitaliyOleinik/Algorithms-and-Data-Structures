public class GCD {
    private static int gcd(int a, int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a % b); // находим остаток 30 / 18 = 12 -> 18 / 12 = 6 -> 12 / 6 = 0
    }

    public static void main(String[] args) {
        System.out.println(gcd(30, 18));
    }
}
