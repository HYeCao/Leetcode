/**
 * 
 */
package a_3_21;

/**
 * @author caohongye
 *给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
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
