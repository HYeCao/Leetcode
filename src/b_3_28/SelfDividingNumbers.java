package b_3_28;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=left;i<right+1;i++){
            if(judge(i)==true)list.add(i);
        }
        return list;
    }
    public static boolean judge(int num){
        String str=String.valueOf(num);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0')return false;
            else {
               if (num % (Integer.valueOf(str.charAt(i) - 48)) != 0) return false;
           }
        }
        return true;
    }
}
