package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengliejv on 2017/11/30.
 */
public class SummaryRanges228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> strings = new ArrayList<>();
        if(nums.length==0){
            return strings;
        }
        int pre = nums[0];
        int begin = nums[0];
        StringBuffer sb = new StringBuffer(""+pre);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=pre+1){
                if(begin==pre){
                    strings.add(sb.toString());
                }else {
                    sb.append("->").append(pre);
                    strings.add(sb.toString());
                }
                sb=new StringBuffer(""+nums[i]);
                begin=nums[i];
            }
            pre=nums[i];

        }

        if(sb.length()!=0){
            if(pre==begin){
                strings.add(sb.toString());
            }else {
                sb.append("->").append(pre);
                strings.add(sb.toString());
            }
        }


        return strings;
    }

}
