import java.util.*;
public class Day3_search_matrix {
	public boolean searchMatrix(int[][] matrix, int target) {
        int i,j,l,h,m,mR,s,e;
        l=0;
        h=matrix.length-1;
        if(target<matrix[l][0]){
            return false;
        }
        if(l!=h){
            while(l<h){
                m=(h+l)/2;
                if(target==matrix[m][0]){
                    return true;
                }
                else if(target<matrix[m][0]){
                    h=m-1;    
                }else{
                    if(target>matrix[m][matrix[m].length-1]){
                        l=m+1;    
                    }else if(target==matrix[m][matrix[m].length-1]){
                        return true;
                    }else{
                        l=m;
                        break;
                    }
                    
                }
            }   
        }
        s=0;
        e=matrix[l].length-1;
        if(target<matrix[l][s]){
            return false;
        }
        while(s<e){
            mR=(s+e)/2;
            if(target==matrix[l][mR]){
                return true;
            }
            else if(target<matrix[l][mR]){
                e=mR-1;
            }else{
                s=mR+1;
            }
        }
        
        if(target == matrix[l][s]){
            return true;
        }else{
            return false;
        }
        
    }
}
