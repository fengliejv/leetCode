package array;

/**
 * Created by fengliejv on 2017/10/1.
 */
public class RotateArray189 {
    public void rotate(int[] nums, int k) {
        reverse(nums,0,nums.length-1);
        if(k>nums.length){
            k = k%nums.length;
        }
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private void reverse(int[] nums ,int start ,int end){
        int c ;
        while (start<end){
            c=nums[start];
            nums[start] = nums[end];
            nums[end] = c;
            start++;
            end--;
        }
    }
}
