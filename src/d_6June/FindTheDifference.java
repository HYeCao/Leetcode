package d_6June;

public class FindTheDifference {
    public static void main(String[] args) {
        char a=97;
        System.out.println(a);
    }
    public char findTheDifference(String s, String t) {
        int a=0,b=0;
        for(int i=0;i<t.length();i++){
            if(i!=s.length())
            a+=s.charAt(i)-96;
            b+=t.charAt(i)-96;
        }
        char res= (char) (b-a+96);
        return res;
    }
}
