package map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengliejv on 2017/10/28.
 */
public class FirstUniqueCharacterinaString387 {
    public int firstUniqChar(String s) {
        if(s.length()==0){
            return -1;
        }
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i = 0; i < s.length(); i++) {
            int count = map.get(s.charAt(i));
            if(count==1){
                return i;
            }
        }
        return -1;
    }
}
