package tree;

/**
 * Created by fengliejv on 2017/11/6.
 */
public class SecondMinimumNodeInaBinaryTree671 {
    int secMin = Integer.MAX_VALUE;
        public int findSecondMinimumValue(TreeNode root) {
        if(root==null){
            return -1;
        }
        if(root.left==null){
            return secMin==Integer.MAX_VALUE?-1:secMin;
        }
        if(root.val==root.left.val&&root.val==root.right.val){
            findSecondMinimumValue(root.left);
            findSecondMinimumValue(root.right);
            return secMin==Integer.MAX_VALUE?-1:secMin;
        }

        if(root.val==root.left.val){
            if(root.right.val<secMin)
                secMin = root.right.val;
            return findSecondMinimumValue(root.left);
        }else {
            if(root.left.val<secMin)
                secMin = root.left.val;
            return findSecondMinimumValue(root.right);
        }
    }
}
