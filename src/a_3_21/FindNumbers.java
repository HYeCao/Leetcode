/**
 * 
 */
package a_3_21;

/**
 * @author caohongye
 *����һ���������� nums�����㷵������λ��Ϊ ż�� �����ֵĸ�����
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
