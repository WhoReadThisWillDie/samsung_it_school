import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String min = Integer.toString(n / 60 % 60);
        String sec = Integer.toString(n % 60);
        if (min.length() == 1)
            min = "0" + min;
        if (sec.length() == 1)
            sec = "0" + sec;
        System.out.println(n / 3600 + ":" + min + ":" + sec);
    }
}
