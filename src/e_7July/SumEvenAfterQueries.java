package e_7July;

public class SumEvenAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] res = new int[A.length];
        int tem = get(A);
        for(int i = 0; i < queries.length; i++){
            int form = A[queries[i][1]];
            if(form % 2 ==0){//前一个值为偶数的情况
                A[queries[i][1]] += queries[i][0];
                if(A[queries[i][1]] % 2 == 0 ) {
                    tem += queries[i][0] ;//调整后为偶数的情况

                }
                else {//调整后为奇数的情况
                    tem -= form;
                }
                res[i] = tem;
            }
            else {//前一个值为奇数的情况
                A[queries[i][1]] += queries[i][0];
                if(A[queries[i][1]] % 2 == 0 ) {
                    tem += A[queries[i][1]];
                }
                res[i] = tem;
            }
        }
        return res;
    }

    /**
     * 获取数组中的偶数值之和
     * @param A
     * @return
     */
    public int get(int[] A){
        int res = 0;
        for(int i : A){
            if(i % 2 == 0)res += i;
        }
        return res;
    }
}
