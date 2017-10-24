package searchandsort;

/**
 * Created by fengliejv on 2017/10/19.
 */
public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==0){
            return 0;
        }
        return binary(nums, 0, nums.length - 1, target);
    }

    private int binary(int[] nums, int begin, int end, int target) {
        int mid = begin + (end - begin) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (mid>end||mid==end) {
            if (nums[mid] > target) {
                return mid;
            } else {
                return mid + 1;
            }
        }
        if (nums[mid] < target) {
            return binary(nums, mid+1,end,target );
        }else {
            return binary(nums,begin,mid-1,target);
        }
    }
}
