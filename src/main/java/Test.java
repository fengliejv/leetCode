/**
 * Created by fengliejv on 2017/9/11.
 */
import map.MaxAreaofIsland695;
import map.SurroundedRegions130;
import math.ListNode;
import math.PalindromeLinkedList234;
import math.ReverseLinkedList206;
import math.ReverseLinkedListII92;
import tree.*;
//import tree.Bit


public class Test {
    public static void main(String[] args) {
        int[][] grifd= new int[][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        int[] a = new int[]{3,5};
        ListNode node = new ListNode();
        ListNode n = node.init(a);

        //TreeNode node = TreeNode.createBinTree(new int[]{1,4,5,4,4,5});
        ReverseLinkedListII92 jr = new ReverseLinkedListII92();
        n = jr.reverseBetween(n,1,2);
                while (n!=null){
            System.out.println(n.val);
            n=n.next;
        }







    }



}
