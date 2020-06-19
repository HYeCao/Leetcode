package b_4_6;

import java.util.ArrayList;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0)list1.add(A[i]);
            else list2.add(A[i]);
        }
        list1.addAll(list2);
        int[] res=new int[list1.size()];
        for(int i=0;i<list1.size();i++){
            res[i]=list1.get(i);
        }
        return res;
    }
}
