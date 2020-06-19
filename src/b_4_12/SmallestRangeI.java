package b_4_12;

import java.util.ArrayList;
import java.util.Collections;

public class SmallestRangeI {
    public int smallestRangeI(int[] A, int K) {
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<A.length;i++){
                list.add(A[i]);
            }
            Collections.sort(list);
            int res=list.get(list.size()-1)-list.get(0)-K*2;
            if(res>0)return res;
            return 0;
    }
}
