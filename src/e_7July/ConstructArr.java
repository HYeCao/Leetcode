package e_7July;

public class ConstructArr {
    public int[] constructArr(int[] a) {
        if(a.length == 0)return new int[0];

        int[] b = new int[a.length];
        b[0] = 1;
        for(int i = 1; i < a.length; i++){
            b[i] = b[i-1] * a[i-1];
        }
        int tem = 1;
        for(int i = a.length-2; i >= 0; i--){
            b[i] = b[i]*tem * a[i+1];
            tem = tem * a[i+1];
        }
        return b;
    }
}
