package c_5May;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1])return nums[i];
        }
        return 0;
    }
}
