package Arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

    public static void main(String[] args) {
        // Arrays.sort
        int[][] pairs = new int[][]{{1,2}, {3,4}, {6,8}, {0, 5}};
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        Arrays.stream(pairs).forEach(a->{
            System.out.println(a[0]);
            System.out.println(a[1]);
        });

        // Arrays.asList
        List<Integer> list = Arrays.asList(1,2,3,4);


        // Arrays.fill
        boolean[] flags = new boolean[10];
        Arrays.fill(flags, true);


    }
}
