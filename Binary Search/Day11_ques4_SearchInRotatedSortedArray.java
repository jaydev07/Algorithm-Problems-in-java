
public class Day11_ques4_SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
        int low,mid,high;
        low=0;
        high=nums.length-1;
        while(low<high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            
            // Now check if the left array is sorted
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;   
                }
            }
            // If right is sorted
            else if(nums[mid]<=nums[high]){
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        if(nums[low]==target){
            return low;
        }
        else{
            return -1;
        }
    }
}
