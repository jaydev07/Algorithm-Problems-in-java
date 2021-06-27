
public class Day7_ques5_MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int i,cnt=0,max=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnt++;
            }else{
                if(max<cnt){
                    max=cnt;
                }
                cnt=0;
            }
        }
        if(max<cnt){
            max=cnt;
        }
        return max;
    }
}
