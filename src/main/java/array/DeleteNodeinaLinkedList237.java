package array;

import math.ListNode;

/**
 * Created by fengliejv on 2017/12/22.
 */
public class DeleteNodeinaLinkedList237 {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}
