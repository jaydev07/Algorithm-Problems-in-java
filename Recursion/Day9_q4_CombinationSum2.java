import java.util.*;
public class Day9_q4_CombinationSum2 {
	public void recursion(int index,int target,int a[],List<Integer> ds,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=index;i<a.length;i++){
            if(i!=index && a[i]==a[i-1]){
                continue;
            }
            else if(a[i]<=target){
                ds.add(a[i]);
                recursion(i+1,target-a[i],a,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        recursion(0,target,candidates,new ArrayList<>(),ans);
        return ans;
    }
}
