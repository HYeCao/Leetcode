package a_3_27;

import java.util.Stack;

public class FreqAlphabets {
    public static void main(String[] args) {
        int i='1';
        System.out.println(i);
    }
    public String freqAlphabets(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '#') {
                stack.push((char) (chars[i] - '0' + 96)); // a的ASCII为97
            } else {
                stack.pop();
                stack.pop();
                int digit = (chars[i-2] - '0') * 10 + chars[i-1] - '1';
                char letter = (char) (digit + 'a');
                stack.push(letter);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character C : stack) {
            sb.append(C);
        }
        return sb.toString();
    }
}
