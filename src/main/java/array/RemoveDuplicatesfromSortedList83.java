package array;

import math.ListNode;

/**
 * Created by fengliejv on 2017/12/22.
 */
public class RemoveDuplicatesfromSortedList83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        if(head==null){
            return head;
        }
        int pre=head.val;
        while (node!=null&&node.next!=null){
            if(node.next.val==pre){
                if(node.next.next!=null){
                    node.next=node.next.next;
                }else {
                    node.next=null;
                    return head;
                }

            }else {
                pre=node.next.val;
                node=node.next;
            }
        }

        return head;
    }
}
