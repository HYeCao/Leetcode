package b_4_2;

public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] A) {
        for(int i=0;i<A.length;i++){
            if(A[i]>A[i+1])return i;
        }
        return A.length-1;
    }
}
