package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Q:
https://leetcode.com/problems/simplify-path/description/
S:
http://www.cnblogs.com/grandyang/p/4347125.html

Given an absolute path for a file (Unix-style), simplify it.

For example,
path = "/home/", => "/home"
path = "/a/./b/../../c/", => "/c"

Corner Cases:

Did you consider the case where path = "/../"?
In this case, you should return "/".
Another corner case is the path might contain multiple slashes '/' together, such as "/home//foo/".
In this case, you should ignore redundant slashes and return "/home/foo".
 */

public class L71_SimplifyPath {
    public static String solution2(String path){

        Stack<String> strings = new Stack<>();
        String[] p = path.split("/");
        for (String t:p){
            if (!t.isEmpty() && t.equals("..")) strings.pop();
            else if (!t.equals(".") && !t.equals("") && !t.equals("..")) strings.push(t);
        }

        List<String> list = new ArrayList<>(strings);
        return "/" + String.join("/", list);

    }
}
