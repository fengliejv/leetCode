package array;

/**
 * Created by fengliejv on 2017/10/17.
 */
public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int index = m+n-1;
        while (index!=-1){
            int max;
            if(i<0){
                max = nums2[j--];
            }else
            if(j<0){
                max = nums1[i--];
            }else
            if(nums1[i]>nums2[j]){
                max= nums1[i];
                i--;
            }else {
                max= nums2[j];
                j--;
            }
            nums1[index--] = max;
        }
    }
}
