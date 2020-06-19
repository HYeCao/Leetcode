package c_5May;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0)return new ArrayList<>();
        List<List<Integer>> lists=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        lists.add(list);
        list=new ArrayList<>();
        for(int i=1;i<numRows;i++){
            list.add(1);
            for(int j=1;j<i;j++){
                list.add(lists.get(i-1).get(j-1)+lists.get(i-1).get(j));
            }
            list.add(1);
            lists.add(list);
            list=new ArrayList<>();
        }
        return lists;
    }
}
