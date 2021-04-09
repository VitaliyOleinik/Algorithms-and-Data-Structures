import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int [][] a = new int [100][100];
        int n, m, x, y;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 0; i < m; i ++){
            x = in.nextInt();
            y = in.nextInt();
            a[x][y] = 1;
            a[y][x] = 1;
        }
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j ++){
                System.out.print(a[i][j] + " ");
                System.out.println();
            }
        }
    }
}
