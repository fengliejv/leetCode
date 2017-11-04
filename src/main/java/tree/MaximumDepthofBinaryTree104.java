package tree;

/**
 * Created by fengliejv on 2017/11/4.
 */
public class MaximumDepthofBinaryTree104 {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}
