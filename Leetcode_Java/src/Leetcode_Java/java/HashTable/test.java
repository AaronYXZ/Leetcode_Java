package HashTable;

public class test {
    public static void factor(int number) {
        if (number == 1) return;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i + " ");
                factor(number / i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        factor(1331);
    }

    public static double min(double[] array) {
        double minimum = array[0];
        for (double element : array) {
            if (element < minimum) minimum = element;
        }
        return minimum;

    }

    public static int indexOfSmallestElement(double[] array) {
        int index = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] < array[index]) index = i;
        }
        return index;
    }

}
