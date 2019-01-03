package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class L102_BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> resultList = new LinkedList<List<Integer>>();

        if(root == null) return resultList;

        queue.offer(root);

        while(!queue.isEmpty()){
            List<Integer> tempList = new LinkedList<>();
            int levelNum = queue.size();
            for (int i = 0; i < levelNum; i++){
                TreeNode node = queue.peek();
                if (node.left != null) queue.offer(node.left);
                if(node.right != null) queue.offer(node.right);
                tempList.add(node.val);
                queue.poll();
            }
            resultList.add(tempList);
        }

        return resultList;
    }
}
