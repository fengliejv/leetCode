package String;

/**
 * Created by fengliejv on 2017/9/16.
 */


public class CountandSay38 {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        StringBuilder sb = new StringBuilder("1");
        for(int i=0;i<n-1;i++){
            char[] chars = sb.toString().toCharArray();
            StringBuilder sb2 = new StringBuilder();
            int count =0;
            char c = chars[0];
            for(int j=0;j<chars.length;j++){
                if(chars[j]==c){
                    count++;
                }else {
                    sb2.append(Integer.toString(count));
                    sb2.append(chars[j-1]);
                    c = chars[j];
                    count=1;
                }
            }
            sb2.append(Integer.toString(count));
            sb2.append(chars[chars.length-1]);
            if(sb2.length()!=0){
                sb = sb2;
            }
        }
        return sb.toString();
    }
}
