import java.util.*;
import java.util.LinkedList;
public class D10_q2_NQueen {
	public void recursion(int col,int n,int LR[],int UD[],int LD[],char board[][],List<List<String>> ans){   
        if(col==n){
            ans.add(constructList(board));
            return;
        }
        
        for(int row=0;row<n;row++){
            if(LR[row]==0 && UD[(n-1)+(col-row)]==0 && LD[row+col]==0){
                board[row][col]='Q';
                LR[row]=1;
                UD[(n-1)+(col-row)]=1;
                LD[row+col]=1;
                recursion(col+1,n,LR,UD,LD,board,ans);
                board[row][col]='.';
                LR[row]=0;
                UD[(n-1)+(col-row)]=0;
                LD[row+col]=0;
            }
        }
    }
    
    public List<String> constructList(char board[][]){
        List<String> res=new LinkedList<String>();
        for(int i=0;i<board.length;i++){
            String s=new String(board[i]);
            res.add(s);
        }
        return res;
    }
    
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        int leftRow[],leftUpperDiag[],leftLowerDiag[];
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        leftRow=new int[n];
        leftUpperDiag=new int[2*n-1];
        leftLowerDiag=new int[2*n-1];
        recursion(0,n,leftRow,leftUpperDiag,leftLowerDiag,board,ans);
        return ans;
    }
}
