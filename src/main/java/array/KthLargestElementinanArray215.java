package array;

import java.util.Arrays;

/**
 * Created by fengliejv on 2017/10/23.
 */
public class KthLargestElementinanArray215 {

// i think the way use partition is better
    public int findKthLargest(int[] nums, int k) {
        int low = 0;
        int high = nums.length-1;

        int pos = nums.length-k;
        int i ;
        while (true) {
             i = partition(low, high, nums);
            if(i==pos){
                break;
            }else if(i<pos){
                low=i+1;
            }else if(i>pos){
                high=i-1;
            }
        }
        return nums[pos];

    }
    private int partition(int low ,int high,int[] nums){
        if(low==high){
            return low;
        }
        int cmp = nums[low];
        int k = low;
        while (high>low) {
            while (high > low && nums[high] >= cmp) {
                high--;
            }
            int i = nums[high];
            nums[high] = nums[k];
            nums[k] = i;
            k=high;
            while ((low < high && nums[low] < cmp)) {
                low++;
            }
            i = nums[low];
            nums[low] = nums[k];
            nums[k] = i;
            k=low;
            if(low==high){
                break;
            }

        }

        return low;

    }


    //although this beats 78.55 i think this is not enough
    public int findKthLargest1(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
