package tree;

/**
 * Created by fengliejv on 2017/10/9.
 */
public class MaximumBinaryTree654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0){
            return new TreeNode();
        }
        TreeNode root = new TreeNode(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            TreeNode treeNode = new TreeNode(nums[i]);
            root = insert(root,treeNode);
        }
         return root;
    }
    private TreeNode insert(TreeNode root,TreeNode treeNode){
        if(root==null){
            root=treeNode;
            return root;
        }
        if(root.val>treeNode.val){
            if(root.right==null){
                root.right=treeNode;
            }else {
                if(root.right.val>treeNode.val) {
                    insert(root.right, treeNode);
                }else {
                    TreeNode node = root.right;
                    root.right=treeNode;
                    treeNode.left = node;
                }
            }
        }else {
            treeNode.left=root;
            root=treeNode;
        }
        return root;
    }
}
