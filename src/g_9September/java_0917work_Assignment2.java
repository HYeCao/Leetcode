package g_9September;

import java.util.Scanner;

public class java_0917work_Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0; i < 10; i++){
            nums[i] = scanner.nextInt();
        }
        bubbleSort(nums);
        for(int i : nums)
        System.out.print(nums[i] + " ");
    }
    public static int[] bubbleSort(int[] nums){
        for(int i = 0 ; i < nums.length - 1; i++){
            for(int j = i ; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    int tem = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tem;
                }
            }
        }
        return nums;
    }
}
