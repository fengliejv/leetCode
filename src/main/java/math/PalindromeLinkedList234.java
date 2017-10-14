package math;

/**
 * Created by fengliejv on 2017/10/3.
 */
//todo
public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }

        ListNode quick = head;
        ListNode slow = head;

        while (quick!=null&&quick.next!=null){
            quick = quick.next.next;
            slow = slow.next;
        }
        if(quick!=null){
            slow=slow.next;
        }
        ListNode next = slow.next;
        slow.next=null;
        while (next!=null){
            ListNode a = next.next;
            next.next=slow;
            slow=next;
            next=a;
        }
        ListNode h = head;
        while (slow!=null){
            if(slow.val!=h.val){
                return false;
            }
            slow=slow.next;
            h=h.next;
        }
        return true;
    }
}
