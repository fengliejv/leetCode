package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengliejv on 2018/10/29.
 */

public class NaryTreePreorderTraversal589 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root==null){
            return result;
        }
        result.add(root.val);
        for (Node node:root.children
             ) {
            preorder(node);
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
