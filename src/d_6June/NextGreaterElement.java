package d_6June;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    res[i]=-1;
                    for(int k=j;k<nums2.length;k++){
                        if(nums2[k]>nums1[i]){
                            res[i]=nums2[k];
                            k=nums2.length;
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        nextGreaterElement2(new int[]{2,4},new int[]{1,2,3,4});
    }
    public static int[] nextGreaterElement2(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        Map<Integer,Integer> map=new HashMap<Integer, Integer>() ;
        for(int i=0;i<nums2.length;i++){
            if(stack.isEmpty())stack.push(nums2[i]);
            else if(stack.peek()>=nums2[i])stack.push(nums2[i]);
            else if(stack.peek()<nums2[i]){
                while(stack.size()!=0&&stack.peek()<nums2[i]) {
                    map.put(stack.pop(), nums2[i]);
                }
                stack.push(nums2[i]);
            }
        }
        System.out.println(stack.size());
        while(stack.size()!=0){
            map.put(stack.pop(),-1);
        }
        System.out.println(map.size());
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}

