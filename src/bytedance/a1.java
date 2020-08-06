package bytedance;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * DD-MM-YYYY格式的年月日，问出现次数最多的是哪个？
 * 关键点：对所有格式数据的处理，如何排除不符合格式要求的数据
 */
public class a1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Map<String, Integer> map = new HashMap<>();
        String[] strs = str.split("-");
        if(strs.length < 2)return ;
        for(int i = 0; i<strs.length - 2 ; i++){
            int year = Integer.valueOf(strs[i+2]);
            int mon = Integer.valueOf(strs[i+1]);
            int day = Integer.valueOf(strs[i]);
            if(year >= 2001 && year <= 2020 && mon>=1 && mon <=12) {
                String tem = new String();
                if(strs[i].length()>2){
                    String da = strs[i].substring(strs[i].length()-2, strs[i].length());
                    tem = da +"-"+ strs[i + 1] +"-"+  strs[i + 2];
                }else {
                    tem = strs[i] + "-" + strs[i + 1] + "-" + strs[i + 2];
                }
                System.out.println(tem);
                if(map.get(tem) == null)map.put(tem, 1);
                else map.put(tem, map.get(tem)+1);
            }
        }
        int res = 0;
        String re = new String();
        for(String jud : map.keySet()){
            if(res < map.get(jud)){
                res = map.get(jud);
                re = jud;
            }
        }

    }
}
