public class Fraction { // обыкновенная дробь
    private int numerator = 0;
    private int denominator = 1;

    Fraction(int numerator, int denominator) {
        System.out.println("1: I am constructor with numerator " + numerator + " denominator " + denominator);
        if (denominator == 0) {
            System.out.println("Divide by zero!!!");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    Fraction(int numerator) { // numerator/1 7/1
        this.numerator = numerator;
        System.out.println("2: I am constructor with numerator " + numerator);
    }

    Fraction() {
        System.out.println("3: I am an empty constructor");
    }

    Fraction(Fraction f) {
        System.out.println("4: I am constructor with numerator " + f.numerator + " denominator " + f.denominator);
        this.numerator = f.numerator;
        this.denominator = f.denominator;
        normalize();
    }

    Fraction(double num) {
        System.out.println("5: I am constructor with decimal " + num);
        while (num % 1 != 0) {
            num *= 10;
            denominator *= 10;
        }
        this.numerator = (int) num;
        normalize();
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    double toDecimal() {
        return (double) numerator / denominator;
    }

    private int getGcd() {
        int a = numerator;
        int b = denominator;
        while (a != 0 && b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    void normalize() {
        int gcd = getGcd();
        numerator /= gcd;
        denominator /= gcd;
    }

    public void sum(Fraction f) {
        numerator = f.numerator * denominator + numerator * f.denominator;
        denominator *= f.denominator;
        normalize();
    }

    public void mult(Fraction f) {
        numerator *= f.numerator;
        denominator *= f.denominator;
        normalize();
    }
}