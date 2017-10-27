package array;

/**
 * Created by fengliejv on 2017/10/27.
 */
//it is easy to solution,and easy to reduce the arr instance
public class ProductofArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] end = new int[nums.length];
        int[] result = new int[nums.length];
        pre[0]=1;
        end[nums.length-1] = 1;
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i-1]*nums[i-1];
        }
        for (int i = nums.length-2; i >-1 ; i--) {
            end[i] = end[i+1]*nums[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = pre[i]*end[i];
        }
        return result;
    }
}
