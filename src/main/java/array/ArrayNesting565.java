package array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by fengliejv on 2017/12/21.
 */
public class ArrayNesting565 {
    Set<Integer> set = new HashSet<>();

    public int arrayNesting(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(i)){
                int c = find(i,nums);
                if(c>nums.length/2+1){
                    return c;
                }else if(c>max) {
                    max=c;
                }
            }
        }
        return max;
    }
    private int find(int i,int[] ints){
        int count =0;
        while (!set.contains(i)){
            count++;
            set.add(i);
            i=ints[i];
        }
        return count;

    }
}
