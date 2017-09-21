package String;

/**
 * Created by fengliejv on 2017/9/19.
 */

public class RepeatedSubstringPattern459 {
    public char[] chars;
    public int length;

    public boolean repeatedSubstringPattern(String s) {
        this.chars = s.toCharArray();
        this.length = chars.length;
        for (int i = 2; i < length+1; i++) {
            if (!doCircle(i)) {
                continue;
            }
            return true;
        }
        return false;
    }

    private boolean doCircle(int i) {
        if (length % i == 0) {
            int subsize = length / i;
            for (int j = 0; j < i - 1; j++) {
                if (!doPart(subsize, j)) {
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }

    private boolean doPart(int subsize, int j) {
        for (int k = 0; k < subsize; k++) {
            if (chars[k+j * subsize] != chars[k + (j+1) * subsize]) {
                return false;
            }
        }
        return true;
    }
}

