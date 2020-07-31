package e_7July;

/**
 * 输入：[1,0,2,3,0,4,5,0]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
 */
public class DuplicateZeros {
    public static void main(String[] args) {
        duplicateZeros2(new int[]{1,0,2,3,0,4,5,0});
    }
    public static void duplicateZeros(int[] arr) {

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                for(int j = arr.length - 1; j > i; j--){
                    arr[j] = arr[j -1];
                    System.out.println(arr[j]+" "+arr[j-1]);
                }
                i++;
            }
        }
    }

    /**
     * 双指针 快慢指针的操作，关键点：特殊值的处理
     * @param arr
     */
    public static void duplicateZeros2(int[] arr) {
       int i = 0;
       int j = 0;
       for(; i < arr.length; i++){
           if(arr[i] == 0){
               i++;
           }
           j++;
       }
        System.out.println(i);
       i--;
        System.out.println(i+" + "+j );
        if(i == arr.length){
            arr[i--] = arr[j--];
        }
       while(i > j){
           if(arr[j] == 0) {
               System.out.println(i+" "+j);
               arr[i--] = arr[j];
               arr[i--] = arr[j--];
           }
           else {
               arr[i--] = arr[j--];
           }
       }
       for( int a : arr){
           System.out.print(a+" ");
       }

    }
}
