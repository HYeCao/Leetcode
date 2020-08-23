package f_8August;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
    public static String reverseOnlyLetters(String S) {
        ArrayList<Character> list = new ArrayList<>();
        Map<Integer, Character> mapCh = new HashMap<>();

        for(int i = 0 ; i < S.length(); i++){
            if(Character.isLetter(S.charAt(i))){
                list.add(S.charAt(i));
            }
            else {
                mapCh.put(i, S.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for(int i = 0; i < S.length(); i++){
            if(mapCh.get(i) != null)sb.append(mapCh.get(i));
            else {
                sb.append(list.get(list.size() - j - 1));
                j++;
            }
        }
        return sb.toString();
    }
}
