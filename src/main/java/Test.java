/**
 * Created by fengliejv on 2017/9/11.
 */
import array.SetMatrixZeroes73;
import searchandsort.RelativeRanks506;
import tree.*;
//import tree.Bit


public class Test {
    public static void main(String[] args) {

        int[][] grifd= new int[][]{{0},{1}};
        int[] a = new int[]{1,7,3,6,5,6};
//        int[] b = new int[]{-1,2,0};
//        int[] c = new int[]{4,3,2,1};
//        int num  =2126753390;
//        ListNode node = new ListNode();
//        ListNode n = node.init(a);
//        String s ="cbaebabacd";
//        String t ="abc";
        TreeNode node = TreeNode.createBinTree(new int[]{1,0,2});
        SetMatrixZeroes73 jr = new SetMatrixZeroes73();
        jr.setZeroes(grifd);
        System.out.println(grifd);
//        System.out.println(jr.reverseBits(   ));

    }
    private static  void printTree(TreeNode node){
        if(node==null){
            return;
        }
        System.out.println(node.val);
        printTree(node.left);
        printTree(node.right);
    }



}
