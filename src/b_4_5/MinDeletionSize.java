package b_4_5;

public class MinDeletionSize {
    public int minDeletionSize(String[] A) {
        int res=0;
        for(int j=0;j<A[0].length();j++) {
            boolean tem=true;
            for (int i = 0; i < A.length-1; i++) {
                if(A[i].charAt(j)>A[i+1].charAt(j)){
                    i=A.length;
                    tem=false;
                }
            }
            if(tem==false)res++;
        }
        return res;
    }
}
