package e_7July;

import java.util.*;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        System.out.println('a' - 97);
        String[] words = {"steps", "step", "plats"};
//        System.out.println("1s2p3S4t".toLowerCase()+" "+"1s2p3S4t".toLowerCase().toCharArray());
        shortestCompletingWord("1s2p3S4t",words);
    }
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        HashMap<Character, Integer> map = new HashMap<>();
        int len = 0;
        for(char ch : licensePlate.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                len++;
            }
        }
        List<String> list = new ArrayList<>();
        for(String str : words){
            list.add(str);
        }
        for(String str : list){
            if(str.length() >= len && judge(str, map)){
                return str;
            }
        }
        return null;
    }
    public static boolean judge(String str, HashMap<Character, Integer> jud){
        str = str.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i), 0)+1);
        }
        for(Character key : jud.keySet()){
            if(map.get(key) == null)return false;
            if(jud.get(key) > map.get(key))return false;
        }
        return true;
    }
}
