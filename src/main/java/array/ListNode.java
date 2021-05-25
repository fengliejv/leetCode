package array;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {
    }
    public ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode(int i, ListNode head) {
        val = i;
        next = head;
    }
}
