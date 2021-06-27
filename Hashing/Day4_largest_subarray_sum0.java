import java.util.*;
public class Day4_largest_subarray_sum0 {
	int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        int i,sum=0,max=0,index;
        for(i=0;i<n;i++){
            sum+=arr[i];
            
            // If the sum is zero then take all the elements till i
            if(sum==0){
                max=i+1;
            }
            // If the sum is not present in hashMap then add the (k,v) pair
            else if(hashMap.get(sum) == null){
                hashMap.put(sum,i);
            }
            // if the sum is present then get all the elements from i till the index of first ocurance of sum
            else if(hashMap.get(sum) != null){
                index=hashMap.get(sum);
                max = Math.max(max,i-index);
            }
        }
        
        return max;
    }
}
