package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations77 {
    public List<List<Integer>> combine(int n, int k) {
        if(k>n){
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        combine(n,k,result,new ArrayList<>());
        return result;
    }

    private <E> void combine(int n, int k, List<List<Integer>> result, ArrayList<Integer> cur) {
        if(k==0){
            result.add(new ArrayList<>(cur));
            return;
        }
        if(n==0){
            return;
        }
        if(n<k){
            return;
        }

        combine(n-1,k,result,cur);

        cur.add(n);
        combine(n-1,k-1,result,cur);
        cur.remove(cur.size()-1);
    }


}
