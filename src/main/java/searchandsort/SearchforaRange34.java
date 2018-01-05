package searchandsort;

/**
 * Created by fengliejv on 2018/1/5.
 */
public class SearchforaRange34 {
    public int[] searchRange(int[] A, int target) {
        int start = SearchforaRange34.firstGreaterEqual(A, target);
        if (start == A.length || A[start] != target) {
            return new int[]{-1, -1};
        }
        return new int[]{start, SearchforaRange34.firstGreaterEqual(A, target + 1) - 1};
    }

    //find the first number that is greater than or equal to target.
    //could return A.length if target is greater than A[A.length-1].
    //actually this is the same as lower_bound in C++ STL.
    private static int firstGreaterEqual(int[] A, int target) {
        int low = 0, high = A.length;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            //low <= mid < high
            if (A[mid] < target) {
                low = mid + 1;
            } else {
                //should not be mid-1 when A[mid]==target.
                //could be mid even if A[mid]>target because mid<high.
                high = mid;
            }
        }
        return low;
    }
    public int[] searchRange1(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target){
                return new int[]{0,0};
            }else {
                return new int[]{-1,-1};
            }
        }
        int begin ;
        int end ;

        int midIndex = getTarget(nums,target);
        if(midIndex==-1){
            return new int[]{-1,-1};
        }
        System.out.println(midIndex);
        begin = getBegin(nums,midIndex,target);
        System.out.println(begin);
        end = getEnd(nums,midIndex,target);
        System.out.println(end);
        return new int[]{begin,end};
    }

    private int getEnd(int[] nums,int mid ,int target){
        if(nums[nums.length-1]==target){
            return nums.length-1;
        }
        int end = nums.length-2;
        while (mid<=end){
            if(mid+1==end){
                return nums[end]==target?end:mid;
            }
            int m = (end+mid)/2;
            if(nums[m]==target&&nums[m+1]!=target){
                return m;
            }else if(nums[m+1]==target){
                mid=m;
            }else {
                end=m;
            }
        }
        return 0;
    }


    private int getBegin(int[] nums,int mid ,int target){
        if(nums[0]==target){
            return 0;
        }
        int begin = 1;
        while (begin<=mid){
            if(begin+1==mid){
                return nums[begin]==target?begin:mid;
            }
            int m = (begin+mid)/2;
            if(nums[m]==target&&nums[m-1]!=target){
                return m;
            }else if(nums[m-1]==target){
                mid=m;
            }else {
                begin=m;
            }
        }
        return 0;
    }

    private int getTarget(int[] nums,int target){
        int begin =0;
        int end = nums.length-1;
        int mid = -1;
        while (begin<end){
            if(begin+1==end){
                if(nums[begin]==target){
                    return begin;
                }else if(nums[end]==target){
                    return end;
                }else {
                    return -1;
                }
            }
            mid = (begin+end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                end=mid;
            }else {
                begin=mid;
            }
        }
        return mid;
    }
}
