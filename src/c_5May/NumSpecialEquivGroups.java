package c_5May;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class NumSpecialEquivGroups {
    public int numSpecialEquivGroups(String[] A) {
        //字符串拼接 Set的使用
        HashSet<String> set=new HashSet<>();
        for(String str:A){
            String odd="",even="";
            for(int i=0;i<str.length();i++){
                if(i%2==0){
                    even +=str.charAt(i);
                }
                else odd+=str.charAt(i);
            }
            char[] odds= odd.toCharArray();
            Arrays.sort(odds);
            char[] evens=even.toCharArray();
            Arrays.sort(evens);
            set.add(new String(odds)+new String(evens));
        }
        return set.size();
    }
}
