import java.util.*;
public class Day2_rotate_matrix {
	public void rotate(int[][] matrix) {
        int i=0,j=0,swap=0,k=0;
        
        // Transpost of matrix
        while(i<matrix.length){
            j=i;
            while(j<matrix[i].length){
                swap=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=swap;
                j++;
            }
            i++;
        }
        
        // Now reversing the matrix
        for(i=0;i<matrix.length;i++){
            k=matrix[i].length-1;
            for(j=0;j<(matrix[i].length/2);j++){
                swap=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=swap;
                k--;
            }
        }
    }
}
