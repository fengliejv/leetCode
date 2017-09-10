package tree;

import tree.TreeNode;

import java.util.HashMap;

/**
 * Created by fengliejv on 2017/9/7.
 */
public class TwoSumIVInput653 {

    class Solution {
        HashMap<Integer,Boolean> hashMap = new HashMap<Integer, Boolean>();
        public boolean findTarget(TreeNode root, int k) {
            if(root==null){
                return false;
            }
            if(hashMap.containsKey(k-root.val)){
                return true;
            }
            hashMap.put(root.val,true);
            return  findTarget(root.left,k)||findTarget(root.right,k);


        }

    }
//
//    public static void main(String[] args) {
//
//    }
}
