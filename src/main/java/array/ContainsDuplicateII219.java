package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by fengliejv on 2017/10/2.
 */

public class ContainsDuplicateII219 {
    //if use ArrayList ,will time out ,because of the binary searchandsort in it
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k==0||nums.length==0){
            return false;
        }
        //ArrayList arrayList = new ArrayList();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(i>k){
                set.remove(nums[i-k-1]);
            }
            if(set.contains(nums[i])){
                return true;
            }else {
                set.add(nums[i]);
            }
        }
        return false;

    }
}
