package array;

import java.util.Stack;

/**
 * Created by fengliejv on 2017/10/1.
 */
//todo
public class ImplementQueueusingStacks232 {

    Stack<Integer> pushstack = new Stack();
    Stack<Integer> popstack = new Stack();
    /**
     * Initialize your data structure here.
     */
    public ImplementQueueusingStacks232() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        pushstack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if(popstack.empty()){
            this.init();
        }
        return  popstack.pop();
    }

    private void init(){
        while (!pushstack.empty()){
            popstack.push(pushstack.pop());
        }
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if(popstack.empty()){
            this.init();
        }
        return  popstack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return pushstack.empty()&&popstack.empty();
    }

}
