import java.util.*;
public class Day9_q6_KthPermutationSequence {
	public void recursion(List<Integer> nums,StringBuffer ans,int permutation){
        // base case
        if(nums.size()==1){
            ans.append(Integer.toString(nums.get(0)));
            return;
        }
        // Calculating the permutations of the nums.size-1 elements 
        int p=1;
        for(int i=1;i<nums.size();i++){
            p*=i;
        }
        // Adding that perticular element in ans
        ans.append(Integer.toString(nums.get(permutation/p)));
        // Removing thaat element from the data structire
        nums.remove(permutation/p);
        // Calling recursion for next permutations
        recursion(nums,ans,permutation%p);
    }
    
    public String getPermutation(int n, int k) {
        List<Integer> nums=new ArrayList<>();
        StringBuffer ans=new StringBuffer();
        // Adding the numbers into the datastructire
        for(int i=0;i<n;i++){
            nums.add(i+1);
        }
        
        recursion(nums,ans,k-1);
        return ans.toString();
    }
}
