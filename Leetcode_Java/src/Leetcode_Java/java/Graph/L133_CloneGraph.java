package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Q:
https://leetcode.com/problems/clone-graph/description/

Given the head of a graph, return a deep copy (clone) of the graph. Each node in the graph contains a label (int) and a list (List[UndirectedGraphNode]) of its neighbors. There is an edge between the given node and each of the nodes in its neighbors.


OJ's undirected graph serialization (so you can understand error output):
Nodes are labeled uniquely.

We use # as a separator for each node, and , as a separator for node label and each neighbor of the node.


As an example, consider the serialized graph {0,1,2#1,2#2,2}.

The graph has a total of three nodes, and therefore contains three parts as separated by #.

First node is labeled as 0. Connect node 0 to both nodes 1 and 2.
Second node is labeled as 1. Connect node 1 to node 2.
Third node is labeled as 2. Connect node 2 to node 2 (itself), thus forming a self-cycle.

S:
https://leetcode.com/problems/clone-graph/discuss/42309/Depth-First-Simple-Java-Solution
 */

public class L133_CloneGraph {

    private class UndirectedGraphNode{
        int label;
        List<UndirectedGraphNode> neighbors;
        UndirectedGraphNode(int x){
            label = x;
            neighbors = new ArrayList<UndirectedGraphNode>();
        }
    }

    private HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
        return clone(node);
    }

    private UndirectedGraphNode clone(UndirectedGraphNode node){
        if (node == null) return null;

        if (map.containsKey(node.label)){
            return map.get(node.label);
        }

        UndirectedGraphNode clone = new UndirectedGraphNode(node.label);
        map.put(node.label, clone);
        for (UndirectedGraphNode neighbor:node.neighbors){
            clone.neighbors.add(clone(neighbor));
        }

        return clone;
    }
}
