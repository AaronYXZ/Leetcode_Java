package Array;

/*
Q:
https://leetcode.com/problems/h-index/description/

Given an array of citations (each citation is a non-negative integer) of a researcher, write a function to compute the researcher's h-index.

According to the definition of h-index on Wikipedia: "A scientist has index h if h of his/her N papers have at least h citations each, and the other N − h papers have no more than h citations each."

Example:

Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had
             received 3, 0, 6, 1, 5 citations respectively.
             Since the researcher has 3 papers with at least 3 citations each and the remaining
             two with no more than 3 citations each, her h-index is 3.
Note: If there are several possible values for h, the maximum one is taken as the h-index.

S:
https://leetcode.com/problems/h-index/discuss/70768/Java-bucket-sort-O(n)-solution-with-detail-explanation
 */

public class L274_HIndex {

    public static int Hindex(int[] citations){
        int n = citations.length;
        int[] bucket = new int[n+1];
        for (int i : citations){
            if (i > n) bucket[n]++;
            else bucket[i]++;
        }

        int count = 0;
        for (int i = n; i>=0; i--){
            count += bucket[i];
            if(count >= i) return i;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] citations = {3,0,6,5,1};
        System.out.println(Hindex(citations));
    }
}
