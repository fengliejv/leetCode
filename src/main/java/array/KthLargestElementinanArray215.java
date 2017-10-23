package array;

import java.util.Arrays;

/**
 * Created by fengliejv on 2017/10/23.
 */
public class KthLargestElementinanArray215 {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    //although this beats 78.55 i think this is not enough
    public int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
