import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int last = in.nextInt();
        int current;
        for (int i = 1; i < len; ++i) {
            current = in.nextInt();
            if (current > last)
                System.out.print(current + " ");
            last = current;
        }
    }
}
