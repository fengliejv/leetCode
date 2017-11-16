package math;

import java.util.Stack;

/**
 * Created by fengliejv on 2017/11/16.
 */
public class MinStack155 {
    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<>();
    public MinStack155() {
    }

    public void push(int x) {
        if(x<min)
            min=x;
        stack.push(x);
    }

    public void pop() {
        int v = stack.pop();
        if(v==min){
            min=findMin();
        }
    }
    private int findMin(){
        int m = Integer.MAX_VALUE;
        Stack<Integer> s = new Stack<>();
        while (!stack.empty()){
            if(m>stack.peek()){
                m=stack.peek();
            }
            s.push(stack.pop());
        }

        while (!s.empty()){
            stack.push(s.pop());
        }
        return m;
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
