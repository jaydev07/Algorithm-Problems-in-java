import java.util.*;
public class Day8_ques3_JobSequencing {
	public int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        int i,j,ans[],max=0,job[],profit=0,t;
        ans=new int[2];
        for(i=0;i<n;i++){
            if(max<arr[i].deadline){
                max=arr[i].deadline;
            }
        }
        job=new int[max+1];
        jobComparator jc=new jobComparator();
        Arrays.sort(arr,jc);
        
        job[arr[0].deadline]=arr[0].profit;
        t=1;
        profit+=arr[0].profit;
        for(i=1;i<n;i++){
            j=arr[i].deadline;
            while(j>0 && job[j]>0){
                j--;
            }
            if(j>0){
                job[j]=arr[i].profit;
                profit+=arr[i].profit;
                t++;
            }
        }
        
        ans[0]=t;
        ans[1]=profit;
        return ans;
    }
}
