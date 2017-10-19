package array;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by fengliejv on 2017/10/19.
 */
public class ThirdMaximumNumber414 {
    public int thirdMax(int[] nums) {
        Integer max = nums[0];
        Integer mid = null;
        Integer min = null;

        for (int i = 1; i < nums.length; i++) {
            if (max == null || nums[i] > max) {
                min = mid;
                mid = max;
                max = nums[i];

            } else if (mid == null || nums[i] > mid) {
                if (nums[i] == max) {
                    continue;
                }
                min = mid;
                mid = nums[i];

            } else if (min == null || nums[i] > min) {
                if (nums[i] == mid) {
                    continue;
                }
                min = nums[i];


            }
        }
        return min == null ? max : min;

    }


    //this method is too slow
    public int thirdMax2(int[] nums) {
        TreeSet<Integer> set = new TreeSet();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        Iterator it = set.descendingIterator();
        int n = 2;
        int res = 0;
        int max = (int) it.next();
        while (it.hasNext() && n > 0) {
            res = (int) it.next();
            n--;
        }
        if (n != 0) {
            return max;
        }

        return res;
    }
}
