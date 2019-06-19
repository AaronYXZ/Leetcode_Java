package String;

public class StringDemo {

    public static void main(String[] args) {
        String ori = "this is test A123";
        System.out.println(ori.replaceAll("\\d+", "1"));

    }
}
