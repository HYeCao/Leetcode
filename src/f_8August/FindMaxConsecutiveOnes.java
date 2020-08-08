package f_8August;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int tem = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1)tem++;
            else {
                tem = 0;
            }
            if(tem > res)res = tem;
        }
        return res;
    }
}
