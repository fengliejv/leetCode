package string;

import java.util.HashMap;

/**
 * Created by fengliejv on 2017/10/10.
 */
public class LongestSubstringWithoutRepeatingCharacters3 {
    public int lengthOfLongestSubstring(String s) {
        char[] inputs = s.toCharArray();
        HashMap<Character , Character> map = new HashMap<Character, Character>();
        int max=0;
        int count=0;
        for(int i=0;i<inputs.length;i++){
            if(map.containsKey(inputs[i])){
                max=(count>max)?count:max;
                i=i-count+1;
                map.clear();
                count=0;

            }
            map.put(inputs[i], inputs[i]);
            count++;
        }
        max=(count>max)?count:max;
        return max;
    }
}
