package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo_CustomObject {

    public static void main(String[] args) {
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Henry","Miller", "Tropic of Cancer"));
        authors.add(new Author("Nalo","Hopkinson", "Brown Girl in the Ring"));
        authors.add(new Author("Frank","Miller", "300"));
        authors.add(new Author("Deborah","Hopkinson", "Sky Boys"));
        authors.add(new Author("George R. R.","Martin", "Song of Ice and Fire"));

        /*
         * Sorting the list using Collections.sort() method, we
         * can use this method because we have implemented the
         * Comparable interface in our user defined class Author
         */
        Collections.sort(authors);
        for(Author str:authors){
            System.out.println(str.firstName+" "+
                    str.lastName+" "+"Book: "+str.bookName);
        }
    }
}

