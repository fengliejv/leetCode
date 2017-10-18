package array;

import java.util.HashMap;

/**
 * Created by fengliejv on 2017/10/17.
 */

public class SubarraySumEqualsK560 {



    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if (map.containsKey(sum-k)) {
                count = count + map.get(sum - k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return count;
    }
}
