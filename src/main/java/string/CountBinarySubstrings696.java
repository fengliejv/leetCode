package string;

/**
 * Created by fengliejv on 2017/10/17.
 */
public class CountBinarySubstrings696 {
    public int countBinarySubstrings(String s) {
        if (s.length() < 2) {
            return 0;
        }
        int count = 0;
        int pre = 0;
        int now = 1;
        int begin = 1;
        while (begin < s.length()&& s.charAt(begin) == s.charAt(0)) {
            now++;
            begin++;
        }
        if (begin == s.length()) {
            return 0;
        }
        int cmp = s.charAt(0);
        for (int i = begin; i < s.length(); i++) {
            if (s.charAt(i) != cmp) {
                pre = now;
                now = 1;
                cmp = s.charAt(i);
            } else {
                now++;
            }
            if (now < pre || now == pre) {
                count++;
            }

        }
        return count;
    }


    //method 1
//    public int countBinarySubstrings(string s) {
//        if(s.length()<2){
//            return 0;
//        }
//
//        int count =0;
//        for (int i = 0; i < s.length()-1; i++) {
//            if(s.charAt(i)!=s.charAt(i+1)){
//                count++;
//                int pre = i-1;
//                int last = i+1+1;
//                while (pre>-1&&last<s.length()&&s.charAt(pre)==s.charAt(i)&&s.charAt(last)==s.charAt(i+1)){
//
//                    count++;
//                    pre--;
//                    last++;
//                }
//            }
//        }
//        return count;
//    }
}
