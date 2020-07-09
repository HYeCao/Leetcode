package e_7July;

public class IsHappy {
    public static void main(String[] args) {
//        System.out.println(3/10);
        isHappy(19);
    }

    public static boolean isHappy(int n) {
        int res = 0;
        int time=0;
        while(n != 1){
            n = get(n);
            time++;
            System.out.println(n+" "+time);
            if(time > 10)return false;
        }
        return true;
    }
    public static int get(int n){
        int res = 0;
        while(n != 0){
            res += (n%10)*(n%10);
            n = n/10;
        }
        res += (n%10)*(n%10);
        return res;
    }
}
