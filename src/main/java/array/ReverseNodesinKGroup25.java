package array;

/**
 * Created by fengliejv on 2018/10/18.
 */
public class ReverseNodesinKGroup25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        //指针节点
        ListNode listNode = head;
        //哨兵节点
        ListNode h = new ListNode(-1);
        h.next = head;
        //前面k个节点的尾部节点
        ListNode pre = h;
        while (listNode!=null){
            ListNode[] listNodes = new ListNode[k];
            //记录k个node
            for (int i = 0; i < k; i++) {
                if(listNode!=null){
                    listNodes[i]=listNode;
                    listNode=listNode.next;
                }else {
                    pre.next = listNodes[0];
                    //不满K个，直接返回
                    return h.next;
                }
            }
            //反转k个节点
            pre.next=listNodes[k-1];
            for (int i = k-1; i >0 ; i--) {
                listNodes[i].next=listNodes[i-1];
            }
            pre=listNodes[0];
            listNodes[0].next=null;
        }
        return h.next;
    }

    public static void main(String[] args) {
        ReverseNodesinKGroup25 reverseNodesinKGroup25 = new ReverseNodesinKGroup25();
        ListNode head = new ListNode(1);
        ListNode pre = head;
        for (int i =2; i < 6; i++) {
            pre.next=new ListNode(i);
            pre=pre.next;
        }
        ListNode h = reverseNodesinKGroup25.reverseKGroup(head,3);
        while (h!=null){
            System.out.println(h.val);
            h=h.next;
        }
    }
}
