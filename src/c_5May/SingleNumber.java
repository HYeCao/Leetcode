package c_5May;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。
 * 找出那个只出现了一次的元素。
 * 解法：
 * 使用位运算。对于这道题，可使用异或运算 ⊕\oplus⊕。异或运算有以下三个性质。
 *
 * 任何数和 000 做异或运算，结果仍然是原来的数，即 a⊕0=a
 * 任何数和其自身做异或运算，结果是 0，即 a⊕a=0
 * 异或运算满足交换律和结合律，即 a⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b
 */
public class SingleNumber {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            res ^= nums[i];
        }
        return res;
    }
}
