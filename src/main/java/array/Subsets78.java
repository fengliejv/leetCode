package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by fengliejv on 2017/11/22.
 */
public class Subsets78 {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        sub(nums,0,new ArrayList());
        return lists;
    }

    private void sub(int[] nums,int start,List list){
        lists.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            sub(nums,i+1,list);
            list.remove(list.size()-1);
        }
    }
}
