package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by fengliejv on 2017/10/16.
 */
public class MajorityElementII229 {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        if(nums.length==0){
            return list;
        }
        int count = nums.length/3;
        for (int i = 0; i < nums.length; i++) {
            int cal;
            if(map.containsKey(nums[i])){
                cal = map.get(nums[i]);
                cal++;

            }else {
                 cal =1;

            }
            if(cal>count){
                cal=Integer.MIN_VALUE;
                list.add(nums[i]);
            }
            map.put(nums[i],cal);
        }
        return list;
    }
}
