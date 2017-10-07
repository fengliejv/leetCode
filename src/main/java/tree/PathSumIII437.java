package tree;

/**
 * Created by fengliejv on 2017/10/4.
 */

public class PathSumIII437 {

    public int pathSum(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        int left = 0 ;
        int right =0;
        if(root.left!=null){
            left=pathSum(root.left,sum);
        }
        if(root.right!=null){
            right=pathSum(root.right,sum);
        }
        return calculate(root,sum)+left+right;
    }

    private int calculate(TreeNode root ,int sum){
        if(root==null){
            return 0;
        }
        int count =0;
        if(root.val==sum){
            count++;
        }
        return count+calculate(root.left,sum-root.val)+calculate(root.right,sum-root.val);
    }
}
