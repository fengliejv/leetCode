package array;

import java.util.HashSet;

/**
 * Created by fengliejv on 2017/10/2.
 */
public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}
