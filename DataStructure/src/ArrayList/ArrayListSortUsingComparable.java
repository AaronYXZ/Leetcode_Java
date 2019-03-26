package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSortUsingComparable {


    public static void main(String[] args) {
        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student(223, "Chaitanya", 26));
        arraylist.add(new Student(245, "Rahul", 24));
        arraylist.add(new Student(209, "Ajeet", 32));

//        Collections.sort(arraylist); // won't work
        Collections.sort(arraylist);

        List<Integer> lists = Arrays.asList(1,3,4,2,9,6);

        for (Student student:arraylist){
            System.out.println(student);
        }

        Collections.sort(lists, Collections.reverseOrder());
        for (int i:lists){
            System.out.println(i);
        }
    }
}
