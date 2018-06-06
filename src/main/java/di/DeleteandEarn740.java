package di;

import java.util.*;

/**
 * Created by fengliejv on 2018/6/6.
 */
public class DeleteandEarn740 {
    public int deleteAndEarn(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        //存储 num sum
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int a : nums
                ) {
            map.put(a, map.getOrDefault(a, 0) + a);
        }
        List<Integer> result = new ArrayList<>(map.size());
        for (Map.Entry<Integer,Integer> entry : map.entrySet()
                ) {
            int key = entry.getKey();
            Integer floorkey = map.floorKey(key-1);
            if(floorkey!=null){
                if(floorkey+1==key){
                    Integer a = map.floorKey(floorkey-1);
                    if(a!=null){
                        result.add(Math.max(result.get(result.size()-2)+map.get(key),result.get(result.size()-1)));
                    }else {
                        result.add(Math.max(result.get(result.size()-1),map.get(floorkey+1)));
                    }
                }else {
                    result.add(result.get(result.size()-1)+map.get(key));
                }
            }else {
                result.add(map.get(key));
            }
        }
        return result.get(result.size()-1);
    }

    public static void main(String[] args) {
        DeleteandEarn740 deleteandEarn740 = new DeleteandEarn740();
        System.out.println(deleteandEarn740.deleteAndEarn(new int[]{3,4,2}));
    }
}
