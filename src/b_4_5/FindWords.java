package b_4_5;

import java.util.ArrayList;
import java.util.HashSet;

public class FindWords {
    public String[] findWords(String[] words) {
        String s1="qwertyuiopQWERTYUIOP";
        String s2="asdfghjklASDFGHJKL";
        String s3="zxcvbnmZXCVBNM";
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String jud=new String();
            if(s1.contains(String.valueOf(words[i].charAt(0))))jud="s1";
            else if(s2.contains(String.valueOf(words[i].charAt(0))))jud="s2";
            else jud="s3";
            String tem=new String();
            boolean bol=true;
            for(int j=0;j<words[i].length();j++){
                if(s1.contains(String.valueOf(words[i].charAt(j))))tem="s1";
                else if(s2.contains(String.valueOf(words[i].charAt(j))))tem="s2";
                else tem="s3";
                if(!tem.equals(jud))bol=false;
            }
            if(bol==true)list.add(words[i]);
        }
        String[] res=new String[list.size()];
        for(int i=0;i<list.size();i++)res[i]=list.get(i);
        return res;//list.toArray(new String[0]);
    }
}
