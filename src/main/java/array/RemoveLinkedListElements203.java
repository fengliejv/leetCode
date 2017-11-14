package array;

import math.ListNode;

/**
 * Created by fengliejv on 2017/11/14.
 */
public class RemoveLinkedListElements203 {
    public ListNode removeElements(ListNode head, int val) {
        while (head!=null&&head.val==val){
            head=head.next;
        }
        if(head==null){
            return head;
        }
        ListNode node = head;
        while (node.next!=null){
            if(node.next.val==val){
                node.next=node.next.next;
                continue;
            }
            node=node.next;
        }
        return head;


    }
}
