package a_3_17;

/**
 * @author caohongye
 *�ַ���ѹ���������ַ��ظ����ֵĴ�������дһ�ַ�����ʵ�ֻ������ַ���ѹ�����ܡ�
 *���磬�ַ���aabcccccaaa���Ϊa2b1c5a3������ѹ��������ַ���û�б�̣��򷵻�ԭ�ȵ��ַ���������Լ����ַ�����ֻ������СдӢ����ĸ��a��z����
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
