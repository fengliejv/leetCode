package array;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by fengliejv on 2018/10/19.
 */
public class KthLargestElementinaStream703 {
    PriorityQueue<Integer> priorityQueue;
    int k;

    public KthLargestElementinaStream703(int k, int[] nums) {
        priorityQueue = new PriorityQueue<>(k);
        this.k = k;
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }

    public int add(int val) {
        if(priorityQueue.size()<k){
            priorityQueue.add(val);
        }else {
            int v = priorityQueue.peek();
            if(v<val){
                priorityQueue.poll();
                priorityQueue.add(val);
            }
        }
        return priorityQueue.peek();
    }

    public static void main(String[] args) {
        int k = 3;
        int[] s = new int[]{4, 5, 8, 2};

        KthLargestElementinaStream703 kthLargestElementinaStream703 = new KthLargestElementinaStream703(k, s);
        System.out.println(kthLargestElementinaStream703.add(3));
        System.out.println(kthLargestElementinaStream703.add(5));
        System.out.println(kthLargestElementinaStream703.add(10));
        System.out.println(kthLargestElementinaStream703.add(9));
        System.out.println(kthLargestElementinaStream703.add(4));


    }
}
