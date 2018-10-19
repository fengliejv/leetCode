package array;

import java.util.*;

/**
 * Created by fengliejv on 2018/10/19.
 */
public class SlidingWindowMaximum239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length<=1||k<2){
            return nums;
        }
        int[] result = new int[nums.length-k+1];
        Deque<Integer> queue = new ArrayDeque();
        for (int i = 0; i < nums.length; i++) {
            while (queue.size()>0&&queue.peek()<i-k+1){
                queue.poll();
            }
            while (queue.size()>0&&nums[queue.peekLast()]<nums[i]){
                queue.pollLast();
            }
            queue.offer(i);
            if(i>=k-1){
                result[i-k+1] = nums[queue.peek()];
            }
        }
        return result;
    }


    public static void main(String[] args) {
        SlidingWindowMaximum239 slidingWindowMaximum239 = new SlidingWindowMaximum239();
        int[] result = slidingWindowMaximum239.maxSlidingWindow(new int[]{7,2,4},2);
        for (int a:result
             ) {
            System.out.println(a);
        }
    }

}
