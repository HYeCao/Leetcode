package a_3_26;

import java.util.HashSet;
import java.util.Set;

/**
 * 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串，
 * 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。
 * 哈希的使用
 */
public class UniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> seen = new HashSet();
        for (String word : words) {
            StringBuilder code = new StringBuilder();
            for (char c : word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }
        return seen.size();
    }
}
