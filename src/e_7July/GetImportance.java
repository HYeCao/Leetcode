package e_7July;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};

/**
 * 存储至hashmap中，用于执行搜索查找
 */
public class GetImportance {
    Map<Integer , Employee> map;
    int imp;
    public int getImportance(List<Employee> employees, int id) {
        map =new  HashMap<Integer , Employee>();
        imp = 0;
        for(Employee em : employees){
            map.put(em.id, em);
        }
        return get(id);
    }
    public int get(int id) {
        imp = map.get(id).importance;//首先需要赋初始值
        if(id == 0)return 0;
        else {
            for(int i = 0; i < map.get(id).subordinates.size(); i++){
                imp +=get(map.get(id).subordinates.get(i));
            }
        }
        return imp;
    }
}
