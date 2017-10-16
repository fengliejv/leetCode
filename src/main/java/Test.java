/**
 * Created by fengliejv on 2017/9/11.
 */
import array.ImageSmoother661;
import map.MaxAreaofIsland695;
import map.SurroundedRegions130;
import math.*;
import number.ExcelSheetColumnNumber171;
import number.ExcelSheetColumnTitle168;
import tree.*;
//import tree.Bit


public class Test {
    public static void main(String[] args) {
        int[][] grifd= new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        int[] a = new int[]{3,5};
        ListNode node = new ListNode();
        ListNode n = node.init(a);
        String s ="cbaebabacd";
        String t ="abc";
        //TreeNode node = TreeNode.createBinTree(new int[]{1,4,5,4,4,5});
        ImageSmoother661 jr = new ImageSmoother661();

        int[][] res = jr.imageSmoother(grifd);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]);
            }
            System.out.println();

        }









    }



}
