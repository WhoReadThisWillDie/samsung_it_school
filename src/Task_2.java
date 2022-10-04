import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long res = 0;
        while (Math.abs(n) > 0) {
            res *= 10;
            res += n % 10;
            n /= 10;
        }
        System.out.println(res);
    }
}
