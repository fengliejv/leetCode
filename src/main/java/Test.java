/**
 * Created by fengliejv on 2017/9/11.
 */
import array.ImageSmoother661;
import array.KthLargestElementinanArray215;
import array.PascalsTriangleII119;
import map.MaxAreaofIsland695;
import map.SurroundedRegions130;
import math.*;
import number.ExcelSheetColumnNumber171;
import number.ExcelSheetColumnTitle168;
import string.RepeatedStringMatch686;
import tree.*;
//import tree.Bit


public class Test {
    public static void main(String[] args) {
        int[][] grifd= new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        int[] a = new int[]{5,2,4,1,3,6,0,2};
        int[] b = new int[]{-1,2,0};
        int[] c = new int[]{4,3,2,1};

        ListNode node = new ListNode();
        ListNode n = node.init(a);
        String s ="cbaebabacd";
        String t ="abc";
        //TreeNode node = TreeNode.createBinTree(new int[]{1,4,5,4,4,5});
        KthLargestElementinanArray215 jr = new KthLargestElementinanArray215();
        System.out.println(jr.findKthLargest(a,2));
        System.out.println(jr.findKthLargest(a,1));
        System.out.println(jr.findKthLargest(a,8));
        System.out.println(jr.findKthLargest(b,1));
        System.out.println(jr.findKthLargest(c,3));











    }



}
