package bytedance;

/**
 * Created by fengliejv on 2020/4/13.
 */
public class SwapAdjacentinLRString777 {
    public boolean canTransform(String start, String end) {
        if (start.length() != end.length()) {
            return false;
        }
        if (!start.replace("X", "").equals(end.replace("X", ""))) {
            return false;
        }

        int endRindex = 0;
        for (int i = 0; i < start.length(); i++) {
            if(start.charAt(i)=='R'){

                while (end.charAt(endRindex)!='R'){
                    endRindex++;
                }
                if(endRindex<i){
                    return false;
                }
                endRindex++;
            }
        }
        int startLindex = 0;
        for (int i = 0; i < end.length(); i++) {
            if(end.charAt(i)=='L'){

                while (start.charAt(startLindex)!='L'){
                    startLindex++;
                }
                if(startLindex<i){
                    return false;
                }
                startLindex++;
            }
        }
        return true;

    }


//    public boolean canTransform(String start, String end) {

//        if (start.length() != end.length()) {
//            return false;
//        }
//        if (!start.replace("X", "").equals(end.replace("X", ""))) {
//            return false;
//        }
//
//        for (int i = 0; i < start.length(); i++) {
//            if (start.charAt(i) == end.charAt(i)) {
//                continue;
//            }
//
//            if (start.charAt(i) != end.charAt(i)) {
//                if (start.charAt(i) == 'X' && i + 1 < start.length() && start.charAt(i + 1) == 'L' && end.charAt(i) == 'L' && end.charAt(i + 1) == 'X') {
//                    i++;
//                    continue;
//                }
//                if (start.charAt(i) == 'R' && i + 1 < start.length() && start.charAt(i + 1) == 'X' && end.charAt(i) == 'X' && end.charAt(i + 1) == 'R') {
//                    i++;
//                    continue;
//                }
//            }
//            return false;
//
//        }
//
//        return true;
//
//    }
}
