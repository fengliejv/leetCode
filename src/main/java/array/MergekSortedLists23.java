package array;

import math.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by fengliejv on 2018/1/4.
 */
public class MergekSortedLists23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ListNode head = new ListNode(0);
        ListNode node = head;
        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });
        for (int i = 0; i < lists.length; i++) {
            if(lists[i]!=null){
                priorityQueue.offer(lists[i]);
            }
        }
        while (priorityQueue.size()!=0){
            ListNode n = priorityQueue.poll();
            if(n.next!=null){
                priorityQueue.offer(n.next);
            }
            node.next=n;
            node=node.next;

        }
        return head.next;
    }
}
