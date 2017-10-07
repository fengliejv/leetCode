package di;

/**
 * Created by fengliejv on 2017/10/7.
 */
public class HouseRobberII213 {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        return Math.max(robs(nums,0,nums.length-2),robs(nums,1,nums.length-1));
    }

    public int robs(int[] nums,int start,int end) {
        int lenth =end-start+1;
        if(lenth==1){
            return nums[start];
        }
        int[] max = new int[lenth];
        max[0] = nums[start];
        max[1] = nums[start+1]>nums[start]?nums[start+1]:nums[start];
        for(int i=start+2;i<lenth+start;i++){
            int value = nums[i]+max[i-start-2];
            max[i-start] = max[i-start-1]<value?value:max[i-start-1];
        }
        return max[max.length-1]>max[max.length-2]?max[max.length-1]:max[max.length-2];
    }
}
