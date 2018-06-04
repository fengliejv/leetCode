package array;

import java.util.TreeSet;

/**
 * Created by fengliejv on 2018/6/4.
 */
public class FirstMissingPositive41 {
    public int firstMissingPositive(int[] nums) {
        TreeSet treeSet = new TreeSet();
        if(nums==null||nums.length==0){
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<=0){
                continue;
            }
            treeSet.add(nums[i]);
        }

        for (int i = 1; i <= treeSet.size(); i++) {
            if(!treeSet.contains(i)){
                return i;
            }
        }
        return treeSet.size()+1;
    }
}
