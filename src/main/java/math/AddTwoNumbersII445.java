package math;

import java.util.Stack;

/**
 * Created by fengliejv on 2017/11/13.
 */
public class AddTwoNumbersII445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while (l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        ListNode node = null;
        int sum = 0;
        while (!s1.empty()||!s2.empty()||sum!=0){
            int sum1 = s1.empty()?0:s1.pop();
            int sum2 = s2.empty()?0:s2.pop();
            sum += sum1+sum2;
            ListNode n = new ListNode(sum%10);
            n.next=node;
            node=n;
            sum/=10;
        }
        return node;
    }

//this is a way to solve the short list
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        long a = 0;
        int alenth = 0;
        long b = 0;
        int blenth = 0;
        ListNode la = l1;
        ListNode lb = l2;
        while (la != null) {
            alenth++;
            la = la.next;
        }
        while (lb != null) {
            blenth++;
            lb = lb.next;
        }
        while (l1 != null) {
            a = (long) (a + l1.val * Math.pow(10, --alenth));
            l1 = l1.next;
        }
        while (l2 != null) {
            b = (long) (b + l2.val * Math.pow(10, --blenth));
            l2 = l2.next;
        }
        long sum = a + b;
        if(sum==0){
            return new ListNode(0);
        }
        ListNode node = null;
        while (sum != 0) {
            int res = (int) (sum % 10);
            sum = sum / 10;
            ListNode pre = new ListNode(res);
            pre.next = node;
            node = pre;
        }
        return node;

    }

}
