package array;

import java.util.HashMap;

/**
 * Created by fengliejv on 2017/10/15.
 */
public class KdiffPairsinanArray532 {
    public int findPairs(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap();
        int count=0;
        if(k<0){
            return count;
        }
        if(k==0){
            HashMap<Integer,Integer> map2 = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                if(map.containsKey(nums[i])){
                    map2.put(nums[i],nums[i]);
                }
                map.put(nums[i],nums[i]);
            }
            count=map2.size();
        }else {
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], nums[i]);
            }

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(k + nums[i])) {
                    map.remove(k + nums[i]);
                    count++;
                }
            }
        }
        return count;
    }
}
