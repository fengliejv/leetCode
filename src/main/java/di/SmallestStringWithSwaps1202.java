package di;

import java.util.*;

/**
 * Created by fengliejv on 2020/4/11.
 */
public class SmallestStringWithSwaps1202 {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int[] unionMap = new int[s.length()];
        int[] height = new int[s.length()];
        intMap(unionMap, height);
        for (int i = 0; i < pairs.size(); i++) {
            List<Integer> pair = pairs.get(i);
            int a = pair.get(0);
            int b = pair.get(1);
            union(a, b, unionMap, height);
        }

        Map<Integer,PriorityQueue<Character>> queueMap = new HashMap<>();
        for (int i = 0; i <unionMap.length ; i++) {
            int a = find(unionMap[i],unionMap,height);

            if(queueMap.containsKey(a)){
                queueMap.get(a).offer(s.charAt(i));
            }else {
                PriorityQueue<Character> queue = new PriorityQueue<>(new Comparator<Character>() {
                    @Override
                    public int compare(Character o1, Character o2) {
                        return o2-o1;
                    }
                });
                queue.offer(s.charAt(i));
                queueMap.put(a,queue);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < unionMap.length; i++) {
            sb.append(queueMap.get(find(unionMap[i],unionMap,height)).poll());
        }
        return sb.toString();
    }




    private void union(int a, int b, int[] unionMap, int[] height) {
        int roota = find(a, unionMap, height);
        int rootb = find(b, unionMap, height);
        if (roota == rootb) {
            return;
        }
        if (roota > rootb) {
            unionMap[roota] = rootb;
        } else {
            unionMap[rootb] = roota;
        }
    }

    private int find(int a, int[] unionMap, int[] height) {
        int index = a;
        while (unionMap[index]!=index){
            index = unionMap[index];
        }
        return index;
    }

    private void intMap(int[] unionMap, int[] height) {
        for (int i = 0; i < height.length; i++) {
            height[i] = 1;
        }
        for (int i = 0; i < unionMap.length; i++) {
            unionMap[i] = i;
        }
    }
}

