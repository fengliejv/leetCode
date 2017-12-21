package array;

import java.util.*;

/**
 * Created by fengliejv on 2017/12/21.
 */
public class TopKFrequentElements347 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Queue<Map.Entry<Integer,Integer>> pri = new PriorityQueue<Map.Entry<Integer,Integer>>(new Comparator<Map.Entry<Integer,Integer>>() {
            @Override
            public int compare(Map.Entry<Integer,Integer> o1, Map.Entry<Integer,Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (Map.Entry<Integer,Integer> v:map.entrySet()
                ) {
            pri.add(v);
        }
        List<Integer> res = new ArrayList<>();
        while (k--!=0){
            res.add(pri.poll().getKey());
        }
        return res;
    }
}
