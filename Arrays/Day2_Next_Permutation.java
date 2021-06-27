import java.util.*;
public class Day2_Next_Permutation {
	public void nextPermutation(int[] nums) {
        int i,ind1=-1, ind2=-1,swap,mid,k;
        for(i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind1=i;
                break;
            }
        }
        for(int j=nums.length-1;j>ind1;j--){
            if(ind1!=-1 && nums[j]>nums[ind1]){
                ind2=j;
                break;
            }
        }
        if(ind1!=-1){
            swap=nums[ind1];
            nums[ind1]=nums[ind2];
            nums[ind2]=swap;    
        }
        mid=(nums.length-(ind1+1))/2;
        mid+=ind1;
        k=0;
        for(i=ind1+1;i<=mid;i++){
            swap=nums[i];
            nums[i]=nums[nums.length-1-k];
            nums[nums.length-1-k]=swap;
            k++;
        }
    }
}
