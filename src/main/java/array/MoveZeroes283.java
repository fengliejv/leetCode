package array;

/**
 * Created by fengliejv on 2017/10/1.
 */
public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int sch = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[sch] = nums[i];
                sch++;
            }
        }
        for (int i=sch;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
