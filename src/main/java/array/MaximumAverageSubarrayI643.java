package array;

/**
 * Created by fengliejv on 2017/10/28.
 */
public class MaximumAverageSubarrayI643 {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length<k||k<1){
            return 0;
        }
        int max = 0;
        for (int i = 0; i < k; i++) {
            max = max+nums[i];
        }
        int sum = max;
        for (int i = k; i < nums.length; i++) {
            sum = sum+nums[i]-nums[i-k];
            if(sum>max){
                max=sum;
            }
        }
        return max/(double)k;
    }
}
