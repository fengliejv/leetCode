package tree;

/**
 * Created by fengliejv on 2017/11/5.
 */
public class ConvertBSTtoGreaterTree538 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        change(root);
        return root;
    }
    private void change(TreeNode node){
        if(node==null){
            return ;
        }
        change(node.right);
        sum +=node.val;
        node.val=sum;
        change(node.left);

    }
}
