/**
 * Created by fengliejv on 2017/9/11.
 */
import array.*;
import map.MaxAreaofIsland695;
import map.SurroundedRegions130;
import math.*;
import number.ExcelSheetColumnNumber171;
import number.ExcelSheetColumnTitle168;
import string.RepeatedStringMatch686;
import tree.*;

import java.util.TreeMap;
//import tree.Bit


public class Test {
    public static void main(String[] args) {

//        int[][] grifd= new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        int[] a = new int[]{1,7,3,6,5,6};
//        int[] b = new int[]{-1,2,0};
//        int[] c = new int[]{4,3,2,1};
//        int num  =2126753390;
//        ListNode node = new ListNode();
//        ListNode n = node.init(a);
//        String s ="cbaebabacd";
//        String t ="abc";
        TreeNode node = TreeNode.createBinTree(new int[]{1,0,2});
        LargestPalindromeProduct479 jr = new LargestPalindromeProduct479();
        System.out.println(jr.constructRectangle(5)[0]);
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
