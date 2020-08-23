package f_8August;

import java.util.Arrays;

public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int k = 0;
        int res = 0;
        for(int i = 0 ; i < g.length ; i++){
            boolean bol = false;
            for(int j = k; j < s.length; j++){
                if(s[j] >= g[i]){
                    bol = true;
                    k = j + 1;
                    j = s.length;
                }
            }
            if(bol == true){
                res++;
            }
        }
        return res;
    }
}
