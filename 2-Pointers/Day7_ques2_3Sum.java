import java.util.*;
public class Day7_ques2_3Sum {
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        if(nums.length<3){
            return res;
        }
        int i,j,k;
        Arrays.sort(nums);
        i=0;
        while(i<=nums.length-3){
            j=i+1;
            k=nums.length-1;
            while(j<=nums.length-2 && k>=0 && j<k){
                if((nums[i]+nums[j]+nums[k])==0){
                    List<Integer> list=new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    res.add(list);
                    j++;
                    while(j<=nums.length-2 && nums[j]==nums[j-1]){
                        j++;
                    }
                }
                else if((nums[i]+nums[j]+nums[k])<0){
                    j++;
                    while(j<=nums.length-2 && nums[j]==nums[j-1]){
                        j++;
                    }
                }
                else{
                    k--;
                    while(k>j && nums[k]==nums[k+1]){
                        k--;
                    }
                }
            }
            i++;
            while(i<=nums.length-3 && nums[i]==nums[i-1]){
                i++;
            }
        }
        return res;
    }
}
