package math;

/**
 * Created by fengliejv on 2017/10/7.
 */
public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int index = length-1;
        while (index>-1&&digits[index]==9){
            index--;
        }
        if(index<0){
            int[] result = new int[length+1];
            result[0]=1;
            for (int i = 1; i < result.length; i++) {
                result[i]=0;
            }
            return result;
        }else {
            int[] result = new int[length];
            for (int i = index+1; i < result.length; i++) {
                result[i]=0;
            }
            result[index] = digits[index]+1;
            for (int i = 0; i < index; i++) {
                result[i] = digits[i];
            }
            return result;
        }
    }
}
