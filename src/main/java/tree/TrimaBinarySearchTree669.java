package tree;

/**
 * Created by fengliejv on 2017/11/5.
 */
//todo
//public class TrimaBinarySearchTree669 {
//    int low=0;
//    int high =0;
//    public TreeNode trimBST(TreeNode root, int L, int R) {
//        low=L;
//        high=R;
//        while (root.val>high){
//            if(root.left!=null){
//                root=root.left;
//            }else {
//                return null;
//            }
//        }
//
//        while (root.val<low){
//            if(root.right!=null){
//                root = root.right;
//            }else {
//                return null;
//            }
//        }
//        trim(root);
//        return root;
//    }
//
//    private void trim(TreeNode node){
//        if(node==null){
//            return;
//        }
//        if(node.left!=null&&node.left.val<low){
//
//            node.left=node.left.right;
//        }
//        if(node.right!=null&&node.right.val>high){
//            node.right = node.right.left;
//        }
//        trim(node.left);
//        trim(node.right);
////    }
//}
