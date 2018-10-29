package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengliejv on 2018/10/29.
 */
public class BinaryTreeInorderTraversal94 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null){
            return result;
        }
        inorderTraversal(root.left);
        result.add(root.val);
        inorderTraversal(root.right);
        return result;
    }
}
