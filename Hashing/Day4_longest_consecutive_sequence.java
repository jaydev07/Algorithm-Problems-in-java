import java.util.*;
public class Day4_longest_consecutive_sequence {
	public int longestConsecutive(int[] nums) {
        int i,temp,currentCount,longestCount=0;
        Set<Integer> hashSet = new HashSet<Integer>();
        for(i=0;i<nums.length;i++){
            hashSet.add(nums[i]);
        }
        
        for(i=0;i<nums.length;i++){
            if(hashSet.contains(nums[i]-1)){
               continue; 
            }else{
                temp=nums[i];
                currentCount=1;
                while(hashSet.contains(temp+1)){
                    temp++;
                    currentCount++;
                }
                longestCount = Math.max(longestCount,currentCount);
            }
        }
        
        return longestCount;
    }
}
