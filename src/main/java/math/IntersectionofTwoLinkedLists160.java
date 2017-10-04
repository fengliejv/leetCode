package math;

/**
 * Created by fengliejv on 2017/10/4.
 */
public class IntersectionofTwoLinkedLists160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        int lengthA = getLenth(headA);
        int lengthB = getLenth(headB);
        if(lengthA>lengthB){
            int res = lengthA-lengthB;
            while (res!=0){
                headA = headA.next;
                res--;
            }
        }else {
            int res = lengthB-lengthA;
            while (res!=0){
                headB = headB.next;
                res--;
            }
        }
        while (headA!=null) {
            if (headA.val == headB.val) {
                return headA;
            } else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }


    private int getLenth(ListNode node){
        int count=0;
        while (node.next!=null){
            node=node.next;
            count++;
        }
        return count;
    }
}
