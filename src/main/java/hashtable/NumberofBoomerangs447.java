package hashtable;

import java.util.HashMap;

/**
 * Created by fengliejv on 2017/10/30.
 */

public class NumberofBoomerangs447 {
    public int numberOfBoomerangs(int[][] points) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if(i==j){
                    continue;
                }
                int dis = dis(points[i],points[j]);
                map.put(dis,map.getOrDefault(dis,0)+1);
            }
            for (int v: map.values()
                    ) {
                count+=v*(v-1);
            }
            map.clear();


        }
        return count;
    }

    private int dis(int[] a,int b[]){
        int x = a[0]-b[0];
        int y = a[1]-b[1];
        return x*x+y*y;
    }
}
