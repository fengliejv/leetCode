package number;

import java.util.Arrays;

public class ThreeSumClosest16 {
    public int threeSumClosest(int[] nums, int target){
        int result = nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int begin = i+1;
            int end = nums.length-1;
            while (begin<end){
                int sum = nums[i]+nums[begin]+nums[end];
                if(sum == target){
                    return target;
                }
                result = Math.abs(sum - target)<Math.abs(target-result)?sum:result;
                if(sum>target){
                    end--;
                }
                if(sum<target){
                    begin++;
                }
            }
        }

        return result;

    }

}
