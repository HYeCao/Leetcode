package e_7July;

import java.util.HashSet;

public class ExpectNumber {
    public int expectNumber(int[] scores) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : scores){
            set.add(i);
        }
        return set.size();
    }
}
