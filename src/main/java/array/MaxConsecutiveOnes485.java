package array;

/**
 * Created by fengliejv on 2017/10/16.
 */
public class MaxConsecutiveOnes485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count++;
            }else {
                max=max>count?max:count;
                count=0;
            }
        }
        max=max>count?max:count;
        return max;
    }
}
