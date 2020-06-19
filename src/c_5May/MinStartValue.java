package c_5May;

public class MinStartValue {
    public int minStartValue(int[] nums) {
        int res=1;
        if(nums[0]<0)res=-nums[0];
        int end=res;
        for (int i = 0; i < nums.length; i++) {
            end = end + nums[i];
            if (end<=0){
                i=-1;
                res++;
                end=res;
                }
            }
        return res;
    }
}
