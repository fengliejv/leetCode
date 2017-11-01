package hashtable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by fengliejv on 2017/11/1.
 */
public class IntersectionofTwoArraysII350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i])){
                arrayList.add(nums2[i]);
                int sum = map.get(nums2[i]);
                if(sum==1){
                    map.remove(nums2[i]);
                }else {
                    map.put(nums2[i],sum-1);
                }
            }
        }
        int[] res = new int[arrayList.size()];
        int i=0;
        for (int a:arrayList
                ) {
            res[i++]=a;
        }
        return res;

    }
}
