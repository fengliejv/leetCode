package array;

/**
 * Created by fengliejv on 2018/6/4.
 */
public class LargestNumberAtLeastTwiceofOthers747 {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int second = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>second){
                second = nums[i];
                if(second>max){
                    int a = max;
                    max=second;
                    second=a;
                    index=i;
                }
            }
        }
        if(second*2<=max){

            return index;
        }else {
            return -1;
        }
    }
}
