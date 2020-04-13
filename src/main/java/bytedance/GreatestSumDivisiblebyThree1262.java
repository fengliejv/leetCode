package bytedance;

/**
 * Created by fengliejv on 2020/4/13.
 */
public class GreatestSumDivisiblebyThree1262 {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        int min1 = 20000;
        int min2 = 20000;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] % 3 == 1) {
                min2 = Math.min(min2, nums[i] + min1);
                min1 = Math.min(min1, nums[i]);
            }
            if (nums[i] % 3 == 2) {
                min1 = Math.min(min1, nums[i] + min2);
                min2 = Math.min(min2, nums[i]);
            }
        }
        if (sum % 3 == 1 && min1 != 20000) {
            return sum - min1;
        }
        if (sum % 3 == 2 && min2 != 20000) {
            return sum - min2;
        }
        if (sum % 3 != 0) {
            return 0;
        }
        return sum;
    }
}
