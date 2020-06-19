package c_5May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> lists=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        int temp=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(temp==arr[i+1]-arr[i]) {
                res.add(arr[i]);
                res.add(arr[i+1]);
                lists.add(res);
                res=new ArrayList<>();
            }
            else if(temp>arr[i+1]-arr[i]){
                temp=arr[i+1]-arr[i];
                lists=new ArrayList<>();
                res.add(arr[i]);
                res.add(arr[i+1]);
                lists.add(res);
                res=new ArrayList<>();
            }
        }
        return lists;
    }
}
