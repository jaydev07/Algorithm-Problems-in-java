import java.util.*;
public class Day3_4sum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        int i,j,left,right,add;
        
        //S1:- Sort the array
        Arrays.sort(nums);
        
        //S2:- use 4 pointers
        i=0;
        while(i<=nums.length-1){
            j=i+1;
            while(j<=nums.length-1){
                add=nums[i]+nums[j];
                left=j+1;
                right=nums.length-1;
                while(left<right){
                    if((nums[left]+nums[right]) < (target-add)){
                        left++;
                        while(left<right && nums[left]==nums[left-1]){
                            left++;   
                        }
                    }
                    else if((nums[left]+nums[right]) > (target-add)){
                        while(left<right && nums[right]==nums[right-1]){
                            right--;   
                        }
                        right--;
                    }
                    else{
                        // Pairs formed
                        List<Integer> arr= new ArrayList<Integer>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[left]);
                        arr.add(nums[right]);
                        res.add(arr);
                        
                        while(left<right && nums[left]==nums[left+1]){
                            left++;   
                        }
                        left++;
                        while(left<right && nums[right]==nums[right-1]){
                            right--;   
                        }
                        right--;
                    }   
                }
                while(j<=nums.length-2 && nums[j]==nums[j+1]){
                    j++;   
                }
                j++;
            }
            while(i<=nums.length-2 && nums[i]==nums[i+1]){
                i++;   
            }
            i++;
        }
        return res;
    }
}
