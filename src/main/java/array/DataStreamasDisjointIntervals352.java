package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by fengliejv on 2017/11/30.
 */
public class DataStreamasDisjointIntervals352 {
    ArrayList<Integer> list = new ArrayList<>();



    public void addNum(int val) {
        list.add(val);
    }

    public List<Interval> getIntervals() {
        Collections.sort(list);
        List<Interval> strings = new ArrayList<>();
        if (list.size() == 0) {
            return strings;
        }
        int pre = list.get(0);
        Interval interval = new Interval();
        interval.start = pre;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) != pre&&list.get(i) !=pre + 1) {

                interval.end = pre;
                strings.add(new Interval(interval.start, interval.end));
                interval.start=list.get(i);

            }
            pre = list.get(i);
        }
        interval.end=pre;
        strings.add(new Interval(interval.start,interval.end));
        return strings;

    }
}
