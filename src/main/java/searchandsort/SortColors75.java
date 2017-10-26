package searchandsort;

/**
 * Created by fengliejv on 2017/10/24.
 */
public class SortColors75 {
    public void sortColors(int[] nums) {
        int begin = 0;
        int last = nums.length-1;
        for (int i = 0; i < last+1; i++) {
            while (i<last&&nums[i]==2){
                swap(nums,last--,i);
            }
            while (i>begin&&nums[i]==0){
                swap(nums,begin++,i);
            }

        }
    }
    private void swap(int[] nums,int a,int b){
        int c = nums[a];
        nums[a] = nums[b];
        nums[b] = c;
    }
}
