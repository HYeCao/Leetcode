package f_8August;

public class Search {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 2));
    }
    /**
     * 典型的二分查找
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        int le = 0;
        int ri = nums.length - 1;
        while(le <= ri){
            int mid = (le + ri)/2;
            if(nums[mid] > target){
                ri = mid - 1;
            }else if(nums[mid] < target){
                le = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
