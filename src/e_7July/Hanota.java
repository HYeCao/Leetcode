package e_7July;

import java.util.List;

/**
 * 分治思想：
 * 从最初的两个开始，逐个递增
 */
public class Hanota {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        han(A.size()-1, A, B, C);
    }
    public void han(int n, List<Integer> A, List<Integer> B, List<Integer> C){
        if(n == 1){
            C.add(A.get(A.size() - n));
            A.remove(A.size() - n);
        }else {
            han(n - 1, A, C, B);
//            C.add()
            A.remove(A.size() - 1);

        }
    }
}
