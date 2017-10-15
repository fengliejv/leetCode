package number;

/**
 * Created by fengliejv on 2017/10/15.
 */
public class ExcelSheetColumnNumber171 {
    public int titleToNumber(String s) {
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sum = (int) (sum+(c-'A'+1)*Math.pow(26,s.length()-1-i));
        }
        return sum;
    }
}
