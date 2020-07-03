package e_7July;


import java.util.ArrayList;
import java.util.List;

public class GetRow {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        lists.add(list);
        list=new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            list.add(1);
            for(int j = 0; j < lists.get(i).size()-1; j++){
                list.add(lists.get(i).get(j)+lists.get(i).get(j+1));
            }
            list.add(1);
            lists.add(list);
            list = new ArrayList<>();
        }
        return lists.get(rowIndex);
    }
}
