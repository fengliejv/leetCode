package array;

/**
 * Created by fengliejv on 2017/10/1.
 */
public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] maxList = new int[nums.length];
        maxList[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            int val1 = nums[i]+maxList[i-1];
            maxList[i] = val1>nums[i]?val1:nums[i];
        }
        int max =maxList[0];
        for (int i = 1; i <maxList.length ; i++) {
            if(maxList[i]>max){
                max=maxList[i];
            }
        }
        return max;
    }

}
