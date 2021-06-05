import java.util.*;
public class Day3_majority_element {
	public int majorityElement(int[] nums) {
        int i,maxi=1,threshold=nums.length/2;
        
        // First sort the elements
        Arrays.sort(nums);
        
        for(i=1;i<nums.length;i++){
        	
        	// If the number repeats  then increment the count
            if(nums[i] == nums[i-1]){
                maxi+=1;
                if(maxi>threshold){
                    return nums[i];
                }
            }
            // Else reset the count
            else{
                maxi=1;
            }
        }
        
        return nums[0];
    }
}
