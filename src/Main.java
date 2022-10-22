import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        byte[] a = new byte[n / 8 + 1];
        for (int i = 0; i < n; ++i) {
            byte x = (byte) (in.nextBoolean() ? 1 : 0);
            a[i / 8] = (byte) (a[i / 8] | (x << (i % 8)));
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(((a[i / 8] & (1 << (i % 8))) != 0) + " ");
        }
    }
}