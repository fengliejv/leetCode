package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by fengliejv on 2017/10/9.
 */
//todo
public class AverageofLevelsinBinaryTree637 {
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> value = new ArrayList<>();
        List<Double> result = new ArrayList<>();
        if (root != null) {
            queue.offer(root);
            while (queue.size() != 0) {
                TreeNode nowNode = queue.poll();
                value.add(nowNode.val);
                if (nowNode.left != null)
                    queue.offer(nowNode.left);
                if (nowNode.right != null)
                    queue.offer(nowNode.right);
            }
        }
        return result;
    }
}
