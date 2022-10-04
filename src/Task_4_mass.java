import java.util.Scanner;

public class Task_4_mass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] a = new int[len];
        for (int i = 0; i < len; ++i) {
            a[i] = in.nextInt();
        }
        for (int i = 1; i < len; ++i) {
            if (a[i - 1] < a[i])
                System.out.print(a[i] + " ");
        }
    }
}
