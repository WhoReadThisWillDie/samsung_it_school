import java.util.Scanner;

public class MyArrays {
    public static double avgOf4Digit(int[] a) {
        double sum = 0;
        int count = 0;
        for (int i : a) {
            if (i >= 1000 & i <= 9999) {
                sum += i;
                count++;
            }
        }
        if (count == 0)
            return -1;
        return sum / count;
    }

    public static int[] minToBegin(int[] a) {
        int min = a[0];
        int ind = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] < min) {
                min = a[i];
                ind = i;
            }
        }
        int[] res = new int [a.length];
        res[0] = a[ind];
        for (int i = 1; i < a.length; ++i) {
            if (i <= ind)
                res[i] = a[i - 1];
            else
                res[i] = a[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] a = new int[len];
        for (int i = 0; i < len; ++i) {
            a[i] = in.nextInt();
        }
//        System.out.println(avgOf4Digit(a)); avgOf4Digit

        for (int i : minToBegin(a)) // minToBegin
            System.out.print(i + " ");
    }
}
