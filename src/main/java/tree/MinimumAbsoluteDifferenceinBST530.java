package tree;

import java.util.ArrayList;

/**
 * Created by fengliejv on 2017/10/15.
 */
public class MinimumAbsoluteDifferenceinBST530 {
    //    public int getMinimumDifference(TreeNode root) {
//        if (root == null) {
//            return Integer.MAX_VALUE;
//        }
//        int left = Integer.MAX_VALUE;
//        int right = Integer.MAX_VALUE;
//
//        if (root.left != null) {
//            left = Math.min(getMinimumDifference(root.left),Math.abs(root.val-root.left.val));
//        }
//        if(root.right !=null){
//            right = Math.min(getMinimumDifference(root.right),Math.abs(root.val-root.right.val));
//        }
//        return Math.min(left,right);
//    }
    ArrayList<Integer> list = new ArrayList();
    public int getMinimumDifference(TreeNode root) {
        midSearch(root);
        int max = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            max = Math.min(max,Math.abs(list.get(i)-list.get(i-1)));
        }
        return max;
    }
    private void midSearch(TreeNode node){
        if(node==null){
            return;
        }
        midSearch(node.left);
        list.add(node.val);
        midSearch(node.right);
    }
}
