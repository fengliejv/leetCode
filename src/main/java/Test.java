/**
 * Created by fengliejv on 2017/9/11.
 */
import array.Permutations46;
import array.SetMatrixZeroes73;
import math.DivideTwoIntegers29;
import math.PerfectSquares279;
import math.TrappingRainWater42;
import math.UglyNumberII264;
import searchandsort.RelativeRanks506;
import tree.*;
//import tree.Bit


public class Test {
    public static void main(String[] args) {

        int[][] grifd= new int[][]{{0},{1}};
        int[] a = new int[]{2,0,2};
//        int[] b = new int[]{-1,2,0};
//        int[] c = new int[]{4,3,2,1};
//        int num  =2126753390;
//        ListNode node = new ListNode();
//        ListNode n = node.init(a);
//        String s ="cbaebabacd";
//        String t ="abc";
        TreeNode node = TreeNode.createBinTree(new int[]{1,0,2});
        TrappingRainWater42 jr = new TrappingRainWater42();

        System.out.println( jr.trap(a));



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
