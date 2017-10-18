package string;

/**
 * Created by fengliejv on 2017/9/17.
 */

public class ValidPalindrome125 {
    //    public boolean isPalindrome(string s) {
//        s= s.trim();
//        if(s.length()==0){
//            return true;
//        }
//        char[] chars = s.toCharArray();
//        ArrayList<Character> arrayList = new ArrayList<Character>();
//        for (char c:chars
//             ) {
//            if(isLetter(c)){
//                arrayList.add(c);
//            }
//        }
//        if(arrayList.size()==1&&s.length()!=1){
//            return false;
//        }
//        ArrayList<Character> b = (ArrayList<Character>) arrayList.clone();
//        Collections.reverse(arrayList);
//        for (int i=0;i<arrayList.size();i++){
//            if(!(arrayList.get(i).toString().equalsIgnoreCase(b.get(i).toString()))){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    private boolean isLetter(char c){
//        if((c>'A'||(c=='A'))&&(c<'z'||c=='z')){
//            return true;
//        }else {
//            return false;
//        }
//    }
    public boolean isPalindrome(String s) {
        if (s.trim().length()==0) {
            return true;
        }

        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while (head <= tail) {
            cHead = s.charAt(head);
            cTail = s.charAt(tail);
            if (!Character.isLetterOrDigit(cHead)) {
                head++;
            } else if (!Character.isLetterOrDigit(cTail)) {
                tail--;
            } else {
                if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }

        return true;
    }
}
