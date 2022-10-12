import java.util.Scanner;

public class Task_2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int length = 2 * n;
        int[][] a = new int[length + 1][length + 1];
        int count = (length + 1) * (length + 1) - 1;
        a[n][n] = 0;
        for (int j = 0; j <= n; ++j) {
            for (int i = j; i < length - j; ++i) {
                a[i][length - j] = count--;
            }
            for (int i = j; i < length - j; ++i) {
                a[length - j][length - i] = count--;
            }
            for (int i = j; i < length - j; ++i) {
                a[length - i][j] = count--;
            }
            for (int i = j; i < length - j; ++i) {
                a[j][i] = count--;
            }
        }
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
