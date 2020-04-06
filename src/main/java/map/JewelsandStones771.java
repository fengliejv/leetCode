package map;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fengliejv on 2018/8/28.
 */
public class JewelsandStones771 {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        Set<Character> set = new HashSet<>();
        for (char j:J.toCharArray()
             ) {
            set.add(j);
        }
        for (char j:S.toCharArray()
             ) {
            if(set.contains(j)){
                result++;
            }
        }
        return result;
    }
}
