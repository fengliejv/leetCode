package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fengliejv on 2018/8/28.
 */
public class UncommonWordsfromTwoSentences884 {
    public static void main(String[] args) {
        UncommonWordsfromTwoSentences884 uncommonWordsfromTwoSentences884 = new UncommonWordsfromTwoSentences884();
        String A = "this apple is sweet";
        String B = "this apple is sour";
        uncommonWordsfromTwoSentences884.uncommonFromSentences(A,B);
    }
    public String[] uncommonFromSentences(String A, String B) {
        Map<String,Integer> map = new HashMap<>();
        add(A,map);
        add(B,map);
        List<String> list = new ArrayList<>();
        for (Map.Entry<String,Integer> entry: map.entrySet()
             ) {
            if(entry.getValue()<2){
                list.add(entry.getKey());
            }
        }
        String[] results = new String[list.size()];
        for (int i = 0; i < results.length; i++) {
            results[i]= list.get(i);
        }
        return results;
    }
    private void add(String A,Map<String,Integer> map){
        String[] ss = A.split(" ");
        for (String s:ss
             ) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
    }
}
