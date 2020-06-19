package a_3_17;

/**
 * @author caohongye
 *字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。
 *比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 */
public class CompressString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compressString("aabcccccaa");
	}
	public static String compressString(String S) {
		int num=1;
		if(S.length()==0)return null;
		char ch=S.charAt(0);
		String fin=new String();
		for(int i=1;i<S.length();i++){
			if(ch==S.charAt(i)){
				num++;
			}
			else {
				fin=fin+ch+num;
				num=1;
				ch=S.charAt(i);
			}
		}
		fin=fin+ch+num;
		System.out.println(fin+ " "+S);
		System.out.println(fin.length()+ " "+S.length());
		if(fin.length()>S.length())return S;
		else return fin;

    }
}
