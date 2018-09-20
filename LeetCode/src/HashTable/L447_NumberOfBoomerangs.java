package HashTable;

/*
Q:
https://leetcode.com/problems/number-of-boomerangs/

S:
https://leetcode.com/problems/number-of-boomerangs/discuss/92861/Clean-java-solution%3A-O(n2)-166ms
 */

public class L447_NumberOfBoomerangs {
    public static int numberOfBoomerangs(int[][] points){

        int res = 0;
        return res;

    }

    public static int distance(int[] a, int[] b){
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];

        return dx*dx + dy*dy;
    }


    public static void main(String[] args) {
        int[][] a = {{0,1}, {1,2}, {1,1}};
        System.out.println(a.length);
    }
}
