/**
 * Created by fengliejv on 2017/9/11.
 */
import array.DungeonGame174;
import array.Searcha2DMatrixII240;
import di.PerfectSquares279;
import math.TrappingRainWater42;
import tree.*;
//import tree.Bit


public class Test {
    public static void main(String[] args) {

        int[][] grifd= new int[][]{{-2,-3,3},
                {-5,-10,1},
                {10,30,-5}
                                    };
        int[][] g= new int[][]{{-1},{-1},

        };
        int[] a = new int[]{2,0,2};
//        int[] b = new int[]{-1,2,0};
//        int[] c = new int[]{4,3,2,1};
//        int num  =2126753390;
//        ListNode node = new ListNode();
//        ListNode n = node.init(a);
//        String s ="cbaebabacd";
//        String t ="abc";
        TreeNode node = TreeNode.createBinTree(new int[]{1,0,2});
        PerfectSquares279 jr = new PerfectSquares279();

        System.out.println( jr.numSquares(12));
        System.out.println( jr.numSquares(13));




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
