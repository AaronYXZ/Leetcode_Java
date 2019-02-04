package Array;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/pascals-triangle/description/
Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.


In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]

Use approach similar to L119, just borrow the list from last iteration and update using
1) list.add(0, 1)
2) list(j) = list(j)+list(j'+1)

ToDO
1) Arrays.asList(nums) can't be resized, so only use ArrayList to create the first list
2) use shallow copy instead of list.get(i) since the latter will modify the original list
https://stackoverflow.com/questions/2592985/arraylist-shallow-copy-iterate-or-clone
List original = ...
List shallowCopy = new ArrayList(original);
 */
public class L118_PascalTriangle {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) return result;
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        result.add(lst);
        for (int i = 1; i < numRows; i++){
            List<Integer> tempResult = new ArrayList<>(result.get(i - 1));
            tempResult.add(0, 1);
            for (int j = 1; j < tempResult.size()-1; j++){
                tempResult.set(j, tempResult.get(j) + tempResult.get(j+1));
            }
            result.add(tempResult);
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> result = generate(4);
        result.stream().forEach(System.out::println);
    }
}
