/**
 * 
 */
package a_3_21;

/**
 * @author caohongye
 *����һ������ n�������æ���㲢���ظ���������λ����֮�����롸��λ����֮�͡��Ĳ
 */
public class SubtractProductAndSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Integer.valueOf('1'));
		subtractProductAndSum(234);
	}
	public static int subtractProductAndSum(int n) {
		String str=String.valueOf(n);
		int add=0,mul=1,res=0;
		for(int i=0;i<str.length();i++){
			add=add+(Integer.valueOf(str.charAt(i))-48);
			mul=mul*(Integer.valueOf(str.charAt(i))-48);
		}
		res=mul-add;
		System.out.println(res);
		return res;
    }
}
