package c_5May;

import java.util.Arrays;

public class RepeatedNTimes {
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            if(A[i]==A[i+1])return A[i];
        }
        return 0;
    }
}
/**
 * 重复元素最近距离不超过3
 * class Solution {
 *     public int repeatedNTimes(int[] A) {
 *         for (int k = 1; k <= 3; ++k)
 *             for (int i = 0; i < A.length - k; ++i)
 *                 if (A[i] == A[i+k])
 *                     return A[i];
 *
 *         throw null;
 *     }
 * }
 */
