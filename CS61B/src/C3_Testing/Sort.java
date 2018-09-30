package C3_Testing;

public class Sort {
    public static void sort(String[] x){

        return;
    }

    public static String findSmallest(String[] x){
//        return x[1];

        String smallest = x[0];
        for (String s : x){
            int comp = s.compareTo(smallest);
//            https://stackoverflow.com/questions/5153496/how-can-i-compare-two-strings-in-java-and-define-which-of-them-is-smaller-than-t
//            str1.compareTo(str2);
//            If str1 is lexicographically less than str2, a negative number will be returned, 0 if equal or a positive number if str1 is greater.
//            "a".compareTo("b"); // returns a negative number, here -1
//            "a".compareTo("a"); // returns  0
//            "b".compareTo("a"); // returns a positive number, here 1
            if (comp < 0) smallest = s;
        }
        return smallest;
    }
}
