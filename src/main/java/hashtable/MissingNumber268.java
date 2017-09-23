package hashtable;

import java.util.HashMap;

/**
 * Created by fengliejv on 2017/9/23.
 */
public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for(int num : nums){
            hashMap.put(num,num);
        }
        for(int i=0;i<nums.length+1;i++){
            if(!hashMap.containsKey(i)){
                return i;
            }
        }
        return 0;
    }
}
