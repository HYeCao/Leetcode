package c_5May;

public class FindLUSlength {
    public int findLUSlength(String a, String b) {
        if(a.length()!=b.length()){
            if(a.length()>b.length())return a.length();
            else return b.length();
        }
        else {
            if(a.equals(b))return -1;
            else return a.length();
        }
    }
}
