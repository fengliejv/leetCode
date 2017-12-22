package string;

import java.util.TreeSet;

/**
 * Created by fengliejv on 2017/12/22.
 */
public class FindSmallestLetterGreaterThanTarget744 {
    public char nextGreatestLetter(char[] letters, char target) {
        TreeSet<Character> set = new TreeSet<>();
        char min = letters[0];
        for (int i = 0; i < letters.length; i++) {
            min = min>letters[i]?letters[i]:min;
            set.add(letters[i]);
        }
        char res = set.higher(target)==null?min:set.higher(target);
        return res;

    }
}
