public class CHap3_1Circle {
    public static final double PI = 3.14159;

    public static double radiansToDegrees(double radian){
        return radian * 180 / PI;
    }

    public double r;

    public double area(){
        return PI * r * r;
    }

    public double circumference(){
        return PI * r * 2;
    }
}
