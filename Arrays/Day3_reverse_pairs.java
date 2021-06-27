import java.util.*;

public class Day3_reverse_pairs {
	public int reversePairs(int[] nums) {
//      int i,j,maxi=nums[0],thres,count=0,v,mini=nums[nums.length-1];
//      HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
     
//      for(i=nums.length-1;i>=0;i--){
//          if(mini>nums[i]){
//              mini=nums[i];
//          }
         
//          if(hash.get(nums[i]) != null){
//              v=hash.get(nums[i]);
//              hash.put(nums[i],v+1);
//          }else{
//              hash.put(nums[i],1);
//          }
         
//          thres=nums[i]/2;
//          if(nums[i]%2==0){
//              for(j=thres-1;j>=mini;j--){
//                  if(hash.get(j) != null){
//                      count+=hash.get(j);
//                      if(j==nums[i]){
//                          count--;
//                      }
//                  }
//              }
//          }else{
//              for(j=thres;j>=mini;j--){
//                  if(hash.get(j) != null){
//                      count+=hash.get(j);  
//                      if(j==nums[i]){
//                          count--;
//                      }
//                  }
//              }
//          }
//      }
     
//      return count;
     
     int count=0;
     count = merge_sort(nums,0,nums.length-1);
     return count;
 }
 
 public int merge(int nums[],int l,int mid,int h){
     int i,j,count=0;
     j=mid+1;
     double d=0;
     
     // Logic
     for(i=l;i<=mid;i++){
         d=nums[i];
         d/=2;
         while(j<=h && d>nums[j]){
             j++;
         }
         count+=j-(mid+1);
     }
     
     ArrayList<Integer> temp=new ArrayList<Integer>();
     i=l;
     j=mid+1;
     while(i<=mid && j<=h){
         if(nums[i]<=nums[j]){
             temp.add(nums[i]);
             i++;
         }else{
             temp.add(nums[j]);
             j++;
         }
     }
     while(i<=mid){
         temp.add(nums[i]);
         i++;
     }
     while(j<=h){
         temp.add(nums[j]);
         j++;
     }
     
     
     for(i=l;i<=h;i++){
         nums[i]=temp.get(i-l);
     }
     
     return count;
 }
 
 public int merge_sort(int nums[],int l,int h){
     int mid,count=0;
     if(l<h){
         mid=(l+h)/2;
         count=merge_sort(nums,l,mid);
         count+=merge_sort(nums,mid+1,h);
         count+=merge(nums,l,mid,h);
     }
     return count;
 }
}
