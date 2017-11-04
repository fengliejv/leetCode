package tree;

import java.util.*;

/**
 * Created by fengliejv on 2017/10/9.
 */

public class AverageofLevelsinBinaryTree637 {
    public List<Double> averageOfLevels(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        calcu(queue,res);
        return res;
    }
    private void calcu(Queue<TreeNode> nodes,List<Double> res){
        Queue<TreeNode> queue = new LinkedList<>();
        double sum = 0;
        int length = nodes.size();
        while (nodes.size()!=0){
            TreeNode node = nodes.poll();
            sum+=node.val;
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }

        res.add(sum/length);
        if(queue.size()!=0){
            calcu(queue,res);
        }
    }
}
