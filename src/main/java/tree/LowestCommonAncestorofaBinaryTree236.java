package tree;

/**
 * Created by fengliejv on 2018/11/2.
 */
public class LowestCommonAncestorofaBinaryTree236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p){
            return p;
        }
        if(root==q){
            return q;
        }
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null){
            return root;
        }else {
            if(left!=null){
                return left;
            }
            if(right!=null){
                return right;
            }
        }
        return null;
    }
}
