package String;

/**
 * Created by fengliejv on 2017/9/21.
 */
public class ValidPalindromeII680 {
    public boolean validPalindrome(String s) {
        String r = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=r.charAt(i)){
                if(isOK(s.substring(i+1,s.length()-i),i)||isOK(r.substring(i+1,s.length()-i),i)){
                    return true;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isOK(String ss,int i){

        String r = new StringBuilder(ss).reverse().toString();
        for(int j=0;j<r.length();j++){
            if(ss.charAt(j)!=r.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
