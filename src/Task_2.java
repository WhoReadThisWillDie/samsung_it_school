import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a = new int[in.nextInt()][in.nextInt()];
        int count = 0;
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = count;
                count++;
            }
        }
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[0].length; ++j) {
                if (i % 2 == 0)
                    System.out.print(a[i][j] + "\t");
                else
                    System.out.print(a[i][a[0].length - 1 - j] + "\t");
            }
            System.out.println();
        }
    }
}
