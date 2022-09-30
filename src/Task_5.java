import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int res = 0;
        if (a % 5 == 0 && (a >= 100 & a <= 999))
            res++;
        if (b % 5 == 0 && (b >= 100 & b <= 999))
            res++;
        if (c % 5 == 0 && (c >= 100 & c <= 999))
            res++;
        if (res >= 2)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
