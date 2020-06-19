package c_5May;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(10%10);
        System.out.println(10/10);
//        System.out.println(addDigits(10));
    }
    public static int addDigits(int num) {
        if(num<10)return num;
        int res=0;
        while(num>=10){
            res +=num%10;
            num=num/10;
        }
        res +=num;
        return addDigits(res);
    }
}
