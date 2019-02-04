package HashTable;

/*
Q:
https://leetcode.com/problems/number-of-boomerangs/

S:
https://leetcode.com/problems/number-of-boomerangs/discuss/92861/Clean-java-solution%3A-O(n2)-166ms
 */

import java.util.HashMap;
import java.util.Map;

public class L447_NumberOfBoomerangs {
    public static int numberOfBoomerangs(int[][] points){
        Map<Integer, Integer> map = new HashMap<>();

        int res = 0;
        for (int i = 0; i < points.length; i++){
            for (int j = 0; j<points.length; j++){
                if (i == j)
                    continue;
                int d = distance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0) + 1);

            }
            for (int value:map.values()){
                res += value * (value-1);
            }
            map.clear();

        }

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
