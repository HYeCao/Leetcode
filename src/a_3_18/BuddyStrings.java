/**
 * 
 */
package a_3_18;

/**
 * @author caohongye
 * 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false
 * 思路：重点为特出情况的考虑，注意特殊情况的考虑 
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
