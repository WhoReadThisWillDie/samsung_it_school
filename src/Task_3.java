import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int res =  2_147_483_647;
        for (int i = 0; i < len; ++i) {
            int n = in.nextInt();
            if (n < res && n > 0)
                res = n;
        }
        System.out.println(res);
    }
}
