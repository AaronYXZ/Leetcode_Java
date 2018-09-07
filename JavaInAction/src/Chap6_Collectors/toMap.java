package Chap6_Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Used in ml-use-cases CollectGoldTagsRunner
// example from https://www.concretepage.com/java/jdk-8/java-8-convert-list-to-map-using-collectors-tomap-example
public class toMap {



    public static void main(String[] args) {
        // toMap demo 1
        List<String> list = new ArrayList<>();
        list.add("Mohan");
        list.add("Sohan");
        list.add("Mahesh");
        Map<String, Object> map = list.stream().collect(Collectors.toMap(Function.identity(), s -> s));
        map.forEach((x, y) -> System.out.println("Key: " + x + ", value: " + y));

        // toMap demo 2

        List<Person> personList = new ArrayList<>();
        // Person is defined in Person.class
        personList.add(new Person(100, "Aaron"));
        personList.add(new Person(200, "Will"));
        personList.add(new Person(300, "Kunka"));

        Map<Integer, String> map2 = personList.stream()
                .collect(Collectors.toMap(Person::getId, Person::getName));
        map2.forEach((x, y) -> System.out.println("Key: " + x + " Value: " + y));

    }


}

