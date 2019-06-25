package ExceptionHandling;

import java.util.Deque;

public class NullPointerExceptionHandeling {

    public static void main(String[] args) {
        final String causeStr = "adding String to Deque that is set to null.";
        final String elementStr = "Fudd";
        Deque<String> deque = null;
        try {
            deque.push(causeStr);
        } catch (NullPointerException npe) {
            System.out.println("We got an exception!");
        } ;
    }
}
