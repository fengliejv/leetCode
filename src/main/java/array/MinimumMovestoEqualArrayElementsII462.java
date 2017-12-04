package array;

import java.util.Arrays;

/**
 * Created by fengliejv on 2017/12/4.
 */
public class MinimumMovestoEqualArrayElementsII462 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        int count =0;
        for (int a:nums
             ) {
            count+=Math.abs(a-mid);
        }
        return count;
    }
}
