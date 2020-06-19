/**
 * 
 */
package a_3_18;

/**
 * @author caohongye
 *给定一个长度为 n 的整数数组，你的任务是判断在最多改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 *我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1]。
 *1 3 5 2 4
 *思路：到底换哪个元素，换到哪个位置？
 *换到最后，然后再检查是不是非递减的。
 *时间复杂度较高
 */
public class CheckPossibility {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * 前后元素替换关系，直接选择前替换 还是后替换
	 * @param nums
	 * @return
	 */
	 public boolean checkPossibility(int[] nums) {
		 int count = 0;
	        //int tag = nums[0];
	        for(int i = 1; i < nums.length; i++)
	        {
	            if(nums[i-1] > nums[i])
	            {
	                if(i-2 >= 0 && nums[i-2] > nums[i])
	                    nums[i] = nums[i-1];
	                else
	                    nums[i-1] = nums[i];
	                count++;
	            }
	        }
	        return count <= 1;
	 }
}
