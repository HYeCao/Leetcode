package e_7July;

import java.util.ArrayList;
import java.util.List;

public class StringMatching {
    public static void main(String[] args) {
        System.out.println("leetcode".contains("code"));
    }
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(i != j && words[j].contains(words[i])){
                    list.add(words[i]);
                    j = words.length;
                }
            }
        }
        return list;
    }
}
