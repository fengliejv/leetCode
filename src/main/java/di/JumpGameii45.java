package di;

public class JumpGameii45 {
    public int jump(int[] nums) {
        int[] steps = new int[nums.length];
        steps[0]=0;
        for (int i = 0; i < nums.length; i++) {
            int len = nums[i];
            for (int j = 1; j < len+1; j++) {
                if(i+j<nums.length&&steps[i+j]==0){
                    steps[i+j] = steps[i]+1;
                }
                if(i+j<nums.length&&steps[i+j]>steps[i]+1){
                    steps[i+j] = steps[i]+1;
                }
            }
        }
        return steps[nums.length-1];
    }
}
