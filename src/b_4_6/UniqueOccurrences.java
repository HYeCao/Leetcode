package b_4_6;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false。
 */
public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==null){
                map.put(arr[i],1);
            }
            else {
                map.put(i,map.get(i)+1);
            }
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:map.keySet()){
            if(list.contains(map.get(i)))return false;
            else list.add(map.get(i));
        }
        return true;
    }
}
