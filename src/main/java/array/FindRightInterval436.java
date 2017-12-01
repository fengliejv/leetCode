package array;

import java.util.TreeMap;

/**
 * Created by fengliejv on 2017/11/30.
 */

public class FindRightInterval436 {
    public int[] findRightInterval(Interval[] intervals) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int[] res = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            map.put(intervals[i].start,i);
        }
        for (int i = 0; i < intervals.length; i++) {
            Integer key = map.ceilingKey(intervals[i].end);
            res[i]=key==null?-1:map.get(key);
        }
        return res;

    }
}
