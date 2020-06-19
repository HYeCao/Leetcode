package a_3_25;

/**
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 * 完成所有替换操作后，请你返回这个数组。
 */
public class ReplaceElements {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int temp=0;
            if(i==arr.length-1){
                arr[i]=-1;
                break;
            }
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>temp)temp=arr[j];
            }
            arr[i]=temp;
        }
        return arr;
    }
}
