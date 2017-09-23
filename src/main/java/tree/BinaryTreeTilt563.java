package tree;

/**
 * Created by fengliejv on 2017/9/23.
 */
public class BinaryTreeTilt563 {
    int sum = 0;

    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        sum = oneTilt(root) + findTilt(root.left) + findTilt(root.right);
        return sum;
    }

    public int oneTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.abs(findSum(root.left) - findSum(root.right));
    }

    private int findSum(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        return treeNode.val + findSum(treeNode.left) + findSum(treeNode.right);
    }
}
