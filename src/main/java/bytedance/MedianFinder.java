package bytedance;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by fengliejv on 2020/4/16.
 */
public class MedianFinder {
    //最小堆
    private PriorityQueue<Integer> upPriorityQueue;
    //最大堆
    private PriorityQueue<Integer> downPriorityQueue;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
         upPriorityQueue = new PriorityQueue<>();
         downPriorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
    }

    public void addNum(int num) {
        if (upPriorityQueue.size() == 0) {
            upPriorityQueue.add(num);
            return;
        }
        //值比最小堆大
        if (num > upPriorityQueue.peek()) {
            upPriorityQueue.add(num);
        } else {
            downPriorityQueue.add(num);
        }
        if(upPriorityQueue.size()-downPriorityQueue.size()>1){
            downPriorityQueue.add(upPriorityQueue.poll());
        }
        if(downPriorityQueue.size()>upPriorityQueue.size()){
            upPriorityQueue.add(downPriorityQueue.poll());
        }


    }

    public double findMedian() {
        if (upPriorityQueue.size() > downPriorityQueue.size()) {
            return upPriorityQueue.peek();
        }
        return upPriorityQueue.peek() / 2.0 + downPriorityQueue.peek() / 2.0;

    }
}
