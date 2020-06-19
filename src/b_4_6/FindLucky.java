package b_4_6;

import java.util.HashMap;

public class FindLucky {
    public int findLucky(int[] arr) {
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        if(map.get(arr[i])==null)map.put(arr[i],1);
        else {
            map.put(arr[i],map.get(arr[i])+1);
        }
    }
    int res=0;
        for(int i:map.keySet()){
            if(i==map.get(i)){
                if(i>res)res=i;
            }
        }
        if(res==0)return -1;
        else return res;
    }
}
