
public class Set_matrix_zero {
	public void setZeroes(int[][] matrix) {
        int i=0,j=0,n,m,r[],c[];
        n=matrix.length;
        m=matrix[0].length;
        r= new int[m];
        c=new int[n];
        
        // Will update both the arrays with -1 when we get 0
        for(i=0;i<n;i++){
            for(j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    r[j]=-1;
                    c[i]=-1;
                }
            }
        }
        
        // Traverse the whole matrix and whenever there is -1 in any of the 2 arrays we will make it as 0 in matrix
        for(i=0;i<n;i++){
            for(j=0;j<matrix[i].length;j++){
                if(r[j]==-1 || c[i]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
