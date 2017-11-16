package math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengliejv on 2017/11/16.
 */
public class BinaryWatch401 {
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h=0; h<12; h++)
            for (int m=0; m<60; m++)
                if (Integer.bitCount(h * 64 + m) == num)
                    times.add(String.format("%d:%02d", h, m));
        return times;
    }
}
