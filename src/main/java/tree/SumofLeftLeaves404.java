package tree;

/**
 * Created by fengliejv on 2017/11/4.
 */
public class SumofLeftLeaves404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = sumOfLeftLeaves(root.left);
        int right = sumOfLeftLeaves(root.right);
        int l =0;
        if(root.left!=null&&root.left.left==null&&root.left.right==null){
            l = root.left.val;
        }
        return l+left+right;
    }



//    public int sumOfLeftLeaves(TreeNode root) {
//        if(root==null){
//            return 0;
//        }
//        int left = sumOfLeftLeaves(root.left);
//        int right = sumOfLeftLeaves(root.right);
//        int l = 0;
//        if(root.left!=null){
//            l = root.left.val;
//        }
//        return l+left+right;
//    }
}
