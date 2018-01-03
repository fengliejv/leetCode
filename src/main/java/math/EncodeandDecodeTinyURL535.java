package math;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fengliejv on 2018/1/3.
 */
public class EncodeandDecodeTinyURL535 {
    Map<Integer, String> map = new HashMap<>();
    int i=0;
    public String encode(String longUrl) {
        map.put(i,longUrl);
        return "http://tinyurl.com/"+i++;
    }
    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
    }
}
