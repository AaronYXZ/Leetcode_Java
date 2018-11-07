package ArrayList;

import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        // initialize an ArrayList
        List<String> obj = new ArrayList<>();

        /*This is how we add elements to an ArrayList*/
        obj.add("Ajeet");
        obj.add("Harry");
        obj.add("Chaitanya");
        obj.add("Steve");
        obj.add("Anuj");

        for (String string:obj){
            System.out.println(string);
        }

        /* Add element at the given index
         * obj.add(0, "Rahul") - Adding element "Rahul" at first position
         * obj.add(3, "Justin") - Adding element "Justin" at fourth position
         */
        obj.add(0, "Rahul");
        obj.add(3, "Justin");

        for (int i = 0; i < obj.size(); i++){
            System.out.println(obj.get(i));
        }

        //Remove elements from ArrayList like this
        obj.remove("Chaitanya"); //Removes "Chaitanya" from ArrayList
        obj.remove("Harry"); //Removes "Harry" from ArrayList
    }
}
