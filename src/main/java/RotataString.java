/**
 * Created by fengliejv on 2020/5/6.
 * 解法：两次翻转
 * 第一次以m为分界线，翻转前后子串
 * 第二次整体翻转
 * 时间复杂度O(n)
 */

public class RotataString {

    public void revolveString(char[] A,int start,int end){
        while(start < end){
            char temp = A[start];
            A[start++] = A[end];
            A[end--] = temp;
        }
    }

    public String getRevolveString(String s,int m){
        char[] A = s.toCharArray();
        int len = s.length();
        revolveString(A,0,m-1);
        revolveString(A,m,len-1);
        revolveString(A,0,len-1);
        return String.valueOf(A);
    }

    public static void main(String[] args) {
        RotataString rotataString = new RotataString();
        String string = "abcdefg";
        System.out.println( rotataString.getRevolveString(string,2));
    }

}
