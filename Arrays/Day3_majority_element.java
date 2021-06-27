import java.util.*;
public class Day3_majority_element {
	public int majorityElement(int[] nums) {
//      int i,maxi=1,threshold=nums.length/2;
//      Arrays.sort(nums);
//      for(i=1;i<nums.length;i++){
//          if(nums[i] == nums[i-1]){
//              maxi+=1;
//              if(maxi>threshold){
//                  return nums[i];
//              }
//          }else{
//              maxi=1;
//          }
//      }
     
//      return nums[0];
     
     // Using moore voting algo
     
     int i,count=0,ele=-1;
     
     for(i=0;i<nums.length;i++){
         if(count==0){
             ele=nums[i];
         }
         if(ele==nums[i]){
             count++;
         }else{
             count--;
         }
     }
     
     return ele;
 }
}
