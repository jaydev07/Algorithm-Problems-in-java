import java.util.*;
public class Day9_q5_PalindromePartitioning {
	public void recursion(int index,String s,List<String> ds,List<List<String>> ans){
        if(index==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        int j,k;
        for(int i=index;i<s.length();i++){
            j=index;
            k=i;
            while(j<=k){
                if(s.charAt(j)!=s.charAt(k)){
                    break;
                }
                j++;
                k--;
            }
            // Palindrome
            if(j>k){
                ds.add(s.substring(index,i+1));
                recursion(i+1,s,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        recursion(0,s,new ArrayList<>(),ans);
        return ans;
    }
}
