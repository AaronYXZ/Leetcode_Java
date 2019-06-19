package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

    public static void main(String[] args) {
        // List of objects of Author class
        ArrayList<Author> al = new ArrayList<Author>();
        al.add(new Author("Henry", "Tropic of Cancer", 45));
        al.add(new Author("Nalo", "Brown Girl in the Ring", 56));
        al.add(new Author("Frank", "300", 65));
        al.add(new Author("Deborah", "Sky Boys", 51));
        al.add(new Author("George R. R.", "A Song of Ice and Fire", 62));

        /*Sorting using AuthorAgeComparator*/
        System.out.println("Sorting by Author Age:");
        Collections.sort(al, new AuthorAgeComparator());
        for (Author au : al) {
            System.out.println(au.getFirstName() + ", " + au.getBookName() + ", " +
                    au.getAuAge());
        }
        System.out.println();
        /*Sorting using BookNameComparator*/
        System.out.println("Sorting by Book Name:");
        Collections.sort(al, new AuthorBookNameComparator());
        for (Author au : al) {
            System.out.println(au.getFirstName() + ", " + au.getBookName() + ", " +
                    au.getAuAge());
        }
    }
}
