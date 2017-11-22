package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by fengliejv on 2017/11/22.
 */
public class SubsetsII90 {
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        sub(nums, 0, new ArrayList());
        return lists;
    }

    private void sub(int[] nums, int start, List list) {
        lists.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            if (i != start && nums[i] == nums[i-1]) {
                continue;
            }
            list.add(nums[i]);
            sub(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
