package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengliejv on 2017/11/8.
 */
public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        List<String>list = new ArrayList();
        for (int i = 0; i < n; i++) {
            int res3 = (i+1)%3;
            int res5 = (i+1)%5;
            if(res3==0&&res5==0){
                list.add("FizzBuzz");
            }else
            if(res3==0){
                list.add("Fizz");
            }else
            if(res5==0){
                list.add("Buzz");
            }else {
                list.add(new StringBuilder().append(i+1).toString());
            }
        }
        return list;
    }
}
