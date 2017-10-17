package array;

import math.ListNode;

/**
 * Created by fengliejv on 2017/10/17.
 */
public class MergeTwoSortedLists21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null||l2==null){
            return l2==null?l1:l2;
        }

        while (l2!=null&&l2.val<l1.val){
            ListNode node1 = l1;
            ListNode node2 = l2.next;
            l1 =l2;
            l2.next=node1;
            l2 = node2;
        }
        ListNode header = l1;
        while (l2!=null){
            if(l1.next==null){
                l1.next=l2;
                break;
            }
            if(l1.next.val<l2.val){
                l1= l1.next;
            }else {
                ListNode node2 = l2.next;
                ListNode node = l1.next;
                l1.next=l2;
                l2.next= node;
                l2=node2;
            }
        }
        return header;
    }
}
