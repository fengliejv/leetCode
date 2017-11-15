package array;

/**
 * Created by fengliejv on 2017/11/15.
 */
public class FindPivotIndex724 {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        if(nums.length==1){
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2 * pre + nums[i] == sum) {
                return i;
            }
            pre += nums[i];

        }
        return -1;


    }
//    public int pivotIndex(int[] nums) {
//        if(nums.length==0){
//            return -1;
//        }
//        int begin=0;
//        int end=nums.length-1;
//        int pre=0;
//        int last=0;
//        while (begin<end){
//            if(pre>last){
//                last+=nums[end--];
//            }else {
//                pre+=nums[begin++];
//            }
//        }
//
//        if(pre==last){
//            return begin;
//        }else {
//            return -1;
//        }
//    }
}
