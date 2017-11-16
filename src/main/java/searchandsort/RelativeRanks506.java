package searchandsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by fengliejv on 2017/11/15.
 */
public class RelativeRanks506 {
    //todo use the partition
    public String[] findRelativeRanks(int[] nums) {
        Arrays.sort(nums);
        String[] strings = new String[nums.length];
        strings[0]= "Gold Medal";
        strings[1]= "Silver Medal";
        strings[2]= "Bronze Medal";
//        for (int i = nums.length-4; i >=0 ; i--) {
//            strings[strings.length-i-1] = String.valueOf(nums[i]);
//        }

        return strings;
    }


}
