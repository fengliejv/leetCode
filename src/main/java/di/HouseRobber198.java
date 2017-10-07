package di;

/**
 * Created by fengliejv on 2017/10/7.
 */
public class HouseRobber198 {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int[] max = new int[nums.length];
        max[0] = nums[0];
        max[1] = nums[1]>nums[0]?nums[1]:nums[0];
        for(int i=2;i<nums.length;i++){
            int value = nums[i]+max[i-2];
            max[i] = max[i-1]<value?value:max[i-1];
        }
        return max[max.length-1]>max[max.length-2]?max[max.length-1]:max[max.length-2];
    }
}
