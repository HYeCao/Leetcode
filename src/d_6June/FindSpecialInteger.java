package d_6June;

public class FindSpecialInteger {
    public int findSpecialInteger(int[] arr) {
        int tem=arr.length/4;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[i+tem])return arr[i];
        }
        return 0;
    }
}
