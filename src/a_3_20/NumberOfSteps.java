/**
 * 
 */
package a_3_20;

/**
 * @author caohongye
 *num = 14
 *�����6
 *���� 1) 14 ��ż�������� 2 �õ� 7 ��
 *���� 2�� 7 ���������� 1 �õ� 6 ��
 *���� 3�� 6 ��ż�������� 2 �õ� 3 ��
 *���� 4�� 3 ���������� 1 �õ� 2 ��
 *���� 5�� 2 ��ż�������� 2 �õ� 1 ��
 *���� 6�� 1 ���������� 1 �õ� 0 ��
 */
public class NumberOfSteps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int numberOfSteps (int num) {
		int step=0;
		while(true){
			if(num%2==0){
				step++;
				num=num/2;
			}
			else {
				num=num-1;
				step++;
				if(num==0)return step;
			}
		}
    }
}
