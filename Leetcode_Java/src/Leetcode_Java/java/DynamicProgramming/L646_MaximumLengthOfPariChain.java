package DynamicProgramming;

import java.util.Arrays;

public class L646_MaximumLengthOfPariChain {
    public int findLongestChain(int[][] pairs){
        if(pairs.length == 0) return 0;
        Arrays.sort(pairs, (a,b)->a[1]-b[1]);
        int pre = pairs[0][1];
        int count = 1;
        for(int i = 1;i<pairs.length;i++){
            if(pairs[i][0] > pre){
                count++;
                pre = pairs[i][1];
            }
        }
        return count;
    }
}
