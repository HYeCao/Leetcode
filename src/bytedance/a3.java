package bytedance;


import java.util.Scanner;

/**
 * 抽牌游戏：姐姐妹妹抽牌，第一个人可以抽任意张，但之后每个人抽只能是前一个人抽的2倍以下，问谁先抽完
 */
public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =Integer.valueOf(scanner.nextLine());
        int[] nums = new int[n];
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.valueOf(scanner.nextLine());
            if(nums[i] % 2 == 0)res++;
        }
        System.out.println(res);
    }
}
