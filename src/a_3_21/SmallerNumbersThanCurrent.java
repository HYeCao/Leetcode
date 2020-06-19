/**
 * 
 */
package a_3_21;

/**
 * @author caohongye
 *给你一个数组 nums，对于其中每个元素 nums[i]，请你统计数组中比它小的所有数字的数目。
 */
public class SmallerNumbersThanCurrent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[] smallerNumbersThanCurrent(int[] nums) {
		 int[] res=new int[nums.length];
		 for(int i=0;i<nums.length;i++){
			 int temp=0;
			 for(int j=0;j<nums.length;j++){
				 if(nums[i]>nums[j])temp++;
			 }
			 res[i]=temp;
		 }
		 return res;
	}
}
