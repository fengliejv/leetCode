package tree;

/**
 * Created by fengliejv on 2017/9/23.
 */
public class MinimumDepthofBinaryTree111 {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null){
            return minDepth(root.right)+1;
        }
        if(root.right==null){
            return minDepth(root.left)+1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }

//    private int depth (TreeNode root){
//        if(root==null){
//            return 0;
//        }
//        return Math.min(depth(root.left),depth(root.right))+1;
//
//    }
}
