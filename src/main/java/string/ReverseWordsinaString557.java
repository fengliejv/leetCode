package string;

/**
 * Created by fengliejv on 2017/9/7.
 */
public class ReverseWordsinaString557 {
    class Solution {
        public String reverseWords(String s) {
            String[] strings = s.split(" ");
            StringBuilder ss = new StringBuilder();

            for(int j=0;j<strings.length;j++){
                String string = strings[j];
                char[] chars = string.toCharArray();
                for (int i = chars.length - 1; i >-1; i--) {
                    ss.append(chars[i]);
                }
                if(j!=strings.length-1) {
                    ss.append(" ");
                }
            }
            return ss.toString();
        }
    }
}
