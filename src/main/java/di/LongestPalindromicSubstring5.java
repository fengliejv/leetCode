package di;

import com.sun.deploy.util.StringUtils;

/**
 * Created by fengliejv on 2018/6/6.
 */
public class LongestPalindromicSubstring5 {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = null;

        boolean[][] dp = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);

                if (dp[i][j] && (res == null || j - i + 1 > res.length())) {
                    res = s.substring(i, j + 1);
                }
            }
        }

        return res;
    }

    public String longestPalindrome3(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }
        //record max and its index for return substring
        int max=0;
        int max_index=0;
        String s2 = new StringBuilder(s).reverse().toString();
        int[][] map = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(i==0||j==0){
                    if(s.charAt(i)==s2.charAt(j)){
                        map[i][j]=1;
                    }else {
                        map[i][j]=0;
                    }
                }else {
                    if(s.charAt(i)==s2.charAt(j)){
                        map[i][j]=map[i-1][j-1]+1;

                    }else {
                        map[i][j]=0;
                    }
                }
                if(map[i][j]>max){
                    max=map[i][j];
                    max_index=i;
                }
            }
        }
        return s.substring(max_index-max+1,max_index+1);
    }



    public String longestPalindrome2(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }
        String s2 = new StringBuilder(s).reverse().toString();
        int[][] map = new int[s.length()][s.length()];
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s2.charAt(j)) {
                    if (i > 0 && j > 0) {
                        map[i][j] = map[i - 1][j - 1] + 1;
                        if(map[i][j]>max){
                            max=map[i][j];
                            index=i;
                        }
                    } else {
                        map[i][j] = 1;
                    }
                }
            }
        }
        return s.substring(index-max+1,index+1);
    }

    public String longestPalindrome1(String s) {
        String s2 = new StringBuilder(s).reverse().toString();
        int[][] map = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s.charAt(i) == s2.charAt(j)) {
                    if (i > 0 && j > 0) {
                        map[i][j] = map[i - 1][j - 1] + 1;
                    } else {
                        map[i][j] = 1;
                    }
                } else {
                    if (i > 0 && j > 0) {
                        map[i][j] = Math.max(map[i - 1][j], map[i][j - 1]);
                    } else if (i > 0) {
                        map[i][j] = map[i - 1][j];
                    } else if (j > 0) {
                        map[i][j] = map[i][j - 1];
                    } else {
                        map[i][j] = 0;
                    }
                }
            }
        }
        int i = map.length - 1;
        int j = map[0].length - 1;
        int length = map[i][j];
        String result = "";
        while (length-- != 0) {
            while (s.charAt(i) != s2.charAt(j)) {
                if (i > 0 && map[i - 1][j] == map[i][j])
                    i--;
                else if (j > 0 && map[i][j - 1] == map[i][j])
                    j--;
            }
            result = result + s.charAt(i);
            i--;
            j--;
        }
        return result;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring5 longestPalindromicSubstring5 = new LongestPalindromicSubstring5();
        System.out.println(longestPalindromicSubstring5.longestPalindrome("ac"));
    }
}
