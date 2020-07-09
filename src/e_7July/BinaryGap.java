package e_7July;

public class BinaryGap {
    public static void main(String[] args) {
        System.out.println(binaryGap(15));
    }
    public static int binaryGap(int N) {
        String str = Integer.toBinaryString(N);
        System.out.println(str);
        int res = 0;
        int a = 0, b = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '1'){
                a = i;
                break;
            }
        }
        for(int i = a+1; i < str.length(); i++){
            if(str.charAt(i) == '1'){
                if(res < (i - a)){
                    System.out.println(res);
                    res = i - a;
                }
                a = i;
            }
        }
        return res;
    }
}
