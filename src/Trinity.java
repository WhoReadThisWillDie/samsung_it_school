public class Trinity<T extends Comparable<T>> {
    private T first;
    private T second;
    private T third;

    public Trinity(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
        sort();
    }

    private void sort() {
        T temp;
        if (first.compareTo(second) < 0) {
            temp = first;
            first = second;
            second = temp;
        }
        if (first.compareTo(third) < 0) {
            temp = first;
            first = third;
            third = temp;
        }
        if (second.compareTo(third) < 0) {
            temp = second;
            second = third;
            third = temp;
        }
    }

    public void setFirst(T first) {
        this.first = first;
        sort();
    }

    public void setSecond(T second) {
        this.second = second;
        sort();
    }

    public void setThird(T third) {
        this.third = third;
        sort();
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    @Override
    public String toString() {
        return "First: " + first + "\nSecond: " + second + "\nThird: " + third;
    }
}
