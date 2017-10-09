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
        int val = root.val;
        int left = longestUnivaluePath1(root.left);
        int right = longestUnivaluePath1(root.right);
        int count =0;

        if(root.left!=null){
            if(root.val==root.left.val){
                left++;
                count=count+left;
            }else {
                left=0;
            }
        }
        if(root.right!=null){
            if(root.val==root.right.val){
                right++;
                count=count+right;
            }else {
                right=0;
            }
        }

        if(count>max){
            max=count;
        }
        return Math.max(left,right);
    }
}
