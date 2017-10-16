package array;

import java.util.Arrays;

/**
 * Created by fengliejv on 2017/10/16.
 */
public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
