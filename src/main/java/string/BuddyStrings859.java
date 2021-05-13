package string;

import java.util.HashSet;
import java.util.Set;

public class BuddyStrings859 {
    public boolean buddyStrings(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }
        if(a.equals(b)){
            return hasDuplicate(a);
        }
        int m = -1;
        int n = -1;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==b.charAt(i)){
                continue;
            }
            if(m==-1){
                m = i;
                continue;
            }
            if(n==-1){
                n =i;
                continue;
            }
            return false;
        }
        if(m==-1 || n ==-1){
            return false;
        }

        if(a.charAt(m)==b.charAt(n)&&a.charAt(n)==b.charAt(m)){
            return true;
        }
        return false;

    }

    private boolean hasDuplicate(String a) {
        Set set = new HashSet<>();
        for (char c :a.toCharArray()) {
            if(set.contains(c)){
                return true;
            }
            set.add(c);
        }
        return false;
    }



}
