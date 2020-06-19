package c_5May;

import java.util.ArrayList;
import java.util.Arrays;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    list.add(arr1[j]);
                    arr1[j]=-1;
                }
            }
        }
        Arrays.sort(arr1);
        int[] res=new int[arr1.length];
        for(int i=0;i<list.size();i++)res[i]=list.get(i);
        for(int i=list.size();i<arr1.length;i++)res[i]=arr1[i];
        return res;
    }
}
