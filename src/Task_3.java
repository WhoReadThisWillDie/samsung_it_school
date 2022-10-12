import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        int x = 0;
        int y = n - 1;
        int count = 0;
        while (count <= n * n) {
            for (int i = 0; i < a.length; ++i) {
                if (a[x][i] == 0)
                    a[x][i] = count++;
            }
            for (int i = 0; i < a.length; ++i) {
                if (a[i][y] == 0)
                    a[i][y] = count++;
            }
            for (int i = a.length - 1; i >= 0; --i) {
                if (a[y][i] == 0)
                    a[y][i] = count++;
            }
            for (int i = a.length - 1; i >= 0; --i) {
                if (a[i][x] == 0)
                    a[i][x] = count++;
            }
            x++;
            y--;
        }
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
