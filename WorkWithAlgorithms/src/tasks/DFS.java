package tasks;

import java.util.Scanner;

public class DFS {
    private static int[][]a = new int[100][100];
    private static int n, m, cnt = 0;
    private static boolean b[] = new boolean[100];
    private static void dfs(int v){
        System.out.print(v + " ");
        b[v] = true;
        cnt ++;
        for (int i = 1; i <= n; i ++){
            if (a[v][i] == 1 && (!b[i])){
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int comp = 0;
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 1; i <= m; i ++){
            int x = in.nextInt(), y = in.nextInt();
            a[x][y] = 1;
            a[y][x] = 1;
            comp++;
        }
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(comp / 2);

        dfs(1);
        System.out.println();
        System.out.println(cnt);

        cnt = 0;
        dfs(3);
        System.out.println();
        System.out.println(cnt);

        cnt = 0;
        dfs(7);
        System.out.println();
        System.out.println(cnt);
    }
}
