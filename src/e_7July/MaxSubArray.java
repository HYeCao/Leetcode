package e_7July;

import java.util.Queue;

/**
 * 滑动窗口实现 时间复杂度：O(n)
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)return nums[0];
        int res = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(dp[i-1] > 0)dp[i] = dp[i-1] + nums[i];
            else {
                dp[i] = nums[i];
            }
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
/**
 class Solution {
 public int maxSubArray(int[] nums) {
 int res = nums[0];
 for(int i = 1; i < nums.length; i++) {
 nums[i] += Math.max(nums[i - 1], 0);
 res = Math.max(res, nums[i]);
 }
 return res;
 }
 }
*/