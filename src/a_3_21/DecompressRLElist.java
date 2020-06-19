package a_3_21;

import java.util.ArrayList;

public class DecompressRLElist {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        decompressRLElist(nums);
    }
    public static int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<nums.length;i=i+2){
           for(int j=0;i<nums[i];i++){
               list.add(nums[i+1]);
           }
           i=i+1;
       }
       int[] res=new int[list.size()];
       for(int i=0;i<list.size();i++){
           res[i]=list.get(i);
       }

       return res;
    }
}
