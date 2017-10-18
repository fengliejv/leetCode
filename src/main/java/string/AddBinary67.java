package string;

import java.math.BigInteger;

/**
 * Created by fengliejv on 2017/9/17.
 */
public class AddBinary67 {
    public String addBinary(String a, String b) {
        BigInteger anum = new BigInteger(a,2);
        BigInteger bnum = new BigInteger(b,2);
        return anum.add(bnum).toString(2);
    }
    //输入的数字太大，会越界
//    public string addBinary(string a, string b) {
//        Long aInt = Long.parseLong(a,2);
//        Long bInt = Long.parseLong(b,2);
//        return Long.toBinaryString(aInt+bInt);
//    }
}
