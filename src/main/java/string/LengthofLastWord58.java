package string;

/**
 * Created by fengliejv on 2017/9/17.
 */
public class LengthofLastWord58 {
    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        if (strings.length == 0) {
            return 0;
        }
        return strings[strings.length - 1].length();
    }
}
