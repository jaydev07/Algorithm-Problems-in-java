import java.util.*;
public class Day2_Pascals_triangle {
	public List<List<Integer>> generate(int numRows) {
		
		// To store arrays of integer
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int i,j;
        
        // To store integers in array
        List<Integer> row,pre = null;
        for(i=0;i<numRows;i++){
            row = new ArrayList<Integer>();
            for(j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                	// To get an element from the index
                    row.add(pre.get(j-1) + pre.get(j));
                }
            }
            pre=row;
            res.add(row);
        }
        return res;
    }
}
