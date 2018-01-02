package array;

import math.ListNode;

/**
 * Created by fengliejv on 2018/1/2.
 */
public class SwapNodesinPairs24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode h = head.next;
        head.next = h.next;
        h.next=head;
        head = h;
        ListNode pre = head.next;
        ListNode node = head.next.next;
        while (node != null && node.next != null) {
            ListNode n1 = node;
            ListNode n2 = node.next;
            n1.next = n2.next;
            n2.next = node;
            pre.next=n2;
            node = node.next;
            pre=pre.next.next;
        }
        return head;
    }
}
