package f_8August;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,2};
        missingNumber(nums);
    }
    public static int missingNumber(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                res = i;
                break;
            }
        }
        if(res == 0)res=nums.length;
        return res+1;
    }
}
