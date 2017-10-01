package array;

import java.util.HashMap;

/**
 * Created by fengliejv on 2017/10/2.
 */
public class NextGreaterElement496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums2.length; i++) {
            this.setMap(i,nums2,map);
        }
        int[] val = new int[nums1.length];
        for (int i = 0; i < nums1.length ; i++) {
            val[i]=map.get(nums1[i]);
        }
        return val;
    }

    private void setMap(int i,int[] nums2,HashMap map){
        if(i==nums2.length-1){
            map.put(nums2[i],-1);
            return;
        }
        for (int j = i+1; j <nums2.length ; j++) {
            if(nums2[i]<nums2[j]){
                map.put(nums2[i],nums2[j]);
                return;
            }
            if(j==nums2.length-1){
                map.put(nums2[i],-1);
            }
        }
    }
}
