package math;

/**
 * Created by fengliejv on 2017/10/15.
 */
public class ReverseLinkedListII92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode begin = head;
        ListNode pre;
        int count = n - m;
        if (count == 0) {
            return head;
        }
        while (m > 2) {
            begin = begin.next;
            m--;
        }
        if (m == 1) {
            pre = begin;
        } else {
            pre = begin.next;
        }
        ListNode last = pre;
        ListNode next = pre.next;
        while (count > 0) {
            count--;
            ListNode a = next.next;
            next.next = pre;
            pre = next;
            next = a;
        }
        last.next = next;

        if (m != 1)
            begin.next = pre;
        else
            return pre;
        return head;

    }
}
