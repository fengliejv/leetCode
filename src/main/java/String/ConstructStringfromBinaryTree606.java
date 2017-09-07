package String;

import tree.TreeNode;

/**
 * Created by fengliejv on 2017/9/7.
 */
public class ConstructStringfromBinaryTree606 {
    class Solution {
        public String tree2str(TreeNode t) {
            StringBuilder sb = new StringBuilder();
            search(t,sb);
            return sb.toString();
        }

        public void search(TreeNode t,StringBuilder sb){

            if(t==null){
                return;
            }
            sb.append(t.val);
            if(t.left!=null){
                sb.append("(");
                search(t.left,sb);
                sb.append(")");
            }else {
                if (t.right != null) {
                    sb.append("()");
                }
            }
            if(t.right!=null){
                sb.append("(");
                search(t.right,sb);
                sb.append(")");
            }

        }

        public void searchLeft(TreeNode t,StringBuilder sb){

        }
    }
}
