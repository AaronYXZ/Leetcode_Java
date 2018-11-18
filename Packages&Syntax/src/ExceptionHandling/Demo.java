package ExceptionHandling;

public class Demo {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        try{
            int num3 = num2 / num1;
        }
        catch(Exception e){
            System.out.println("exception catched");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            System.out.println(e.toString());
            System.out.printf(e.getLocalizedMessage());
        }
    }
}
