package b_4_4;

public class NumRookCaptures {
    public int numRookCaptures(char[][] board) {
        int x=0,y=0,res=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='R'){
                    x=i;
                    y=j;
                }
            }
        }
        //前后左右四个方向进行判断
        for(int i=x;i>=0;i--){
            if(board[i][y]=='p'){
                res++;
                break;
            }
            else if(board[i][y]=='B')break;
        }
        for(int i=x;i<board.length;i++){
            if(board[i][y]=='p'){
                res++;
                break;
            }
            else if(board[i][y]=='B')break;
        }
        for(int i=y;i>=0;i--){
            if(board[x][i]=='p'){
                res++;
                break;
            }
            else if(board[x][i]=='B')break;
        }
        for(int i=y;i<board[x].length;i++){
            if(board[x][i]=='p'){
                res++;
                break;
            }
            else if(board[x][i]=='B')break;
        }
        return res;
    }
}
