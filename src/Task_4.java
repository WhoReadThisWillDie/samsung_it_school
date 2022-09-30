import java.util.Locale;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        if (!(x > -2 && x < 3 || x > 6 && x < 9))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
