package array;

import java.util.ArrayList;

/**
 * Created by fengliejv on 2017/10/1.
 */

public class MaximumProductSubarray152 {
    //    public int maxProduct(int[] nums) {
//        if (nums.length == 0) {
//            return 0;
//        }
//        int max = nums[0];
//        int min = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[i]<0){
//                int a = max;
//                max = min;
//                min = a ;
//            }
//            min = min<min*nums[i]?nums[i]:min*nums[i];
//            max = max<max*nums[i]?max*nums[i]:nums[i];
//        }
//        return max;
//    }
    public int maxProduct(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxAll = nums[0];
        int max = nums[0];
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int a = max;
                max = min;
                min = a;
            }
            max = nums[i]>max*nums[i]?nums[i]:max*nums[i];
            min = nums[i]<min*nums[i]?nums[i]:min*nums[i];
            maxAll=maxAll>max?maxAll:max;
        }

        return maxAll;
    }
}
