/**
 * 
 */
package a_3_18;

/**
 * @author caohongye
 *����һ������Ϊ n ���������飬����������ж������ı� 1 ��Ԫ�ص�����£��������ܷ���һ���ǵݼ����С�
 *��������������һ���ǵݼ����еģ� �������������е� i (1 <= i < n)������ array[i] <= array[i + 1]��
 *1 3 5 2 4
 *˼·�����׻��ĸ�Ԫ�أ������ĸ�λ�ã�
 *�������Ȼ���ټ���ǲ��Ƿǵݼ��ġ�
 *ʱ�临�ӶȽϸ�
 */
public class CheckPossibility {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * ǰ��Ԫ���滻��ϵ��ֱ��ѡ��ǰ�滻 ���Ǻ��滻
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
