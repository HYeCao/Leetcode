package b_4_6;

import java.util.ArrayList;

public class ExchangeBits {
    public static void main(String[] args) {
        exchangeBits(1);
    }
    public static int exchangeBits(int num) {
        String str=Integer.toBinaryString(num);
        if(str.length()%2==1)str="0"+str;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length()-1;i=i+2){
            sb.append(str.charAt(i+1));
            sb.append(str.charAt(i));
        }
        str=sb.toString();
        num=Integer.valueOf(str,2);
        return num;
    }
}
