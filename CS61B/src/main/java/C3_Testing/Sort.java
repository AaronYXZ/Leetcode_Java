package C3_Testing;

public class Sort {
    public static void sort(String[] x){
        sort(x, 0);
    }

    private static void sort(String[] x, int start){
        if (start == x.length) return;
        int smallest = findSmallest(x, start);
        swap(x, start, smallest);
        sort(x, start + 1);
    }

    public static int findSmallest(String[] x, int start){
//        return x[1];

        int smallest = start;
        for (int i = start; i<x.length;  i++){
            String temp = x[i];
            int comp = temp.compareTo(x[smallest]);
//            https://stackoverflow.com/questions/5153496/how-can-i-compare-two-strings-in-java-and-define-which-of-them-is-smaller-than-t
//            str1.compareTo(str2);
//            If str1 is lexicographically less than str2, a negative number will be returned, 0 if equal or a positive number if str1 is greater.
//            "a".compareTo("b"); // returns a negative number, here -1
//            "a".compareTo("a"); // returns  0
//            "b".compareTo("a"); // returns a positive number, here 1
            if (comp < 0) smallest = i;
        }
        return smallest;
    }

    public static void swap(String[] x, int a, int b){
        String temp = x[a];
        x[a] = x[b];
//        x[b] = x[a];
        x[b] = temp;
    }
}
