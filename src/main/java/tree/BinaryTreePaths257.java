package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by fengliejv on 2017/9/23.
 */

public class BinaryTreePaths257 {
    List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return list;
        }
        addString(root, new String());
        return list;
    }

    private void addString(TreeNode treeNode, String string) {
        if(treeNode==null){
            return;
        }
        string = string + treeNode.val + "";

        if (treeNode.left == null&&treeNode.right==null) {
            list.add(string);
            return;
        }
        if(treeNode.left!=null){
            addString(treeNode.left, string+"->" );
        }
        if(treeNode.right!=null){
            addString(treeNode.right, string+"->" );
        }
    }


}
