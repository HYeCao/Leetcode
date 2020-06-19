package b_4_2;

public class ReverseWords {
    public String reverseWords(String s) {
        String res=new String();
        String tem=new String();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                tem+=s.charAt(i);
            }
            else {
                tem=rev(tem);
                res+=tem+" ";
                tem=new String();
            }
        }
        tem=rev(tem);
        res+=tem;
        return res;
    }
    public String rev(String s){
        String res=new String();
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
}
