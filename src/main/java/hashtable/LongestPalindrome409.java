package hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengliejv on 2017/11/1.
 */
public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int sum =0;
        for (Map.Entry<Character,Integer> entry: map.entrySet()
                ) {
            int value = entry.getValue();
            if(value%2!=0){
                value--;
            }
            sum+=value;
        }
        if(sum<s.length()){
            sum++;
        }
        return sum;
    }
}
