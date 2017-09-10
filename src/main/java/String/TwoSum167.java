package String;

/**
 * Created by fengliejv on 2017/9/10.
 */
public class TwoSum167 {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int[] index = new int[2];
            int i = 0;
            int j = numbers.length - 1;
            while (true) {
                if (numbers[i] + numbers[j] == target) {
                    index[0] = i+1;
                    index[1] = j+1;
                    return index;
                }
                if (numbers[i] + numbers[j] > target) {
                    j--;
                }else
                    i++;


            }
        }
    }
}
