package lab3;

public class Arithmetic {
    /** Computes product of two ints */

    public static int product(int a, int b) {
        return a * b;
    }

    /** Computes sum of two ints (incorrectly) */

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;
        System.out.println(a == b);
    }
}
