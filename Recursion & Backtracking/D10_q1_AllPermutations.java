import java.util.*;
public class D10_q1_AllPermutations {
	public void recursion(int index,int a[], List<Integer> ds, List<List<Integer>> ans){
        if(index==a.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<a.length;i++){
            swap(i,index,a);
            ds.add(a[index]);
            recursion(index+1,a,ds,ans);
            swap(i,index,a);
            ds.remove(ds.size()-1);
        }
        
    }
    
    public void swap(int i,int j,int nums[]){
        int swap;
        swap=nums[j];
        nums[j]=nums[i];
        nums[i]=swap;
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        recursion(0,nums,new ArrayList<>(),ans);
        return ans;
    }
}
