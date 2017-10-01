package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by fengliejv on 2017/10/1.
 */
public class RepeatedDNASequences187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<String>();
        HashMap<String,Integer> map = new HashMap();
        for(int i=0;i<s.length()-9;i++){
            String sub = s.substring(i,i+10);
            if(map.containsKey(sub)){
                int val = map.get(sub);
                if(val==1){
                    map.put(sub,2);
                    list.add(sub);
                }
            }else {
                map.put(sub,1);
            }
        }
        return list;
    }
}
