package bytedance;

import tree.TreeNode;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by fengliejv on 2020/4/17.
 */
public class BinaryTreeZigzagLevelOrderTraversal103 {


    private boolean match(int[] a ,int[] b){
        TreeSet<Integer> treeSet = new TreeSet();
        for (int i = 0; i < b.length; i++) {
            treeSet.add(b[i]);
        }
        for (int i = 0; i < a.length; i++) {
            Integer num = treeSet.lower(i);
            if(num!=null){
                treeSet.remove(num);
            }
        }
        if(a.length-treeSet.size()>treeSet.size()){
            return true;
        }else {
            return false;
        }
    }



    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }


        List<List<Integer>> results = new ArrayList<List<Integer>>();

        // add the root element with a delimiter to kick off the BFS loop
        LinkedList<TreeNode> node_queue = new LinkedList<TreeNode>();
        node_queue.addLast(root);
        node_queue.addLast(null);

        LinkedList<Integer> level_list = new LinkedList<Integer>();
        boolean is_order_left = true;

        while (node_queue.size() > 0) {
            TreeNode curr_node = node_queue.pollFirst();
            if (curr_node != null) {
                if (is_order_left)
                    level_list.addLast(curr_node.val);
                else
                    level_list.addFirst(curr_node.val);

                if (curr_node.left != null)
                    node_queue.addLast(curr_node.left);
                if (curr_node.right != null)
                    node_queue.addLast(curr_node.right);

            } else {
                // we finish the scan of one level
                results.add(level_list);
                level_list = new LinkedList<Integer>();
                // prepare for the next level
                if (node_queue.size() > 0)
                    node_queue.addLast(null);
                is_order_left = !is_order_left;
            }
        }
        return results;
    }
}
