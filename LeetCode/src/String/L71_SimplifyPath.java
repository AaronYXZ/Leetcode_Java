package String;

import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/*
Q:
https://leetcode.com/problems/simplify-path/description/
S:
https://leetcode.com/problems/simplify-path/discuss/25686/Java-10-lines-solution-with-stack

The main idea is to push to the stack every valid file name (not in {"",".",".."}), popping only if there's smth to pop and we met "..".
 */

public class L71_SimplifyPath {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
        for (String dir : path.split("/")) {
            if (dir.equals("..") && !stack.isEmpty()) stack.pop();
            else if (!skip.contains(dir)) stack.push(dir);
        }
        String res = "";
        for (String dir : stack) res = "/" + dir + res;
        return res.isEmpty() ? "/" : res;
    }
}
