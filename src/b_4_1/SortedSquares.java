package b_4_1;

import java.util.ArrayList;
import java.util.Collections;

public class SortedSquares {
    public int[] sortedSquares(int[] A) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<A.length;i++){
            list.add(A[i]*A[i]);
        }
        Collections.sort(list);
        for(int i=0;i<A.length;i++){
            A[i]=list.get(i);
        }
        return A;
    }
}
