package array;

/**
 * Created by fengliejv on 2017/12/22.
 */
public class RangeSumQueryImmutable303 {
    int[] dp;
    int[] num;
    public RangeSumQueryImmutable303(int[] nums) {
        this.num=nums;
        dp = new int[nums.length];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            dp[i] = sum;
        }
    }

    public int sumRange(int i, int j) {
        return dp[j]-dp[i]+num[i];
    }
}
