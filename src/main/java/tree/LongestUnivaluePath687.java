package tree;

/**
 * Created by fengliejv on 2017/10/8.
 */
public class LongestUnivaluePath687 {
    int max=0;
    public int longestUnivaluePath(TreeNode root) {
        longestUnivaluePath1(root);
        return max;
    }
    public int longestUnivaluePath1(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = longestUnivaluePath(root.left);
        int right = longestUnivaluePath(root.right);
        int count =0;
        if(root.left!=null){
            if(root.val==root.left.val){
                count=count+left+1;
            }
        }
        if(root.right!=null){
            if(root.val==root.right.val){
                count=count+right+1;
            }
        }
        if(count>max){
            max=count;
        }
        return count;
    }
}
