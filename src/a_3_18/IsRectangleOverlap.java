/**
 * 
 */
package a_3_18;

/**
 * �������б� [x1, y1, x2, y2] ����ʽ��ʾ������ (x1, y1) Ϊ���½ǵ����꣬(x2, y2) �����Ͻǵ����ꡣ
 * ����ཻ�����Ϊ��������������ص�����Ҫ��ȷ���ǣ�ֻ�ڽǻ�߽Ӵ����������β������ص���
 * ˼·������˼ά���ж�ʲô����²��ص������� ��һ��ֱ����Ϊ����
 * 
 * @author caohongye
 *
 */
public class IsRectangleOverlap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * ��������ǣ�������� ��1 ���µĵ������� 2 ���ϵĵ������� 3 �����㶼�����棨�����жϣ�
	 * ����˼ά��ֻ�жϲ��ص����������� �ϲ� �Ҳ� �²� һ��ֱ�����ж�
	 * @param rec1
	 * @param rec2
	 * @return
	 */
	public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
		if(rec2[2]<=rec1[0])return false;
		if(rec2[1]>=rec1[3])return false;
		if(rec2[3]<=rec1[1])return false;
		if(rec2[0]>=rec1[2])return false;
		return true;
    }
}
