import java.util.*;

public class Day4_2Sum {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        int i=0,rem,arr[];
        arr=new int[2];
        
        for(i=0;i<nums.length;i++){
            rem=target-nums[i];
            if(hash.get(rem)!=null && i!=hash.get(rem)){
                arr[0]=i;
                arr[1]=hash.get(rem);
                break;
            }else{
                hash.put(nums[i],i);
            }
        }
        
        return arr;
    }
}
