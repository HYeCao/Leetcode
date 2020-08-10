package f_8August;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,9,56,90};
        twoSum(nums,8);
    }

    /**
     * 思路：双指针操作
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int index1 = 0;
        int index2 = numbers.length - 1;
        while(true){
            if((numbers[index1] + numbers[index2]) > target){
                index2--;
                System.out.println("index2: "+index2);
            }
            else if((numbers[index1] + numbers[index2]) < target){
                index1++;
                System.out.println("index1: "+index1);
            }else {
                break;
            }
        }
        System.out.println(index1+" "+index2);
        if(index1 > index2){
            res[1] = index1 + 1;
            res[0] = index2 + 1;
        }
        else {
            res[0] = index1 + 1;
            res[1] = index2 + 1;
        }
        return res;
    }
}
