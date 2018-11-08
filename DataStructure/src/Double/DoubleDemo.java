package Double;

public class DoubleDemo {

    public static void main(String[] args) {
        String double1 = "12.5";
        Double double2 = Double.valueOf(double1);
        System.out.println(double2);

        Double double3 = Double.parseDouble(double1);
        System.out.println(double3);
    }
}
