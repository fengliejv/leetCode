package String;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengliejv on 2017/9/17.
 */
public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ransomMap = new HashMap<Character, Integer>();
        HashMap<Character,Integer> magaMap = new HashMap<Character, Integer>();
        char[] char1 = ransomNote.toCharArray();
        char[] char2 = magazine.toCharArray();
        this.addMap(ransomMap,char1);
        this.addMap(magaMap,char2);
        for(Map.Entry<Character,Integer> entry:ransomMap.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            if(!magaMap.containsKey(key)){
                return false;
            }else {
                if(value>magaMap.get(key)){
                    return false;
                }
            }
        }
        return true;
    }

    private void addMap(HashMap<Character,Integer> map,char[] chars){
        for(char c : chars){
            if(map.containsKey(c)){
                int v = map.get(c);
                map.put(c,++v);
            }else {
                map.put(c,1);
            }
        }
    }
}
