package d_6June;

import java.util.ArrayList;
import java.util.Collections;

public class KeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            int re=0;
            for(int j=0;j<mat[i].length;j++){
                re+=mat[i][j];
            }
            list.add(re*1000+i);
        }
        Collections.sort(list);
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=list.get(i)%1000;
        }
        return res;
    }
}
