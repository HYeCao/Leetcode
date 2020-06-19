/**
 * 
 */
package a_3_17;

import java.io.CharArrayReader;
import java.util.HashMap;

/**
 * @author caohongye
 *��������� chars �еġ���ĸ�����ַ���ƴд�� words �е�ĳ�������ʡ����ַ���������ô���Ǿ���Ϊ��������������ʡ�
 *ע�⣺ÿ��ƴдʱ��chars �е�ÿ����ĸ��ֻ����һ�Ρ�
 *���شʻ�� words �������յ����е��ʵ� ����֮�͡�
 *��ϣ���Ӧ�ã��� / int[26]������
 */
public class CountCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ch=new int[26];
		ch['a']=1;
		System.out.println(ch[0]);
	}
	public int countCharacters(String[] words, String chars) {
	    int[] chars_count = count(chars); // ͳ����ĸ�����ĸ���ִ���
	    int res = 0;
	    for (String word : words) {
	        int[] word_count = count(word); // ͳ�Ƶ��ʵ���ĸ���ִ���
	        if (contains(chars_count, word_count)) {
	            res += word.length();
	        }
	    }
	    return res;
	}

	// �����ĸ�����ĸ���ִ����Ƿ񸲸ǵ��ʵ���ĸ���ִ���
	boolean contains(int[] chars_count, int[] word_count) {
	    for (int i = 0; i < 26; i++) {
	        if (chars_count[i] < word_count[i]) {
	            return false;
	        }
	    }
	    return true;
	}

	// ͳ�� 26 ����ĸ���ֵĴ���
	int[] count(String word) {
	    int[] counter = new int[26];
	    for (int i = 0; i < word.length(); i++) {
	        char c = word.charAt(i);
	        counter[c-'a']++;
	    }
	    return counter;
	}
}
