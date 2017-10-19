package math;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fengliejv on 2017/10/19.
 */

public class PascalsTriangle118 {
    //the two method is Ok but this one is more effective
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            arrayList.add(0,1);
            for (int j = 1; j < arrayList.size()-1; j++) {
                arrayList.set(j,arrayList.get(j)+arrayList.get(j+1));
            }
            lists.add(new ArrayList<>(arrayList));
        }
        return lists;
    }
//    public List<List<Integer>> generate(int numRows) {
//        List<List<Integer>> lists = new ArrayList<>();
//        for (int i = 0; i < numRows; i++) {
//            ArrayList<Integer> arrayList = new ArrayList<>();
//            for (int j = 0; j < i+1; j++) {
//                if(j-1<0){
//                    arrayList.add(1);
//                }else {
//                    int length = lists.size();
//                    if(j>length-1){
//                        arrayList.add(1);
//                    }else {
//                        arrayList.add(lists.get(length-1).get(j-1)+lists.get(length-1).get(j));
//                    }
//                }
//            }
//            lists.add(arrayList);
//        }
//        return lists;
//    }
}
