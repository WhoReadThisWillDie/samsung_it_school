import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();
        char a = n.charAt(n.length() - 1);
        String res = "";
        for (int i = 0; i < n.length(); ++i) {
            if (n.charAt(i) != a && n.charAt(i) != ' ')
                res += n.charAt(i);
        }
        System.out.println(res);
    }
}