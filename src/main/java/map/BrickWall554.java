package map;

import java.util.HashMap;
import java.util.List;

/**
 * Created by fengliejv on 2018/1/2.
 */
public class BrickWall554 {
    public int leastBricks(List<List<Integer>> wall) {
        if(wall.size()==0){
            return 0;
        }
        int max = wall.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        int m = 0;


        for (int i = 0; i < max; i++) {
            int sum =0;
            for (int j = 0; j < wall.get(i).size()-1; j++) {

                sum+=wall.get(i).get(j);
                int num = map.getOrDefault(sum,0);
                map.put(sum,num+1);
                if(num+1>m){
                    m = num+1;
                }
            }
        }
        return max-m;
    }
}
