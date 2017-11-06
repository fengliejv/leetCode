package tree;

/**
 * Created by fengliejv on 2017/11/6.
 */
public class InvertBinaryTree226 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        TreeNode node = root.left;
        root.left=root.right;
        root.right=node;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
