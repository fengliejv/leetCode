package String;

/**
 * Created by fengliejv on 2017/9/16.
 */
public class DetectCapital520 {
    public boolean detectCapitalUse(String word) {
        char[] chars = word.toCharArray();
        if(chars.length==1){
            return true;
        }
        if(isCapital(chars[0])){
            if(chars.length==2){
                return true;
            }
            if(isCapital(chars[1])){
                for(int i=2;i<chars.length;i++){
                    if(!isCapital(chars[i])){
                        return false;
                    }
                }
            }else {
                for(int i=2;i<chars.length;i++){
                    if(isCapital(chars[i])){
                        return false;
                    }
                }

            }
        }else {
            for (int i=1;i<chars.length;i++){
                if(isCapital(chars[i])){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isCapital(char ch){
        if((ch>'A'||ch=='A')&&(ch<'Z'||ch=='Z')){
            return true;
        }
        return false;
    }
}
