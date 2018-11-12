package Stack;

import java.util.Stack;

/*
Q:
https://leetcode.com/problems/daily-temperatures/description/
Given a list of daily temperatures, produce a list that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.

For example, given the list temperatures = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].

Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].

S:
https://leetcode.com/problems/daily-temperatures/discuss/109832/Java-Easy-AC-Solution-with-Stack

ToDo Solution2 Array
 */

public class L739_DailyTemperatures {
    public int[] solution1Stack(int[] temperatures){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length]; // Be default all 0's
        for (int i = 0; i < temperatures.length; i++){
            // loop through every temp in temperatures, i records current-in-the-loop temp index
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int idx = stack.pop();
                result[idx] = i - idx;
            }

            stack.push(i);
        }
        return result;


    }
}
