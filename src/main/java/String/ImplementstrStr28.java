package String;

/**
 * Created by fengliejv on 2017/9/17.
 */
public class ImplementstrStr28 {

    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        if(haystack.length()==0||haystack.length()<needle.length()){
            return -1;
        }
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            int a=i;
            for(int j=0;j<needle.length();j++){
                if(haystack.charAt(a)!=needle.charAt(j)){
                    break;
                }
                a++;
                if(a==needle.length()-1){
                    return i;
                }
                if(a==haystack.length()){
                    return -1;
                }
            }

        }
        return -1;
    }
}
