package b_4_13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 输入:
 * ["900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"]
 * 输出:
 * ["901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org",
 * "1 intel.mail.com","951 com"]
 *
 * 需要总结一下
 */
public class SubdomainVisits {
    public static void main(String[] args) {
        String[] str={"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        subdomainVisits(str);
    }
    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<cpdomains.length;i++){
            //首先对每一个字符串进行分割，获取数量以及字符串 再对字符串进行按点分割处理
            String[] temp=cpdomains[i].split(" ");
            int num=Integer.valueOf(temp[0]);
            String[] str=temp[1].split("\\.");//获取到目标分割字符串
            String st=str[str.length-1];
            if(map.get(st)!=null) {
                map.put(st, num+map.get(st));
            }
            else {
                map.put(st, num);
            }
            for(int j=str.length-2;j>=0;j--){
                if(map.get(str[j]+"."+st)!=null) {
                    map.put(str[j]+"."+st, num + map.get(str[j]+"."+st));
                    st = str[j]+"."+st;
                }
                else {
                    map.put(str[j]+"."+st,num);
                    st = str[j]+"."+st;
                }
            }
        }
        ArrayList<String> list=new ArrayList<>();
        for(String str:map.keySet()){
            System.out.println(map.get(str)+" "+str);
            list.add(map.get(str)+" "+str);
        }
        return list;
    }
}
