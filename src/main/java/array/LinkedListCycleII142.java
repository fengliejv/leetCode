package array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fengliejv on 2018/10/18.
 */

public class LinkedListCycleII142 {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while (head!=null){
            if(nodeSet.contains(head)){
               return head;
            }else {
                nodeSet.add(head);
                head=head.next;
            }
        }
        return null;
    }
}

//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//        next = null;
//    }
//}