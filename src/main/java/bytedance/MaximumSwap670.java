package bytedance;

import java.util.Arrays;
import java.util.LinkedHashMap;


/**
 * Created by fengliejv on 2020/4/12.
 */
public class MaximumSwap670 {
    public static void main(String[] args) {
        MaximumSwap670 maximumSwap670 = new MaximumSwap670();
        int num = 9973;
        int result = maximumSwap670.maximumSwap(num);
        System.out.println(result);
    }
    public int maximumSwap(int num) {
        //记录最右边的0-9
        int[] bitmap = new int[10];
        for (int i = 0; i < bitmap.length; i++) {
            bitmap[i] = -1;
        }

        char[] n = String.valueOf(num).toCharArray();
        init(bitmap, n);
        for (int i = 0; i < n.length; i++) {
            int v = n[i] - '0';
            for (int j = bitmap.length - 1; j > 0; j--) {
                if (v < j && bitmap[j] != -1 &&bitmap[j]>i) {
                    char tmp = n[bitmap[j]];
                    n[bitmap[j]] = n[i];
                    n[i] = tmp;
                    return result(n);
                }
            }

        }
        return num;
    }

    private int result(char[] n) {
        Integer resut = 0;
        int x = 1;
        for (int i = n.length-1; i>=0 ; i--) {
            resut+=(n[i]-'0')*(x);
            x=x*10;
        }
        return resut;
    }

    private void init(int[] bitmap, char[] s) {
        for (int i = 0; i < s.length; i++) {
            int index = s[i] - '0';
            bitmap[index] = i;
        }
    }
}
