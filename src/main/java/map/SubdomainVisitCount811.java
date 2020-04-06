package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by fengliejv on 2018/8/28.
 */
public class SubdomainVisitCount811 {
    public static void main(String[] args) {
        SubdomainVisitCount811 subdomainVisitCount811 = new SubdomainVisitCount811();
        String[] strings = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        subdomainVisitCount811.subdomainVisits(strings);
    }
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : cpdomains
                ) {
            String[] strings = s.split(" ");
            int count = Integer.parseInt(strings[0]);
            String domain = strings[1];
            String[] sites = domain.split("\\.");
            String tmp = "";
            for (int i = sites.length - 1; i >= 0; i--) {
                if (i == sites.length - 1) {
                    tmp = sites[sites.length - 1];
                } else {
                    tmp = sites[i] + "." + tmp;
                }
                map.put(tmp, map.getOrDefault(tmp, 0) + count);
            }
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()
                ) {
            String res = entry.getValue()+" "+entry.getKey();
            result.add(res);
        }
        return result;
    }
}
