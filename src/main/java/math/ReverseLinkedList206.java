package math;

/**
 * Created by fengliejv on 2017/10/15.
 */
public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode pre = head;
        ListNode next = head.next;
        pre.next=null;

        while (next!=null){
            ListNode a = next.next;
            next.next=pre;
            pre=next;
            next = a;
        }
        return pre;
    }
}
