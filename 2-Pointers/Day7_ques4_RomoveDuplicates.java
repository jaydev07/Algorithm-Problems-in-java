
public class Day7_ques4_RomoveDuplicates {
	public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i,j;
        i=0;
        j=1;
        while(j<nums.length){
            if(nums[j]==nums[j-1]){
                j++;
            }else{
                // k++;
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }
}
