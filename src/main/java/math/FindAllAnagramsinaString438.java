package math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fengliejv on 2017/10/15.
 */
public class FindAllAnagramsinaString438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if(s.length()==0){
            return list;
        }

        for(int i=0;i<s.length()-p.length()+1;i++){
            if(isAnagram(s.substring(i,i+p.length()),p)){
                list.add(i);
            }
        }
        return list;
    }


    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}
