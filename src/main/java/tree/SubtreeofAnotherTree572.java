package tree;

/**
 * Created by fengliejv on 2017/9/9.
 */

public class SubtreeofAnotherTree572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null&&t==null){
            return true;
        }
        if(s==null&&t!=null){
            return false;
        }
        if(t==null){
            return false;
        }
        if(isSub(s,t)){
            return true;
        }
        return isSubtree(s.left,t)|| isSubtree(s.right,t);

    }


    public boolean isSub(TreeNode s,TreeNode t){
        if(s==null&&t==null){
            return true;
        }
        if(s==null){
            return false;
        }
        if(t==null){
            return false;
        }
        if(t.val!=s.val){
            return false;
        }
        return isSub(s.left,t.left)&&isSub(s.right,t.right);
    }


}
