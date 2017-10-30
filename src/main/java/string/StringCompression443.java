package string;

/**
 * Created by fengliejv on 2017/10/30.
 */
public class StringCompression443 {
    public int compress(char[] chars) {
        int length = chars.length;
        if (length <= 1) {
            return length;
        }
        int input = 0;
        int count = 1;
        char pre = chars[0];
        for (int i = 1; i < length; i++) {
            if (chars[i] == pre) {
                count++;
            } else {
                chars[input++] = pre;
                if (count != 1) {
                    char[] s = String.valueOf(count).toCharArray();
                    for (int j = 0; j < s.length; j++) {
                        chars[input++] = s[j];
                    }
                }
                pre = chars[i];
                count = 1;
            }

        }

        chars[input++] = pre;
        if (count != 1) {
            char[] s = String.valueOf(count).toCharArray();
            for (int j = 0; j < s.length; j++) {
                chars[input++] = s[j];
            }
        }


        return input;
    }
}
