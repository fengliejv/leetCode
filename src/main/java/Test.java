/**
 * Created by fengliejv on 2017/9/11.
 */
import map.MaxAreaofIsland695;
import map.SurroundedRegions130;
import math.*;
import tree.*;
//import tree.Bit


public class Test {
    public static void main(String[] args) {
        int[][] grifd= new int[][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        int[] a = new int[]{3,5};
        ListNode node = new ListNode();
        ListNode n = node.init(a);
        String s ="cbaebabacd";
        String t ="abc";
        //TreeNode node = TreeNode.createBinTree(new int[]{1,4,5,4,4,5});
        FindAllAnagramsinaString438 jr = new FindAllAnagramsinaString438();
        System.out.println(jr.findAnagrams(s,t));








    }



}
