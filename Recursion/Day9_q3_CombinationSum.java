import java.util.*;
public class Day9_q3_CombinationSum {
	public void recursion(int index,int target,int a[],List<Integer> ds,List<List<Integer>> ans){
        if(index==a.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(a[index]<=target){
            // Item is picked
            ds.add(a[index]);
            recursion(index,target-a[index],a,ds,ans); 
            ds.remove(ds.size()-1);
        }
        // Item is not picked
        recursion(index+1,target,a,ds,ans);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int i,j;
        List<List<Integer>> ans=new ArrayList<>();
        recursion(0,target,candidates,new ArrayList<>(),ans);
        return ans;
    }
}
