package string;

/**
 * Created by fengliejv on 2017/9/16.
 */
public class LongestCommonPrefix14 {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs[0].length()==0){
            return "";
        }
        for(int i=0;i<strs[0].length();i++){
            char ch = strs[0].charAt(i);
            for(String string :strs){
                if(string.length()-1<i){
                    return string;
                }
                if(string.charAt(i)!=ch){
                    return string.substring(0,i);
                }
            }
        }
        return strs[0];

    }
}


