package greedy;

import java.util.*;

/**
 * Created by fengliejv on 2018/3/15.
 */
public class PartitionLabels763 {
    public List<Integer> partitionLabels(String S) {
        Map<Character, Lenth> map = new HashMap();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (map.containsKey(c)) {
                map.get(c).end = i;
            } else {
                map.put(c, new Lenth(i, -1));
            }
        }
        List<Lenth> lenths = new ArrayList<>();
        for (Lenth lenth : map.values()
                ) {
            lenths.add(lenth);
        }
        Collections.sort(lenths, new Comparator<Lenth>() {
            @Override
            public int compare(Lenth o1, Lenth o2) {
                return o1.begin - o2.begin;
            }
        });
        List<Integer> result = new ArrayList<>();
        int begin = lenths.get(0).begin;
        int end = (lenths.get(0).end == -1 ? begin : lenths.get(0).end);
        for (int i = 1; i < lenths.size(); i++) {
            Lenth lenth = lenths.get(i);
            if (lenth.begin < end) {
                if (lenth.end > end) {
                    end = lenth.end;
                }
            } else {
                result.add(end - begin + 1);
                begin = lenth.begin;
                end = (lenth.end == -1 ? begin : lenth.end);
            }
        }
        result.add(end - begin + 1);
        return result;
    }

    class Lenth {
        int begin;
        int end;

        public Lenth(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }
    }
}
