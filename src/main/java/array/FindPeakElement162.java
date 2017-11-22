package array;

/**
 * Created by fengliejv on 2017/11/22.
 */
public class FindPeakElement162 {
    public int findPeakElement(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i]>nums[i+1]&&nums[i]>nums[i-1]){
                return i;
            }
        }
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        return -1;
    }
}
