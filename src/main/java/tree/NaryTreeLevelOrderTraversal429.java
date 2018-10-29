package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by fengliejv on 2018/10/29.
 */
public class NaryTreeLevelOrderTraversal429 {

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root != null) {
            Queue<Node> queue = new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> levelList = new ArrayList<>();
                while(size != 0) {
                    Node currNode = queue.poll();
                    levelList.add(currNode.val);
                    List<Node> child = currNode.children;
                    for(Node node : child) {
                        queue.offer(node);
                    }
                    size--;
                }
                result.add(levelList);
            }
        }
        return result;
    }
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
