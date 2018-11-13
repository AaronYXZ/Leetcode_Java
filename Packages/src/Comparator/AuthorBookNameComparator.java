package Comparator;

import java.util.Comparator;

public class AuthorBookNameComparator implements Comparator<Author> {

    @Override
    public int compare(Author o1, Author o2){
        return o1.getBookName().compareTo(o2.getBookName());
    }
}
