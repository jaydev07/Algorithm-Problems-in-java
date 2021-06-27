import java.util.*;
public class Day1_Merge_Intervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> finalList = new ArrayList<>();
        
        // Checkign if the array is nul or not
        if(intervals.length==0 || intervals==null){
            return finalList.toArray(new int[0][]);
        }
        
        // Sorting the array
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        
        // Taking two pointers start and end
        int s=intervals[0][0];
        int e=intervals[0][1];
        
        for(int[] i: intervals){
            if(e>=i[0]){
                e = Math.max(e,i[1]);
            }else{
                finalList.add(new int[]{s,e});
                s=i[0];
                e=i[1];
            }
        }
        
        finalList.add(new int[]{s,e});
        return finalList.toArray(new int[0][]);
    }
}
