package array;

/**
 * Created by fengliejv on 2017/10/30.
 */
public class LongestContinuousIncreasingSubsequence674 {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int length = 1;
        int max = 1;
        int pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>pre){
                length++;
            }else {
                if(length>max){
                    max=length;
                }
                length=1;
            }
            pre=nums[i];

        }
        if(length>max){
            max=length;
        }
        return max;
    }
}
