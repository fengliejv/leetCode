package greedy;

import java.util.Arrays;

/**
 * Created by fengliejv on 2017/9/11.
 */

public class AssignCookies455 {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int j=0;
        for (int i=0;i<g.length;i++){
            while(g[i]>s[j]){
                j++;
                if(j>s.length-1){
                    return count;
                }
            }
            j++;
            count++;
            if(j>s.length-1){
                return count;
            }

        }
        return count;
    }
}
