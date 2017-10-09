package tree;

/**
 * Created by fengliejv on 2017/9/23.
 */

public class DiameterofBinaryTree543 {
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return max;
    }
    private int diameter(TreeNode node){
        if(node==null){
            return 0;
        }
        //int count=0;
        int left = diameter(node.left);
        int right = diameter(node.right);
        if(node.left!=null){
            left++;
        }else {
            left=0;
        }
        if(node.right!=null){
            right++;
        }else {
            right=0;
        }
        max=right+left>max?right+left:max;
        return Math.max(left,right);
    }
}
