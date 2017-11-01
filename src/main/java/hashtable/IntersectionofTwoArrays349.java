package hashtable;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fengliejv on 2017/11/1.
 */
public class IntersectionofTwoArrays349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(set.contains(nums2[i])){
                result.add(nums2[i]);
            }
        }
        int[] res = new int[result.size()];
        int i =0;
        for (int j:result
                ) {
            res[i++] = j;
        }
        return res;
    }
}
