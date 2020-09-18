package g_9September;

public class MinOperations {
    public static void main(String[] args) {
        System.out.println(minOperations(6));
    }
    public static int minOperations(int n) {
        int res = 0;
        int tem = 0;
        if(n % 2 == 0){
            tem = n / 2 - 1;
            for(int i = 0;i < tem; i++){
                res += (tem - i)*2;
            }
            return res + tem + 1;
        }
        else {
            tem = n / 2;
            for(int i = 0;i < tem; i++){
                res += (tem - i)*2;
            }
            return res;
        }
    }
}
