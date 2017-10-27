package map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengliejv on 2017/10/27.
 */
public class FindtheDifference389 {
    public char findTheDifference(String s, String t) {
        Map<Character,Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))){
                int count = map.get(t.charAt(i));
                if(count==1){
                    map.remove(t.charAt(i));
                }else {
                    map.put(t.charAt(i),count-1);
                }
            }else {
                return t.charAt(i);
            }
        }
        return ' ';
    }
}
