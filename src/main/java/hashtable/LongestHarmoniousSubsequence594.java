package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengliejv on 2017/11/1.
 */
public class LongestHarmoniousSubsequence594 {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()
                ) {
            int value = entry.getKey();
            int big = Math.max(map.getOrDefault(value - 1, 0), map.getOrDefault(value + 1, 0));
            int sum;
            if (big == 0) {
                sum = 0;
            } else {
                sum = big + entry.getValue();
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
