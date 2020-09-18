package g_9September;

import java.util.Scanner;

public class java_0917work_Assignment1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(fib(scan.nextInt()));
    }
    public static int fib(int n){
        if(n == 1 || n == 2)return 1;
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
