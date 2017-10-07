package tree;

/**
 * Created by fengliejv on 2017/10/7.
 */
public class HouseRobberIII337 {
    public int rob(TreeNode root) {
        if(root==null){
            return 0;
        }
        Result result = robtree(root);
        return Math.max(result.unusedsum,result.usedsum);
    }
    private Result robtree(TreeNode root){
        Result left = new Result();
        Result right = new Result();
        if(root.left!=null){
            left = robtree(root.left);
        }
        if(root.right!=null){
            right = robtree(root.right);
        }
        int usedsum = root.val + left.unusedsum+right.unusedsum;
        int unusedsum = Math.max(left.unusedsum,left.usedsum)+Math.max(right.unusedsum,right.usedsum);
        return new Result(usedsum,unusedsum);
    }

    class Result{
        public int usedsum =0;
        public int unusedsum = 0;
        public Result(){

        }
        public Result(int usedsum,int unusedsum){
            this.usedsum = usedsum;
            this.unusedsum = unusedsum ;
        }
    }
//    private int robtree(TreeNode tr)
}
