import java.util.Locale;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        if (y <= 2 - x * x && (y >= x || y >= 0))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}