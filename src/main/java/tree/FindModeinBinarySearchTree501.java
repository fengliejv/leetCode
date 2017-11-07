package tree;

import java.util.ArrayList;

/**
 * Created by fengliejv on 2017/11/6.
 */
public class FindModeinBinarySearchTree501 {
    Integer pre = null;
    int count = 0;
    int max = Integer.MIN_VALUE;

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        search(root, arrayList);
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }

    private void search(TreeNode root, ArrayList list) {
        if(root==null){
            return;
        }
        search(root.left,list);
        if(pre==null){
            pre=root.val;
            count=1;
            max=1;
            list.add(root.val);
        }else {
            if(root.val==pre){
                count++;
                if(count==max){
                    list.add(root.val);
                }
                if(count>max){
                    list.clear();
                    list.add(root.val);
                    max=count;
                }
            }else {
                count=1;
                pre=root.val;
                if(count==max){
                    list.add(root.val);
                }
            }
        }

        search(root.right,list);
    }
}
