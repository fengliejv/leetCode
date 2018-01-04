package math;

import array.Interval;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by fengliejv on 2018/1/4.
 */
public class MergeIntervals56 {
    public List<Interval> merge(List<Interval> intervals) {
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
        int start1 = intervals.get(i - 1).start;
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
