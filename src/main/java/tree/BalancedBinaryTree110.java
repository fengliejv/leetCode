package tree;

/**
 * Created by fengliejv on 2017/9/23.
 */
public class BalancedBinaryTree110 {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(!isBalance(root.left,root.right)){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }

    private boolean isBalance(TreeNode l,TreeNode r){
        if(Math.abs(depth(l)-depth(r))<2){
            return true;
        }else {
            return false;
        }
    }
    private int depth(TreeNode treeNode){
        if(treeNode==null){
            return 0;
        }
        return 1+Math.max(depth(treeNode.left),depth(treeNode.right));
    }

}
