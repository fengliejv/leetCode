package mergetwobinarytrees617;

/**
 * Created by fengliejv on 2017/9/6.
 */
//有个坑，如果 t1是个null值，对其赋值，返回的还是null值
public class MergeTwoBinaryTrees {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode(int x) { val = x; }
     * }
     */
    class Solution {

        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
            if (t1 == null && t2 != null) {
                return t2;

            }
            if (t1 != null && t2 == null) {
                return t1;
            }
            if (t1 != null && t2 != null) {
                t1.val = t1.val + t2.val;
                if (t1.left != null) {
                    if (t2.left != null) {
                        mergeTrees(t1.left, t2.left);
                    } else {

                    }
                } else {
                    t1.left = t2.left;
                }
                if (t1.right != null) {
                    if (t2.right != null) {
                        mergeTrees(t1.right, t2.right);
                    } else {
                        //return;
                    }
                } else {
                    t1.right = t2.right;
                }
            }
            return t1;
        }

    }

    public static void main(String[] args) {
        TreeNode t1 = null;
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new MergeTwoBinaryTrees().new Solution().mergeTrees(t1,t2);
        System.out.println(t3);
    }

}
