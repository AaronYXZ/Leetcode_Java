package Comparator;

import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<Author> {

    @Override
    public int compare(Author o1, Author o2) {
        if (o1.getAuAge() == o2.getAuAge())  return 0;
        if (o1.getAuAge() > o2.getAuAge()) return 1;
        else return -1;
    }
}
