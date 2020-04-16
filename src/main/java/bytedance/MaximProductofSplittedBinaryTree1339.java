package bytedance;

import tree.TreeNode;

/**
 * Created by fengliejv on 2020/4/16.
 */
public class MaximProductofSplittedBinaryTree1339 {
    long sum = 0;
    long max = 0;
    public int maxProduct(TreeNode root) {
        sum = dfs(root);
        getMax(root);
        return (int) (max % (int)(10e9 + 7));
    }

    private long getMax(TreeNode root) {
        if(root==null){
            return 0;
        }
        long s = root.val+getMax(root.left)+getMax(root.right);
        long num = s*(sum-s);
        if(num>max){
            max=num;
        }
        return s;
    }

    private long dfs(TreeNode root) {
        if(root == null){
            return 0;
        }
        return root.val + dfs(root.left)+dfs(root.right);
    }
}
