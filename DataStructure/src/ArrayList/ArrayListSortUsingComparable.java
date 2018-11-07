package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortUsingComparable {


    public static void main(String[] args) {
        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student(223, "Chaitanya", 26));
        arraylist.add(new Student(245, "Rahul", 24));
        arraylist.add(new Student(209, "Ajeet", 32));

//        Collections.sort(arraylist); // won't work
        Collections.sort(arraylist);

        for (Student student:arraylist){
            System.out.println(student);
        }
    }
}
