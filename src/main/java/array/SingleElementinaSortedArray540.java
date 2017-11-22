package array;

/**
 * Created by fengliejv on 2017/11/22.
 */
public class SingleElementinaSortedArray540 {
    public int singleNonDuplicate(int[] nums) {
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            res^=nums[i];
        }
        return res;
    }
}
