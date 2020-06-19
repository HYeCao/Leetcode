package d_6June;

public class ProjectionArea {
    public static void main(String[] args) {
        int[][] re={{2}};
        projectionArea(re);
    }
    public static int projectionArea(int[][] grid) {
        int[] res1=new int[grid.length];
        int[] res2=new int[grid[0].length];
        int res3=0;
        int res=0;
        for(int i=0;i<grid.length;i++){
            int temp=0;
            for(int j=0;j<grid[i].length;j++){
                if(temp<grid[i][j])temp=grid[i][j];
                if(grid[i][j]!=0)res3++;
            }
            System.out.println(temp);
        res1[i]=temp;
        }
        for(int i=0;i<grid[0].length;i++){
            int temp=0;
            for(int j=0;j<grid.length;j++){
                if(temp<grid[j][i])temp=grid[j][i];
            }
            System.out.println(temp);
            res2[i]=temp;
        }
        for(int i=0;i<res1.length;i++)res+=res1[i];
        for(int j=0;j<res2.length;j++)res+=res2[j];
        res+=res3;
        System.out.println(res+" "+res3);
        return res;
    }
}
