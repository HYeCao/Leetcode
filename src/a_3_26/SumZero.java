package a_3_26;

public class SumZero {
    public int[] sumZero(int n) {
        int[] res=new int[n];
        if(n%2==0){
            for(int i=0;i<n;i++){
                res[i]=i+1;//注意 开始第一个值 为0 的情况
                res[i+1]=-(i+1);
                i++;
            }
        }
        else {
            res[0]=0;
            for(int i=1;i<n;i++){
                res[i]=i;
                res[i+1]=-i;
                i++;
            }
        }
        return res;
    }
}
