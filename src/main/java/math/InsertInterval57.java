package math;

import array.Interval;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by fengliejv on 2018/1/4.
 */
public class InsertInterval57 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if(intervals==null||intervals.size()==0){
            return Arrays.asList(newInterval);
        }
        if(newInterval==null){
            return intervals;
        }
        intervals.add(newInterval);
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        if (intervals.size() == 0 || intervals.size() == 1) {
            return intervals;
        }

        for (int i = 1; i < intervals.size(); i++) {
            int start2 = intervals.get(i).start;
            int end1 = intervals.get(i - 1).end;
            int end2 = intervals.get(i).end;
            if(start2<=end1){
                if(end2>end1){
                    intervals.get(i-1).end=end2;
                }
                intervals.remove(i);
                i--;
            }

        }
        return intervals;
    }
}
