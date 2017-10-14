package math;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengliejv on 2017/10/15.
 */
//note:integer to compare is supposed to use equals not ==
public class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else {
                map.put(a,1);
            }
            char b = t.charAt(i);
            if(map1.containsKey(b)){
                map1.put(b,map1.get(b)+1);
            }else {
                map1.put(b,1);
            }
        }
        for(Map.Entry entry :map.entrySet()){
            if(!map1.containsKey(entry.getKey())){
                System.out.println("no key: "+entry.getKey());
                return false;
            }else {
                if(!entry.getValue().equals(map1.get(entry.getKey()))){
                    System.out.println("value:"+entry.getKey()+ "  s: "+entry.getValue()+" t: "+map1.get(entry.getKey()));
                    return false;
                }
            }
        }
        return true;



    }
}
