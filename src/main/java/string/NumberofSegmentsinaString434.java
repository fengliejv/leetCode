package string;

/**
 * Created by fengliejv on 2017/9/21.
 */

public class NumberofSegmentsinaString434 {
    public int countSegments(String s) {
        if(s.trim().length()==0){
            return 0;
        }
        String[] strings = s.split(" +");
        int num = strings.length;
        if(num>1){
            if(strings[0].length()==0){
                num--;
            }
        }
        return num;
    }
}
