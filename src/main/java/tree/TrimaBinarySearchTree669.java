package tree;

/**
 * Created by fengliejv on 2017/11/5.
 */

public class TrimaBinarySearchTree669 {
    int low=0;
    int high =0;
    public TreeNode trimBST(TreeNode root, int L, int R) {
        low=L;
        high=R;
        while (root.val>high||root.val<low){
            if(root.val>high&&root.left!=null){
                root=root.left;
            }else if(root.val<low&&root.right!=null){
                root = root.right;
            }else {
                return null;
            }
        }
        trim(root);
        return root;
    }

    private void trim(TreeNode node){
        if(node==null){
            return;
        }
        if(node.left!=null&&node.left.val<low){

            node.left=node.left.right;
            trim(node);
        }
        if(node.right!=null&&node.right.val>high){
            node.right = node.right.left;
            trim(node);
        }
        trim(node.left);
        trim(node.right);
    }


    public TreeNode trimBST2(TreeNode root, int L, int R) {
        if (root == null) {
            return root;
        }

        if (root.val > R) {
            return trimBST(root.left, L, R);
        }

        if (root.val < L) {
            return trimBST(root.right, L, R);
        }

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
