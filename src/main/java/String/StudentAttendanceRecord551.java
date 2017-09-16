package String;

import java.util.HashMap;

/**
 * Created by fengliejv on 2017/9/11.
 */

public class StudentAttendanceRecord551 {
    class Solution {
        public boolean checkRecord(String s) {
            char[] chars = s.toCharArray();
            int aCount = 0;
            int lCount = 0;
            for(char c : chars){
                if(c=='A'){
                    aCount++;
                    lCount = 0;
                }
                if(c=='L'){
                    lCount++;
                }
                if(c=='P'){
                    lCount = 0;
                }
                if(aCount>1||lCount>2){
                    return false;
                }
            }
            return true;
        }
    }
}
