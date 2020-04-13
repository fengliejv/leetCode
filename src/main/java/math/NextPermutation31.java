package math;

/**
 * Created by fengliejv on 2017/10/1.
 */
//todo
public class NextPermutation31 {
    public static void main(String[] args) {
        NextPermutation31 nextPermutation31 = new NextPermutation31();
        int[] nums = {1,3,2};
        nextPermutation31.nextPermutation(nums);
        for (int a: nums
             ) {
            System.out.print(a);
        }
    }

    public void nextPermutation(int[] nums) {
        if (nums.length < 2) {
            return;
        }
        int beginIndex = find(nums);


        sort(beginIndex, nums.length - 1, nums);
    }

    private void sort(int begin, int end, int[] nums) {
        if (begin >= end) {
            return;
        }
        int index = partition(begin, end, nums);
        sort(begin, index - 1, nums);
        sort(index + 1, end, nums);
    }

    private int partition(int begin, int end, int[] nums) {
        int index = end;
        while (begin < end) {
            while (nums[begin] <= nums[index] && begin <end) {
                begin++;
            }
            if(begin==end){
                return begin;
            }
            int tmp = nums[begin];
            nums[begin] = nums[index];
            nums[index] = tmp;
            index = begin;

            while (nums[end] > nums[index] && begin <end){
                end--;
            }
            if(begin==end){
                return begin;
            }
            tmp = nums[end];
            nums[end] = nums[index];
            nums[index] = tmp;
            index = end;
        }
        return index;
    }


    private int find(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                int n = findMinMax(nums[i-1],i,nums);

                int tmp = nums[n];
                nums[n] = nums[i - 1];
                nums[i - 1] = tmp;
                return i;
            }
        }
        return 0;
    }

    private int findMinMax(int num, int i, int[] nums) {
        int min = i;
        for (int j = i+1; j < nums.length ; j++) {
            if(nums[j]>num){
                continue;
            }
            return j-1;
        }
        return nums.length-1;
    }

}
