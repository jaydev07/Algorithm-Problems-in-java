import java.util.*;
public class Day9_q2_Subsets2 {
	
    public void recursion(int index, int nums[],List<Integer> ds,List<List<Integer>> ans){
    	// Initially add the data-structur into the ans list
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<nums.length;i++){
        	// Check for the duplicates
            if(i!=index && nums[i]==nums[i-1]){
                continue;
            }
            // Add the element into list
            ds.add(nums[i]);
            // Go for child recursion
            recursion(i+1,nums,ds,ans);
            // Remove the added element & go for recursion using for loop
            ds.remove(ds.size()-1);
            
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList();
        recursion(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}
