package e_7July;

public class GcdOfStrings {
    public static void main(String[] args) {
        System.out.println(String.valueOf(2));
    }
    public String gcdOfStrings(String str1, String str2) {
        if((str1 + str2).equals(str2 + str1)){
            return str1.substring(0,get(str1.length(),str2.length()));
        }
        return "";
    }
    public int get(int a, int b){
        return b == 0? a : get(b, a%b);
    }
}
