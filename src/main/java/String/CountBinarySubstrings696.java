package String;

/**
 * Created by fengliejv on 2017/10/17.
 */
public class CountBinarySubstrings696 {
    public int countBinarySubstrings(String s) {
        if(s.length()<2){
            return 0;
        }

        int count =0;
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)!=s.charAt(i+1)){
                count++;
                int pre = i-1;
                int last = i+1+1;
                while (pre>-1&&last<s.length()&&s.charAt(pre)==s.charAt(i)&&s.charAt(last)==s.charAt(i+1)){

                    count++;
                    pre--;
                    last++;
                }
            }
        }
        return count;
    }
}
