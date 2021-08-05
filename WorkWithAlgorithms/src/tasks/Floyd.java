package tasks;

import java.util.Scanner;

public class Floyd {
    private static int [][] a = new int[100][100];
    private static int n, m;
    private static int [] b = new int[100];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt(); m = in.nextInt();
        for (int i = 1; i <= m; i ++){
            int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
            a[x][y] = z;
            a[y][x] = z;
        }

        for (int k = 1; k <= n; k ++) {
            // перебираем ту вершину через которую будем улучшать
            for (int i = 1; i <= n; i++) {
                // перебираем вершину из которой будем идти
                for (int j = 1; j <= n; j++) {
                    // перебираем вершину в которую будем идти
                    // i --> k --> j   i-->j
                    if ((a[i][k] > 0) && (a[k][j] > 0) && (i != j)) {
                        // больше 0, мы проверяем существует ли эта вершина и проверяем
                        // чтобы кординаты не совпадали i!=j( по типу 0 = 0 и и.т.д)
                        if ((a[i][k] + a[k][j] < a[i][j] || (a[i][j] == 0))) {
                            // если сумма ребер она больше, чем вершина i и j,
                            // и если между ними нет расстояния то есть == 0
                            // в итоге суммируем.
                            a[i][j] = a[i][k] + a[k][j];
                        }
                    }
                }
            }
        }
        for (int i = 1; i <= n; i ++){
            for (int j = 1; j <= n; j ++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
