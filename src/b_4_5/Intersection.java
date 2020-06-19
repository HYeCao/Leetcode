package b_4_5;

import java.util.ArrayList;
import java.util.HashSet;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet<>();
        for(int i:nums1)set1.add(i);
        HashSet<Integer> set2=new HashSet<>();
        for(int i:nums2)set2.add(i);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:set1){
            if(set2.contains(i))list.add(i);
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++)res[i]=list.get(i);
        return res;
    }
}
