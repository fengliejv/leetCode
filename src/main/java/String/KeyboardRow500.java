package String;

import java.util.ArrayList;

/**
 * Created by fengliejv on 2017/9/11.
 */
public class KeyboardRow500 {
    class Solution {
        public String[] findWords(String[] words) {
            String str1 = "QWERTYUIOPqwertyuiop";
            String str2 = "ASDFGHJKLasdfghjkl";
            String str3 = "ZXCVBNMzxcvbnm";
            ArrayList<String> arrayList= new ArrayList<String>();
            for(String word : words){
                if(word.length()==1){
                    arrayList.add(word);
                    continue;
                }
                char[] chars = word.toCharArray();
                String str = new String();
                if(str1.contains(chars[0]+"")){
                    str = str1;
                }else if(str2.contains(chars[0]+"")){
                    str = str2;
                }else {
                    str = str3;
                }
                for(int i=1;i<chars.length;i++){
                    if(str.contains(chars[i]+"")){
                        if(i==chars.length-1){
                            arrayList.add(word);
                        }
                        continue;
                    }else {
                        break;
                    }
                }

            }
            return (String[]) arrayList.toArray();
        }
    }
}
