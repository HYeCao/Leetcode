package d_6June;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UncommonFromSentences {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String,Integer> map=new HashMap<>();
        for(String str:A.split(" ")){
            map.put(str, map.getOrDefault(str,0)+1);
        }
        for(String str:B.split(" ")){
            map.put(str, map.getOrDefault(str,0)+1);
        }
        List<String> list = new LinkedList<String>();
        for(Map.Entry<String, Integer> entry : map.entrySet())
            if(entry.getValue() == 1)
                list.add(entry.getKey());
        return list.toArray(new String[list.size()]);
    }
}
