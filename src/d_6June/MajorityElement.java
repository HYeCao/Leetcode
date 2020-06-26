package d_6June;

public class MajorityElement {
//    public int majorityElement(int[] nums) {
//        int n =nums.length;
//        if(n==0)return -1;
//        int num = nums[0],cnt = 1;
//        for(int i=1;i<n;i++){
//            if(nums[i]==num){
//                cnt++;
//            }
//            else cnt--;
//            if(cnt==-1){
//                num=nums[i];
//                cnt=1;
//            }
//        }
//        return cnt>0?num:-1;
//    }

    public int majorityElement(int[] nums) {
        int cot=1;
        int num=nums[0];
        for(int i=1;i<nums.length;i++){
            if(num==nums[i]){
                cot++;
            }
            else if(num!=nums[i]){
                cot--;

            }
            if(cot==0){
                num=nums[i];
                cot++;
            }
        }
        return num;
}
}
/*
class Solution {
    public int majorityElement(int[] nums) {
        // 投票算法
        int temp = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == temp) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                temp = nums[i];
                count = 1;
            }
        }

        // 验证是否满足要求
        int t = nums.length / 2 + 1;
        count = 0;
        for (int num : nums) {
            if (num == temp) count++;
            if (count == t) return temp;
        }
        return -1;
    }
}
 */