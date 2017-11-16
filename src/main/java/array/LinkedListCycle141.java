package array;

import math.ListNode;

/**
 * Created by fengliejv on 2017/11/16.
 */
public class LinkedListCycle141 {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode slow = head;
        ListNode quick = head;
        while (quick!=null&&quick.next!=null){
            slow=slow.next;
            quick=quick.next.next;
            if(slow==quick){
                return true;
            }
        }
        return false;
    }
}
