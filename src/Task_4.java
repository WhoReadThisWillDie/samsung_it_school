import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int res = 9;
        while (n > 0) {
            int current = n % 10;
            if (res > current && current != 0)
                res = current;
            n /= 10;
        }
        System.out.println(res);
    }
}