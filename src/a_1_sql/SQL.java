package a_1_sql;

import java.util.Scanner;

public class SQL {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.valueOf(scan.nextLine());
        String[] strs = new String[num];
        for (int i = 0; i < num; i++)
            strs[i] = scan.nextLine();
        String res="select zylbm,count(1) total_num,\n" +
                "sum(case when substr("+strs[0]+",1,4) = '2016' then 1 else 0 end ) y2016,\n" +
                "sum(case when substr("+strs[0]+",1,4) = '2017' then 1 else 0 end ) y2017,\n" +
                "sum(case when substr("+strs[0]+",1,4) = '2018' then 1 else 0 end ) y2018,\n"+
                "sum(case when substr("+strs[0]+",1,4) = '2019' then 1 else 0 end ) y2019,\n";
        for(int i=1;i<num-1;i++){
            res+="(100-round(sum(case  when "+ strs[i]+" is null or "+strs[i]+" = '' then 1 else 0 end)/count(1),3)*100)||'%' "+strs[i]+", \n";
        }
        res+="from "+"xkdsjpt_source."+strs[num-1]+"\n" +
                "group by zylbm";
        System.out.println(res);

    }
}
