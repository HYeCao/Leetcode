package f_8August;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinSubsequence {
    public List<Integer> minSubsequence(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        int tem = 0;
        for(int j = nums.length - 1; j > 0; j--){
            list.add(nums[j]);
            sum -= nums[j];
            tem += nums[j];
            if(tem > sum)break;
        }
        return list;
    }
}
