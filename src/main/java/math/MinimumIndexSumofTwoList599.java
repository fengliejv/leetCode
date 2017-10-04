package math;

import java.util.*;

/**
 * Created by fengliejv on 2017/10/4.
 */
public class MinimumIndexSumofTwoList599 {
//    public String[] findRestaurant(String[] list1, String[] list2) {
//        HashMap<String,Integer> list1map = new HashMap<>();
//        ArrayList<Mapp> mapps = new ArrayList<>();
//        for (int i = 0; i < list1.length; i++) {
//            list1map.put(list1[i],i);
//        }
//
//        for (int i = 0; i < list2.length; i++) {
//            if(list1map.containsKey(list2[i])){
//                mapps.add(new Mapp(list2[i],i+list1map.get(list2[i])));
//            }
//        }
//        Collections.sort(mapps,new Compp() );
//        ArrayList<String> arrayList = new ArrayList<>();
//        int a = mapps.get(0).index;
//        //arrayList.add(mapps.get(0).val);
//        for (Mapp mapp:mapps
//             ) {
//            if(mapp.index==a)
//                arrayList.add(mapp.val);
//            else
//                break;
//        }
//        int i=0;
//        String[] strings = new String[arrayList.size()];
//        for (String str:arrayList
//             ) {
//            strings[i]=str;
//            i++;
//        }
//        return  strings;
//    }
//    class Compp implements Comparator{
//        @Override
//        public int compare(Object o1, Object o2) {
//            return ((Mapp)(o1)).index-((Mapp)(o2)).index;
//        }
//    }
//
//    class Mapp{
//        public String val;
//        public int index;
//        public Mapp(String val,int index){
//            this.val = val;
//            this.index = index;
//        }
//    }
public String[] findRestaurant(String[] list1, String[] list2) {
    HashMap<String,Integer> list1map = new HashMap<>();
    HashMap<Integer,ArrayList<String>> res = new HashMap<>();
    for (int i = 0; i < list1.length; i++) {
        list1map.put(list1[i],i);
    }
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < list2.length; i++) {
        if(list1map.containsKey(list2[i])){
            int count = list1map.get(list2[i])+i;
            if(count<min){
                min=count;
            }
            if(res.containsKey(count)){
                ArrayList arrayList = res.get(count);
                arrayList.add(list2[i]);
            }else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(list2[i]);
                res.put(count,arrayList);
            }
        }
    }
    ArrayList<String> arrayList = res.get(min);
    int j=0;
    String[] strings = new String[arrayList.size()];
    for (String str:arrayList
            ) {
        strings[j]=str;
        j++;
    }
    return  strings;
}


}
