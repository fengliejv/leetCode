package map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by fengliejv on 2017/10/27.
 */
public class SingleNumber136 {
    public int singleNumber(int[] nums) {
        Set set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else {
                set.remove(nums[i]);
            }
        }
        Iterator iterator = set.iterator();

        return (int) iterator.next();
    }
}
