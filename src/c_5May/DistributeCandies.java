package c_5May;

import java.util.ArrayList;
import java.util.Arrays;

public class DistributeCandies {
    public int distributeCandies(int[] candies) {
        //先排序的好处，如果过于乱序，直接执行Arraylist.contain 会导致性能下降
        Arrays.sort(candies);
        int A=candies[0],res=1;
        for(int i=0;i<candies.length;i++)
        {
            if(A!=candies[i]){
                res++;
                A=candies[i];
            }
            if(res>candies.length/2)return candies.length/2;
        }
        return res;
    }
}
