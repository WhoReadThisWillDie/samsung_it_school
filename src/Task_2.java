import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int wolves = 2;
        int rabbits = 11;
        int count = 0;
        for (int i = 1; i <= n; ++i) {
            if (rabbits > 19000000)
                rabbits = 19000000;
            if (i % 2 == 0) {
                if (rabbits < wolves * 10) {
                    wolves = rabbits / 10;
                }
                rabbits -= wolves * 10;
                count += wolves * 10;
                wolves += count / 70;
                count %= 70;
            }
            else
                rabbits *= 3;
        }
        System.out.println("Wolves: " + wolves + "\n" + "Rabbits: "  + rabbits);
    }
}
