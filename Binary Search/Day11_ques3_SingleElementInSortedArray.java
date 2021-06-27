
public class Day11_ques3_SingleElementInSortedArray {
	public int singleNonDuplicate(int[] nums) {
        int low,high,temp;
        double mid;
        low=0;
        high=nums.length-1;
        while(high!=low){
            mid=(nums[low]+nums[high])/2.0;
            temp=high;
            while(nums[temp]>=mid){
                temp--;
            }
            
            if(temp%2==0){
                // odd behind(Lift side possibility)
                high=temp;
            }
            else{
                // odd ahead(Right side possibility)
                low=temp+1;
            }
        }
        
        return nums[high];
    }
}
