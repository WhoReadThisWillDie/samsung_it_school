import java.util.Scanner;

public class NumberDigits {
    public static int sumOfSeven(int a, int b) {
        int res = 0;
        for (int i = a; i <= b; ++i) {
            if (i % 7 == 0 & i >= 10 & i <= 99) {
                int i1 = i;
                while (i1 > 0) {
                    res += i1 % 10;
                    i1 /= 10;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(sumOfSeven(a, b));
    }
}