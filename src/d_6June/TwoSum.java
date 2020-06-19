package d_6June;
//双指针的运用
//public class TwoSum {
//    public int[] twoSum(int[] nums, int target) {
//        int l = 0, r = nums.length-1;
//        while(l<r){
//            int sum = nums[l] + nums[r];
//            if(sum == target) return new int[]{nums[l],nums[r]};
//            if(sum < target) l++;
//            if(sum > target) r--;
//        }
//        return null;
//    }
//}
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int le=0,ri=nums.length-1;
        while(le<ri){
            if(nums[le]+nums[ri]>target)ri--;
            if(nums[le]+nums[ri]<target)le++;
            if(nums[le]+nums[ri]==target)return new int[]{nums[le],nums[ri]};
        }
        return null;
    }
}