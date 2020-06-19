package d_6June;

/**
 * 数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。
 * 你有办法在O(n)时间内完成吗？
 *
 * 异或运算进行处理
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res ^=i;
            res ^=nums[i];
        }
        res^=nums.length;
        return res;
    }
}
