import java.util.*;
public class Day13_q6_NextGreaterElement {
	public int[] nextGreaterElements(int[] nums) {
        // S1:- Naive Approach
//         int ans[],i,j;
//         ans=new int[nums.length];
        
//         for(i=0;i<nums.length;i++){
//             j=i+1;
//             while(j!=nums.length && nums[j]<=nums[i]){
//                 j++;
//             }
//             if(j==nums.length){
//                 j=0;
//                 while(j<i && nums[j]<=nums[i]){
//                     j++;
//                 }
//             }
//             if(j==i){
//                 ans[i]=-1;
//             }
//             else{
//                 ans[i]=nums[j];
//             }
//         }
        
//         return ans;
        
        // S2:- Using stack
        
        int i,ans[];
        ans=new int[nums.length];
        Stack<Integer> stack=new Stack<Integer>();
        
        for(i=(nums.length*2)-1;i>=0;i--){
            if(i>nums.length-1){
                while(stack.size()>0 && stack.peek()<=nums[i%nums.length]){
                    stack.pop();
                }
                stack.push(nums[i%nums.length]);
            }
            else{
                if(stack.size()==0){
                    ans[i]=-1;
                }
                else if(stack.peek()<=nums[i]){
                    while(stack.size()>0 && stack.peek()<=nums[i]){
                        stack.pop();
                    }
                    if(stack.size()==0){
                        ans[i]=-1;
                    }
                    else{
                        ans[i]=stack.peek();
                    }
                }
                else if(stack.peek()>nums[i]){
                    ans[i]=stack.peek();
                }
                stack.push(nums[i]);   
            }
        }
        
        return ans;
        
    }
}
