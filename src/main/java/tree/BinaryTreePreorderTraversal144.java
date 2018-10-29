package tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengliejv on 2018/10/29.
 */
public class BinaryTreePreorderTraversal144 {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return result;
        }
        result.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return result;
    }
}
