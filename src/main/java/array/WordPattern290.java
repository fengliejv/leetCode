package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengliejv on 2017/10/27.
 */
public class WordPattern290 {
    public boolean wordPattern(String pattern, String str) {
        if(pattern.length()==0&&str.length()==0){
            return true;
        }
        if(pattern.length()==0||str.length()==0){
            return false;
        }
        String[] sttrings = str.split(" ");
        if(pattern.length()!=sttrings.length){
            return false;
        }
        Map<Character,String> map1 = new HashMap<>();
        Map<String,Character> map2 = new HashMap<>();
        for (int i = 0; i < sttrings.length; i++) {
            char c = pattern.charAt(i);
            String string = sttrings[i];
            if(!map1.containsKey(c)&&!map2.containsKey(string)){
                map1.put(c,string);
                map2.put(string,c);
            }else if(map1.containsKey(c)&&map2.containsKey(string)){
                if(!map1.get(c).equals(string)||!map2.get(string).equals(c)){
                    return false;
                }
            }else {
                return false;
            }
        }
        return true;
    }
}
