package array;

/**
 * Created by fengliejv on 2017/10/10.
 */
public class ArrayPartitionI561 {
    public int arrayPairSum(int[] nums) {
        quicksort(nums);
        int sum=0;
        for(int i=0;i<nums.length-1;i=i+2){
            sum=sum+nums[i];
        }
        return sum;
    }
    private void quicksort(int nums[]){
        quicksort(nums,0,nums.length-1);
    }
    private void quicksort(int nums[],int begin ,int end){
        if(begin<end){
            int cmp = nums[begin];
            int i=begin;
            int j=end;
            while(i<j){
                while(nums[j]>cmp&&i<j)
                    j--;
                if(i<j){
                    int x=nums[i];
                    nums[i++]=nums[j];
                    nums[j]=x;
                }
                while(nums[i]<cmp&&i<j)
                    i++;
                if(i<j){
                    int x=nums[j];
                    nums[j--]=nums[i];
                    nums[i]=x;
                }
            }
            quicksort(nums,begin,j-1);
            quicksort(nums,j+1,end);
        }
    }
}
