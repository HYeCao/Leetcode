/**
 * 
 */
package a_3_20;

/**
 * @author caohongye
 *num = 14
 *输出：6
 *步骤 1) 14 是偶数，除以 2 得到 7 。
 *步骤 2） 7 是奇数，减 1 得到 6 。
 *步骤 3） 6 是偶数，除以 2 得到 3 。
 *步骤 4） 3 是奇数，减 1 得到 2 。
 *步骤 5） 2 是偶数，除以 2 得到 1 。
 *步骤 6） 1 是奇数，减 1 得到 0 。
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
