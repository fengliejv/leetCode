package string;

import java.util.*;

/**
 * Created by fengliejv on 2018/1/2.
 */
public class TopKFrequentWords692 {
    public List<String> topKFrequent(String[] words, int k) {
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> priorityQueue = new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if (o1.getValue() == o2.getValue()) {
                    return cmp(o1.getKey(),o2.getKey());
                } else {
                    return o2.getValue()-o1.getValue();
                }
            }
        });
        priorityQueue.addAll(map.entrySet());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list.add(priorityQueue.poll().getKey());
        }
        return list;
    }


    int cmp(String s1 ,String s2){
        for (int i = 0; i < Math.min(s1.length(),s2.length()); i++) {
            if(s1.charAt(i)==s2.charAt(i)){
                continue;
            }else {
                return s1.charAt(i)-s2.charAt(i);
            }
        }
        return s1.length() - s2.length();
    }
}
