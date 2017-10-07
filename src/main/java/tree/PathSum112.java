package tree;

/**
 * Created by fengliejv on 2017/10/7.
 */
public class PathSum112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
                return false;

        }
        if(root.left==null&&root.right==null){
            if(root.val==sum){
                return true;
            }
        }

        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);

    }
}
