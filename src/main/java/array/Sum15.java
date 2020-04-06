package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length<3){
            return result;
        }
        Arrays.sort(nums);
        int opt = -nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(i>0&&opt==-nums[i]){
                continue;
            }
            opt=-nums[i];
            int begin = i + 1;
            int end = nums.length - 1;
            while (begin < end) {
                if (nums[begin] + nums[end] == opt) {
                    List<Integer> r = new ArrayList<>();
                    r.add(nums[i]);
                    r.add(nums[begin]);
                    r.add(nums[end]);
                    result.add(r);
                    int pre = nums[begin];
                    begin++;
                    while (begin<nums.length&&nums[begin]==pre){
                        begin++;
                    }
                    end--;
                }
                else if (nums[begin] + nums[end] < opt) {
                    begin++;
                }
                else if (nums[begin] + nums[end] > opt) {
                    end--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Sum15 sum15 = new Sum15();
        int[] numm = new int[]{0,0,0};
        sum15.threeSum(numm);
    }
}
