/**
 * 
 */
package a_3_21;

/**
 * @author caohongye
 *����һ������ nums����������ÿ��Ԫ�� nums[i]������ͳ�������б���С���������ֵ���Ŀ��
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
