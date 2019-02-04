package Array;

import java.util.HashSet;
import java.util.Set;

public class L575_DistributeCandies {
    public static int distributeCandies(int[] candies){
        Set<Integer> set = new HashSet<>();
        for (int candy : candies){
            set.add(candy);
        }

        return Math.min(set.size(), candies.length / 2);
    }
}
