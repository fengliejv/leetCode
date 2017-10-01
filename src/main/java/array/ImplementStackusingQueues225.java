package array;

import sun.misc.Queue;

import java.util.LinkedList;

/**
 * Created by fengliejv on 2017/10/1.
 */
public class ImplementStackusingQueues225 {
    //one Queue solution
    private LinkedList<Integer> q = new LinkedList<Integer>();

    // Push element x onto stack.
    public void push(int x) {
        q.add(x);
        for(int i = 1; i < q.size(); i ++) { //rotate the queue to make the tail be the head
            q.add(q.poll());
        }
    }

    // Removes the element on top of the stack.
    public void pop() {
        q.poll();
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }
}
