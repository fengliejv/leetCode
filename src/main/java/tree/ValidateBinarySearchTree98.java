package tree;

/**
 * Created by fengliejv on 2018/10/28.
 */
public class ValidateBinarySearchTree98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        return validate(root);
    }

    Integer pre ;

    private boolean validate(TreeNode treeNode) {
        boolean flag = true;
        if (treeNode.left != null) {
            flag = validate(treeNode.left);
        }
        if(flag) {
            if (pre != null) {
                if (pre >= treeNode.val) {
                    return false;
                }
            }
        }else {
            return false;
        }
        pre = treeNode.val;

        if (treeNode.right != null) {
            flag = validate(treeNode.right);
        }
        return flag;
    }
}
