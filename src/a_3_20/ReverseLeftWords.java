/**
 * 
 */
package a_3_20;

/**
 * @author caohongye
 * ‰»Î: s = "abcdefg", k = 2
 * ‰≥ˆ: "cdefgab"
 */
public class ReverseLeftWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String reverseLeftWords(String s, int n) {
		String a=new String();
		String b=new String();
		for(int i=0;i<n;i++){
			a=a+s.charAt(i);
		}
		for(int i=n;i<s.length();i++){
			b=b+s.charAt(i);
		}
		b=b+a;
		return b;
    }
}
