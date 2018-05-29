package di;

import java.util.List;

/**
 * Created by fengliejv on 2018/5/30.
 */
public class Triangle120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null) {
            return -1;
        }
        for (int i = 1; i < triangle.size(); i++) {
            List<Integer> list = triangle.get(i);
            for (int j = 0; j < list.size(); j++) {
                if(j==0){
                    list.set(j,list.get(j)+triangle.get(i-1).get(0));
                }else
                if(j==list.size()-1){
                    list.set(j,list.get(j)+triangle.get(i-1).get(j-1));
                }else {
                    list.set(j, list.get(j) + Math.min(triangle.get(i - 1).get(j - 1), triangle.get(i - 1).get(j)));
                }
            }
        }
        List<Integer> list = triangle.get(triangle.size()-1);
        int result =Integer.MAX_VALUE;
        for (int a:list
             ) {
            if(a<result)
                result=a;
        }
        return result;
    }
}
