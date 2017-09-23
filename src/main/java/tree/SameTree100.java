package tree;

/**
 * Created by fengliejv on 2017/9/23.
 */
public class SameTree100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSame(p,q);
    }
    private boolean isSame(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null&&q!=null){
            return false;
        }

        if(p!=null&&q==null){
            return false;
        }

        if(p.val!=q.val){
            return false;
        }
        return isSame(p.left,q.left)&&isSame(p.right,q.right);
    }
}
