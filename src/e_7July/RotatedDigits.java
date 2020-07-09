package e_7July;

public class RotatedDigits {
    public static void main(String[] args) {
//        rotatedDigits(10);
    }



    public static int rotatedDigits(int N) {
        int res = 0;
        for(int i = 0; i <= N; i++){
            if(judge(i) == true)res++;
        }
        return res;
    }
    public static boolean judge(int num){
        boolean bol = false;
        for(Character ch : String.valueOf(num).toCharArray()){
            if(ch == '3' || ch == '4' || ch == '7' )return false;
            if(ch == '2' || ch == '5' || ch == '6' || ch == '9' )bol = true;
        }
       return bol;
    }
}
