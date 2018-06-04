package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengliejv on 2018/6/4.
 */
public class PositionsofLargeGroups830 {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();
        if(S.length()<3){
            return result;
        }
        char now = S.charAt(0);
        int begin = 0;
        for (int i = 1; i < S.length(); i++) {
            char a = S.charAt(i);
            if(a!=now){
                now = a;
                if(i-begin>=3){
                    List<Integer> list = new ArrayList<>();
                    list.add(begin);
                    list.add(i-1);
                    result.add(list);
                }
                begin = i;
            }
        }
        if(S.length()-begin>=3){
            List<Integer> list = new ArrayList<>();
            list.add(begin);
            list.add(S.length()-1);
            result.add(list);
        }
        return result;
    }
}
