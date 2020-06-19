/**
 * 
 */
package a_3_20;

/**
 * @author caohongye
 *输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
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
		int[] sort=new int[k];//此处注意该部分的设定大小
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
