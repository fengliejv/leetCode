package searchandsort;

/**
 * Created by fengliejv on 2017/10/24.
 */
public class WiggleSortII324 {
    public void wiggleSort(int[] nums) {
        int median = findKthLargest(nums, (nums.length + 1) / 2);
        int n = nums.length;

        int left = 0, i = 0, right = n - 1;

        while (i <= right) {

            if (nums[newIndex(i,n)] > median) {
                swap(nums, newIndex(left++,n), newIndex(i++,n));
            }
            else if (nums[newIndex(i,n)] < median) {
                swap(nums, newIndex(right--,n), newIndex(i,n));
            }
            else {
                i++;
            }
        }


    }
    private void swap(int[] nums,int a,int b){
        int i=nums[a];
        nums[a]=nums[b];
        nums[b]=i;
    }

    private int newIndex(int index, int n) {
        return (1 + 2*index) % (n | 1);
    }
    public int findKthLargest(int[] nums, int k) {
        int low = 0;
        int high = nums.length-1;

        int pos = nums.length-k;
        int i ;
        while (true) {
            i = partition(low, high, nums);
            if(i==pos){
                break;
            }else if(i<pos){
                low=i+1;
            }else if(i>pos){
                high=i-1;
            }
        }
        return nums[pos];

    }
    private int partition(int low ,int high,int[] nums){
        if(low==high){
            return low;
        }
        int cmp = nums[low];
        int k = low;
        while (high>low) {
            while (high > low && nums[high] >= cmp) {
                high--;
            }
            int i = nums[high];
            nums[high] = nums[k];
            nums[k] = i;
            k=high;
            while ((low < high && nums[low] < cmp)) {
                low++;
            }
            i = nums[low];
            nums[low] = nums[k];
            nums[k] = i;
            k=low;
            if(low==high){
                break;
            }

        }

        return low;

    }
}
