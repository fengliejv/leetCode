package tree;

/**
 * Created by fengliejv on 2017/9/23.
 */
// top down approach  and dfs,dfs need some skills
public class BalancedBinaryTree110 {
    public boolean isBalancedDFS(TreeNode root) {
        if(root==null){
            return true;
        }

        return dept(root)!=Integer.MAX_VALUE;
    }
    private int dept(TreeNode root){
        int leftDepth = 0;
        int rightDepth = 0;
        if(root.left!=null){
            leftDepth = dept(root.left);
        }
        if(root.right!=null){
            rightDepth = dept(root.right);
        }
        if(leftDepth==Integer.MAX_VALUE||rightDepth==Integer.MAX_VALUE||Math.abs(leftDepth-rightDepth)>1){
            return Integer.MAX_VALUE;
        }
        return Math.max(leftDepth,rightDepth)+1;

    }


    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isBalance(root.left, root.right)) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private boolean isBalance(TreeNode l, TreeNode r) {
        if (Math.abs(depth(l) - depth(r)) < 2) {
            return true;
        } else {
            return false;
        }
    }

    private int depth(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        return 1 + Math.max(depth(treeNode.left), depth(treeNode.right));
    }

}
