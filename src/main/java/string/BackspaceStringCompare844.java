package string;

/**
 * Created by fengliejv on 2018/8/30.
 */
public class BackspaceStringCompare844 {
    public boolean backspaceCompare(String S, String T) {
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();
        solve(S,s);
        solve(T,t);
        return s.toString().equals(t.toString());
    }

    public void solve(String S, StringBuilder s) {
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#') {
                if (s.length() != 0) {
                    s.deleteCharAt(s.length() - 1);
                }
            } else {
                s.append(S.charAt(i));
            }
        }
    }
}
