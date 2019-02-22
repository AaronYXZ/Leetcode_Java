package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
https://leetcode.com/problems/kill-process/description/
Given n processes, each process has a unique PID (process id) and its PPID (parent process id).

Each process only has one parent process, but may have one or more children processes. This is just like a tree structure. Only one process has PPID that is 0, which means this process has no parent process. All the PIDs will be distinct positive integers.

We use two list of integers to represent a list of processes, where the first list contains PID for each process and the second list contains the corresponding PPID.

Now given the two lists, and a PID representing a process you want to kill, return a list of PIDs of processes that will be killed in the end. You should assume that when a process is killed, all its children processes will be killed. No order is required for the final answer.

Example 1:
Input:
pid =  [1, 3, 10, 5]
ppid = [3, 0, 5, 3]
kill = 5
Output: [5,10]
Explanation:
           3
         /   \
        1     5
             /
            10
Kill 5 will also kill 10.
Note:
The given kill id is guaranteed to be one of the given PIDs.
n >= 1.
https://leetcode.com/problems/kill-process/discuss/103176/Java-Solution-HashMap
 */
public class L582_KillProcess {

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill){
        // create a map which maps parent to children
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < pid.size(); i++){
            map.put(pid.get(i), new HashSet<Integer>());
        }
        for (int i = 0; i < pid.size(); i++){
            if (map.containsKey(ppid.get(i))){
                Set<Integer> children = map.get(ppid.get(i));
                children.add(pid.get(i));
                map.put(ppid.get(i), children);
            }

        }
        List<Integer> result = new ArrayList<>();
        // recursively calls traverse method, starting from process itself, then all its children, all its grand-children, etc
        traverse(map, result, kill);
        return result;
    }
    private void traverse(Map<Integer, Set<Integer>> map,  List<Integer> result, int kill){
        // given a mapping and process to kill, add process itself and all its children to the result list
        result.add(kill);
        for (Integer child:map.get(kill)){
            traverse(map, result, child);
        }
    }
}
