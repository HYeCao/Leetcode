/**
 * 
 */
package a_3_18;

/**
 * @author caohongye
 * ����������Сд��ĸ���ɵ��ַ��� A �� B ��ֻҪ���ǿ���ͨ������ A �е�������ĸ�õ��� B ��ȵĽ�����ͷ��� true �����򷵻� false
 * ˼·���ص�Ϊ�س�����Ŀ��ǣ�ע����������Ŀ��� 
 */
public class BuddyStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(buddyStrings("abc", "bca"));
	}
	 public static boolean buddyStrings(String A, String B) {
			 char[] ch1=A.toCharArray();
			 char[] ch2=B.toCharArray();
			 int time=0;
			 char x = 0,y = 0,m = 0,n = 0;
			 for(int i=0;i<ch1.length;i++){
				 if(ch1[i]!=ch2[i]&&time==0){
					 time++;
					 x=ch1[i];
					 m=ch2[i];
				 }
				 else if(ch1[i]!=ch2[i]){
					 if(time>=2)return false;
					 time++;
					 y=ch1[i];
					 n=ch2[i];
				 }
				 else if(ch1[i]==ch2[0]&&A.equals(B)){
					 time++;
				 }
			 }
//			 System.out.println(time);
			if(time==B.length()&time!=2)return true;
			 if(time==2&&x==n&&y==m)return true;
			 else return false;
	}
}
