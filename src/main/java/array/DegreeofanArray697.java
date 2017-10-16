package array;

import java.util.HashMap;

/**
 * Created by fengliejv on 2017/10/16.
 */
public class DegreeofanArray697 {
    public int findShortestSubArray(int[] nums) {
        Var v = new Var(1,0,0);
        HashMap<Integer,Var> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                Var var1 = map.get(nums[i]);
                var1.count++;
                var1.fina = i;
                map.put(nums[i],var1);
                if(var1.count==v.count){
                    if(var1.fina-var1.first<v.fina-v.first){
                        v=var1;
                    }
                }
                if(var1.count>v.count){
                    v=var1;
                }


            }else {
                map.put(nums[i],new Var(1,i));
            }
        }
        return v.fina-v.first+1;

    }
    class Var{
        public Var(int count,int first){
            this.count=count;
            this.first=first;
        }
        public Var(int count,int first,int fina){
            this.fina=fina;
            this.count=count;
            this.first=first;
        }
        public int count = 0;
        public int first = Integer.MIN_VALUE;
        public int fina = Integer.MIN_VALUE;
    }
}
