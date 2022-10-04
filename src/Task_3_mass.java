import java.util.Scanner;

public class Task_3_mass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 2_147_483_647;
        int len = in.nextInt();
        int[] a = new int [len];
        for (int i = 0; i < len; ++i) {
            a[i] = in.nextInt();
        }
        for (int x: a) {
            if (x > 0 && x < res)
                res = x;
        }
        System.out.println(res);
    }
}
