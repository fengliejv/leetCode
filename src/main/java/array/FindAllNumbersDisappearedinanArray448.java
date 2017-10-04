package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengliejv on 2017/10/4.
 */
public class FindAllNumbersDisappearedinanArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i]!=i+1){
                int index = nums[i]-1;
                if(nums[index]==index+1){
                    break;
                }
                nums[i] = nums[index];
                nums[index] = index+1;
            }
        }
        ArrayList list  = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                list.add(i+1);
            }
        }
        return list;
    }
}
