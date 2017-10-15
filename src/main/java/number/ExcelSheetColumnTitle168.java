package number;

/**
 * Created by fengliejv on 2017/10/15.
 */
public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int n) {
        String result = new String();
        while (n>0){
            int res = n%26;
            n=n/26;
            char a;
            if(res==0){
                a = 'Z';
                n--;
            }else {
             a=(char) (res+'A'-1);

            }
            result=a+result;

        }
        return result;
    }
}
