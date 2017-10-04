package array;

import java.util.*;

/**
 * Created by fengliejv on 2017/10/4.
 */
public class FindAllDuplicatesinanArray442 {
    public List<Integer> findDuplicates(int[] nums) {
        if(nums.length<2){
            return new ArrayList<Integer>();
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i <nums.length ; i++) {
            while(nums[i]!=i+1){
                int index = nums[i]-1;//where num[i] should be

                int val = nums[index];//save the orgin val
                if(val!=index+1) {
                    nums[index] = nums[i];
                    nums[i] = val;
                }else {
                        set.add(val);
                    break;
                }
            }
        }
        Iterator it = set.iterator();
        ArrayList list = new ArrayList();
        while (it.hasNext()){
            list.add(it.next());
        }
        return list;
    }
}
