package b_3_28;

/**
 * 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
 * 	字符（'a' - 'i'）分别用（'1' - '9'）表示。
 * 	字符（'j' - 'z'）分别用（'10#' - '26#'）表示。
 * 返回映射之后形成的新字符串。
 * 题目数据保证映射始终唯一。
 */
public class FreqAlphabets {
    public static void main(String[] args) {
        freqAlphabets("10#12#12");
    }
    public static String freqAlphabets(String s) {
        String str=new String();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='#'){
                String temp=""+s.charAt(i-2)+s.charAt(i-1);
                System.out.println(temp);
                if(temp.equals("10"))str=str+"j"; if(temp.equals("11"))str=str+"k"; if(temp.equals("12"))str=str+"l"; if(temp.equals("13"))str=str+"m";
                if(temp.equals("14"))str=str+"n"; if(temp.equals("15"))str=str+"o"; if(temp.equals("16"))str=str+"p"; if(temp.equals("17"))str=str+"q";
                if(temp.equals("18"))str=str+"r"; if(temp.equals("19"))str=str+"s"; if(temp.equals("20"))str=str+"t"; if(temp.equals("21"))str=str+"u";
                if(temp.equals("22"))str=str+"v"; if(temp.equals("23"))str=str+"w"; if(temp.equals("24"))str=str+"x"; if(temp.equals("25"))str=str+"y";
                if(temp.equals("26"))str=str+"z";
                System.out.println(str);
                i=i-2;
            }
            else {
                if(s.charAt(i)=='1')str=str+"a";if(s.charAt(i)=='2')str=str+"b";
                if(s.charAt(i)=='3')str=str+"c";if(s.charAt(i)=='4')str=str+"d";
                if(s.charAt(i)=='5')str=str+"e";if(s.charAt(i)=='6')str=str+"f";
                if(s.charAt(i)=='7')str=str+"g";if(s.charAt(i)=='8')str=str+"h";
                if(s.charAt(i)=='9')str=str+"i";
            }
        }
        String res=new String();
        for(int i=0;i<str.length();i++){
            res=res+str.charAt(str.length()-i-1);
        }
        return res;
    }
}
