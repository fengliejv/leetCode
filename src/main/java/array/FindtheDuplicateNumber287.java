package array;

/**
 * Created by fengliejv on 2017/11/17.
 */
public class FindtheDuplicateNumber287 {
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                int a = nums[i];
                nums[i]=nums[nums[i]];
                nums[a]=a;
            }
        }
        return 0;
    }
}
