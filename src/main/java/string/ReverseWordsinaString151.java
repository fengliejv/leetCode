package string;

/**
 * Created by fengliejv on 2017/12/21.
 */
public class ReverseWordsinaString151 {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length-1; i >=0; i--) {
            if(strings[i].trim().equals("")){
                continue;
            }
            sb.append(strings[i].trim()+" ");
        }
        return sb.toString().trim();
    }
}
