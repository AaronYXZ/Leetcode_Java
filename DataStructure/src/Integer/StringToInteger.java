package Integer;

public class StringToInteger {

    public static void main(String[] args) {
        String a = "123";
        String b = "abc";
        String c = "12.3";

        try{
            int a1 = Integer.parseInt(c, 10);
            System.out.println(a1);
        }
        catch(NumberFormatException nfe){
            System.out.println("error");
        }

    }
}
