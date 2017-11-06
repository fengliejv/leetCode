/**
 * Created by fengliejv on 2017/9/11.
 */
import array.ImageSmoother661;
import array.KthLargestElementinanArray215;
import array.MaximumAverageSubarrayI643;
import array.PascalsTriangleII119;
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
//        int[] a = new int[]{1,12,-5,-6,50,3};
//        int[] b = new int[]{-1,2,0};
//        int[] c = new int[]{4,3,2,1};
//        int num  =2126753390;
//        ListNode node = new ListNode();
//        ListNode n = node.init(a);
//        String s ="cbaebabacd";
//        String t ="abc";
        TreeNode node = TreeNode.createBinTree(new int[]{1,0,2});
        TrimaBinarySearchTree669 jr = new TrimaBinarySearchTree669();
        TreeNode treeNode =jr.trimBST(node,1,2);
        printTree(treeNode);

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
