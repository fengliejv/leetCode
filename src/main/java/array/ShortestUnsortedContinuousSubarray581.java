package array;

/**
 * Created by fengliejv on 2017/10/29.
 */
public class ShortestUnsortedContinuousSubarray581 {
    public int findUnsortedSubarray(int[] nums) {
        int end = 0;
        int begin = nums.length-1;
        int num = nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]<num){
                end=i;
            }else {
                num = nums[i];
            }
        }
        num=nums[nums.length-1];
        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i]>num){
                begin = i;
            }else {
                num=nums[i];
            }
        }
        
        return  end>begin?end-begin+1:0;
    }
}
