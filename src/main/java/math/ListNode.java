package math;

/**
 * Created by fengliejv on 2017/10/3.
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(){}

    public ListNode(int x) {
        val = x;
    }

    public ListNode init(int[] arr) {
        int len = arr.length;
        if(len==0){
            System.out.println("ERROR");
        }
        ListNode pre;
        ListNode last;
        pre = new ListNode(arr[0]);
        last = pre;
        for (int i = 1; i < len; i++) {
            ListNode node = new ListNode(arr[i]);
            last.next = node;
            last = node;
        }
        return pre;
    }
}
