package string;

/**
 * Created by fengliejv on 2017/10/18.
 */
public class RepeatedStringMatch686 {
    public int repeatedStringMatch(String A, String B) {
        if(A.length()>B.length()){
            if(A.indexOf(B)>-1){
                return 1;
            }else {
                String c = A+A;
                if(c.indexOf(B)>-1){
                    return 2;
                }
            }
            return -1;
        }
        StringBuffer stringBuffer = new StringBuffer(A);
        int count =1;
        while (!(stringBuffer.length()>B.length())){
            if(stringBuffer.toString().equals(B)){
                return count;
            }
            stringBuffer.append(A);
            count++;
        }
        if(stringBuffer.toString().indexOf(B)>0||stringBuffer.toString().indexOf(B)==0){
            return count;
        }else {
            return -1;
        }

    }
}
