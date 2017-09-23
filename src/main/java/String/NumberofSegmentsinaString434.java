package String;

/**
 * Created by fengliejv on 2017/9/21.
 */
//todo
public class NumberofSegmentsinaString434 {
    public int countSegments(String s) {
        if(s.trim().length()==0){
            return 0;
        }
        return s.split(" ").length;
    }
}
