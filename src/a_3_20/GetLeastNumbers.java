/**
 * 
 */
package a_3_20;

/**
 * @author caohongye
 *������������ arr ���ҳ�������С�� k ���������磬����4��5��1��6��2��7��3��8��8�����֣�����С��4��������1��2��3��4��
 */
public class GetLeastNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={3,2,1};
		getLeastNumbers(arr, 2);
	}
	public static int[] getLeastNumbers(int[] arr, int k) {
		int[] sort=new int[k];//�˴�ע��ò��ֵ��趨��С
		for(int i=0;i<arr.length-1;i++)
			for(int j=i;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		for(int i=0;i<k;i++){
			sort[i]=arr[i];
			System.out.println(sort[i]);
		}
		return sort;
    }
}
