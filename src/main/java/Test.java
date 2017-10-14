/**
 * Created by fengliejv on 2017/9/11.
 */
import map.MaxAreaofIsland695;
import map.SurroundedRegions130;
import math.ListNode;
import math.PalindromeLinkedList234;
import math.ReverseLinkedList206;
import tree.*;
//import tree.Bit


public class Test {
    public static void main(String[] args) {
        int[][] grifd= new int[][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        int[] a = new int[]{1,2,3};
        ListNode node = new ListNode();
        ListNode n = node.init(a);

        //TreeNode node = TreeNode.createBinTree(new int[]{1,4,5,4,4,5});
        ReverseLinkedList206 jr = new ReverseLinkedList206();
        n = jr.reverseList(n);
                while (n!=null){
            System.out.println(n.val);
            n=n.next;
        }







    }



}
