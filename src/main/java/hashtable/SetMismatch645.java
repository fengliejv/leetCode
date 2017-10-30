package hashtable;

import java.util.HashMap;

/**
 * Created by fengliejv on 2017/10/30.
 */
public class SetMismatch645 {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                res[0] = nums[i];
            }
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(i+1)){
                res[1] =i+1;
                return res;
            }
        }

        return res;
    }

}
