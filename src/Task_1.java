import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long n1 = 1;
        long n2 = 1;
        for (int i = 0; i < n - 2; ++i) {
            long temp = n1;
            n1 = n2;
            n2 = temp + n2;
        }
        System.out.println(n2);
    }
}