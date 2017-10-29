package array;

/**
 * Created by fengliejv on 2017/10/28.
 */
public class NondecreasingArray665 {
    public boolean checkPossibility(int[] nums) {
        if (nums.length < 2) {
            return true;
        }
        boolean flag = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (flag) {
                    if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                        nums[i] = nums[i - 1];
                    } else {
                        nums[i - 1] = nums[i];
                    }

                    flag = false;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
