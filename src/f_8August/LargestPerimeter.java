package f_8August;

import java.util.Arrays;

public class LargestPerimeter {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for(int i = A.length - 1; i > 0; i--){
            int x = A[i], y = A[i - 1], z = A[i - 2];
            if(x < (y + z)){
                return x+y+z;
            }
        }
        return 0;
    }
}
