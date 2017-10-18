package string;

/**
 * Created by fengliejv on 2017/9/7.
 */
public class ReverseString541 {
    class Solution {
        public String reverseStr(String s, int k) {
            StringBuilder s1;
            StringBuilder s2;
            StringBuilder s3;
            StringBuilder s4;
            StringBuilder sb = new StringBuilder();
            int length = s.length();
            int num = length/(2*k);
            for(int i=0;i<num;i++){
                s1 = new StringBuilder(s.substring(2*i*k,2*i*k+k));
                sb.append(s1.reverse());
                s2 = new StringBuilder(s.substring(2*i*k+k,2*i*k+2*k));
                sb.append(s2);
            }
            int res = length%(2*k);
            if(res<k){
                 s3 = new StringBuilder(s.substring(length-res,length));
                sb.append(s3.reverse());
            }else {
                 s3 = new StringBuilder(s.substring(length-res,length-res+k));
                sb.append(s3.reverse());
                 s4 = new StringBuilder(s.substring(length-res+k,length));
                sb.append(s4);
            }
            return  sb.toString();
        }
    }
}
