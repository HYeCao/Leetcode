/**
 * 
 */
package a_3_21;

/**
 * @author caohongye
 *给你一个整数数组 nums，请你返回其中位数为 偶数 的数字的个数。
 */
public class FindNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int findNumbers(int[] nums) {
		 int res=0;
		 for(int i=0;i<nums.length;i++){
			 if(String.valueOf(nums[i]).length()%2==0)res++;
		 }
		 return res;
	}
}
