package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by fengliejv on 2017/10/31.
 */
public class EmployeeImportance690 {
    public int getImportance(List<Employee> employees, int id) {
        int sum = 0;
        HashMap<Integer, Employee> map = new HashMap<>();
        for (int i = 0; i < employees.size(); i++) {
            map.put(employees.get(i).id, employees.get(i));
        }
        sum += map.get(id).importance;
        List<Integer> subordinate = new ArrayList<>();
        subordinate.addAll(map.get(id).subordinates);
        while (subordinate.size()!=0){
            sum+=map.get(subordinate.get(0)).importance;
            subordinate.addAll(map.get(subordinate.get(0)).subordinates);
            subordinate.remove(0);
        }
        return sum;
    }
}
