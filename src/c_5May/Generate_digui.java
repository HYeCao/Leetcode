package c_5May;

import java.util.ArrayList;
import java.util.List;

public class Generate_digui {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0)return new ArrayList<>();
        List<List<Integer>> lists=new ArrayList();
        if(numRows==1){
            ArrayList<Integer> list=new ArrayList<>();
            list.add(1);
            lists.add(list);
            return lists;
        }
        lists=generate(numRows-1);//该位置最重要 ，放在执行前还是执行后！！！
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        for(int i=1;i<numRows-1;i++){
            list.add(lists.get(numRows-2).get(i-1)+lists.get(numRows-2).get(i));
        }
        list.add(1);
        lists.add(list);
        return lists;
    }
}
