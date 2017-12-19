package array;

/**
 * Created by fengliejv on 2017/12/19.
 */
public class MedianofTwoSortedArrays4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int[] ints = new int[l1+l2];
        int index1 =0;
        int index2 =0;
        int i=0;
        while (index1<l1||index2<l2){
            if(index1>=l1){
                ints[i++]=nums2[index2++];
            }else if(index2>=l2){
                ints[i++]=nums1[index1++];
            }else if(nums1[index1]>nums2[index2]){
                ints[i++]=nums2[index2++];
            }else {
                ints[i++]=nums1[index1++];
            }
        }
        if(ints.length%2==0){
            return (ints[ints.length/2-1]+ints[ints.length/2])*1.0/2.0;
        }else {
            return ints[ints.length/2];
        }
    }
}
