package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinationSum39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtracking(candidates,0,candidates.length -1,target,result,new ArrayList<>());
        return result;
    }

    private void backtracking(int[] candidates, int i, int j, int target, List<List<Integer>> result,List<Integer> cur) {
        if(i>j){
            return;
        }
        if(target == 0){
            result.add(cur);
            return;
        }
        if(target>=candidates[j]){
            List<Integer> current = new ArrayList<>(cur);
            current.add(candidates[j]);
            backtracking(candidates,i,j,target-candidates[j],result,current);
        }
        backtracking(candidates,i,j-1,target,result,cur);

    }
}
