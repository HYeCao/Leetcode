package e_7July;

import java.util.HashMap;
import java.util.Map;

public class FindString {
    public int findString(String[] words, String s) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            map.put(words[i], i);
        }
        if(map.get(s) != null)return -1;
        return map.get(s);
    }
}
