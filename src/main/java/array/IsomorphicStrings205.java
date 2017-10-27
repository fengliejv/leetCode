package array;

import java.util.HashMap;

/**
 * Created by fengliejv on 2017/10/27.
 */
public class IsomorphicStrings205 {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        if(s.length()!= t.length())
            return false;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(!(map.get(c)==t.charAt(i)))
                    return false;
            }else{
                if(map.containsValue(t.charAt(i)))
                    return false;
                map.put(c, t.charAt(i));
            }
        }
        return true;

    }
}
