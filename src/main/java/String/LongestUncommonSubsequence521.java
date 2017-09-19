package String;

/**
 * Created by fengliejv on 2017/9/16.
 */
public class LongestUncommonSubsequence521 {

    public int findLUSlength(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        if (lena != lenb) {
            return lena > lenb ? lena : lenb;
        }

        if(a.equals(b)) {
            return -1;
        }else {
            return lena;
        }
    }
}
