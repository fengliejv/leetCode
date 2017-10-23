package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengliejv on 2017/10/23.
 */
public class PascalsTriangleII119 {


    //this will beats almost 50 percent
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        int index = rowIndex+1;
        while (index-->0){
            for (int i = list.size()-1; i >0 ; i--) {
                list.set(i,list.get(i)+list.get(i-1));
            }

            list.add(1);
        }
        return list;
    }



        //although this is accepted but with 2.26 percent
    public List<Integer> getRow1(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        List<Integer> reslist = new ArrayList<>();
        rowIndex++;
        while (rowIndex-->0){
            for (int i = 1; i < reslist.size(); i++) {
                reslist.set(i,pre.get(i-1)+pre.get(i));
            }
            reslist.add(1);
            pre= new ArrayList<>(reslist);
        }
        return reslist;
    }
}
