package tree;

/**
 * Created by fengliejv on 2017/11/4.
 */
public class ConvertSortedArraytoBinarySearchTree108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){
            return null;
        }
        return build(nums,0,nums.length-1);
    }
    private TreeNode build(int[] nums,int begin,int end){
        if(begin<=end){
            int mid = (begin+end)/2;
            TreeNode treeNode = new TreeNode(nums[mid]);
            treeNode.left=build(nums,begin,mid-1);
            treeNode.right=build(nums,mid+1,end);
            return treeNode;
        }
        return null;
    }
}
