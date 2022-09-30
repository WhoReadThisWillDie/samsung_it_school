import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res = n + " TORT";
        if (n % 100 >= 11 & n % 100 <= 19)
            res += "OV";
        else {
            switch (n % 10) {
                case 1:
                    break;
                case 2:
                case 3:
                case 4:
                    res += "A";
                    break;
                default:
                    res += "OV";
                    break;
            }
        }
        System.out.println(res);
    }
}
