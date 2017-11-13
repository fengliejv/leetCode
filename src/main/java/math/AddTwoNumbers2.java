package math;

/**
 * Created by fengliejv on 2017/11/13.
 */
public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l2==null){
            return l1;
        }
        if(l1==null){
            return l2;
        }

        add(l1,l2,0);
        return l1;

    }
    private void add(ListNode l1,ListNode l2,int carry){
        if(l2==null){
            if(carry==0) {
                return;
            }else {
                l2 = new ListNode(1);
                carry=0;
            }
        }

        int sum = l1.val+l2.val+carry;
        if(sum>9){
            sum = sum-10;
            carry=1;
        }else {
            carry=0;
        }
        l1.val=sum;

        if(l1.next==null){
            if(carry==0){
                l1.next = l2.next;
                return;
            }else {
                l1.next = new ListNode(1);
                carry=0;
            }
        }
        add(l1.next,l2.next,carry);

    }
}
