import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Main {

    public static <T extends Comparable<T>> int binarySearch(T[] a, T key, int low, int hi) {
        if (low > hi) throw new IllegalArgumentException("Low > hi!");
        if (low < 0 || hi >= a.length) throw new IllegalArgumentException("Incorrect indexes");
        int mid = 0;
        while (low <= hi) {
            mid = (low + hi) / 2;
            T value = a[mid];
            if (value.compareTo(key) == 0)
                return mid;
            else if (value.compareTo(key) < 0)
                low = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
//        MyArrayList<String> a = new MyArrayList<>();
//        a.add("1");
//        a.add("2");
//        a.add("3");
//        MyArrayList<String> b = new MyArrayList<>();
//        b.add("4");
//        b.addAll(a);
//        System.out.println(b.contains("9"));
//
//        for (String s : b) {
//            System.out.println(s);
//        }
    }
}