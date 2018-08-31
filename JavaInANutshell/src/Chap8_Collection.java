
import java.util.Arrays;
import java.util.List;

public class Chap8_Collection {
    public static void main(String[] args){
//        System.out.println("test");
        List<String> pets = Arrays.asList("cat", "dog","fish", "pony");
        pets.stream().forEach(System.out::println);
        System.out.println("try another lambda format:");
        pets.stream().forEach(e -> System.out.println(e));
    }
}
