package math;

/**
 * Created by fengliejv on 2017/11/2.
 */
public class MinimumMovestoEqualArrayElements453 {
    public int minMoves(int[] nums) {
        int sum = 0;
        int min = nums[0];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i]<min){
                min=nums[i];
            }
            sum+=nums[i];
        }
        return sum-n*min;
    }
}
