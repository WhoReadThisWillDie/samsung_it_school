import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // default solution + print in console
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                a[i][j] = i * j;
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
//        int[][] a;    cringe solution for testing system
//        Scanner in = new Scanner(System.in);
//        a = new int[in.nextInt()][in.nextInt()];
//        int j_ = 0;
//        int i_ = 0;
//        while (i_ < a.length || j_ < a[0].length) {
//            if (i_ < a.length && j_ < a[0].length)
//                a[i_][j_] = i_ * j_;
//            if (j_ < a[0].length)
//                j_++;
//            else {
//                i_++;
//                j_ = 0;
//            }
//        }
    }
}