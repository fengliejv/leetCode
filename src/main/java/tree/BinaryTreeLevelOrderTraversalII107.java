package tree;

import java.util.*;

/**
 * Created by fengliejv on 2017/11/8.
 */
public class BinaryTreeLevelOrderTraversalII107 {
    List<List<Integer>> lists = new LinkedList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            return lists;
        }
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        serch(list);
        Collections.reverse(lists);
        return lists;
    }

    private void serch(LinkedList<TreeNode> list){
        if(list.size()==0){
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i <list.size() ; i++) {
            TreeNode node = list.get(i);
            arrayList.add(node.val);
            if(node.left!=null){
                linkedList.add(node.left);
            }
            if(node.right!=null){
                linkedList.add(node.right);
            }
        }
        lists.add(arrayList);
        serch(linkedList);
    }
}
