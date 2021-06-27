import java.util.*;
public class Day11_ques8_AggresiveCows {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int i,cows,a[],n,high,low,min,max,mid,cowsAllocated,ans=-1;
		System.out.println("Enter no. of cows:");
		cows=sc.nextInt();
		System.out.println("Enter array length of barriers:");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter array elements:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		low=a[0];
		max=a[0];
		min=a[0];
		for(i=1;i<n;i++) {
			if((a[i]-a[i-1])<low) {
				low=a[i]-a[i-1];
			}
			if(min>a[i]) {
				min=a[i];
			}
			if(max<a[i]) {
				max=a[i];
			}
		}
		high=max-min;
		
		while(low<=high) {
			mid=(low+high)/2;
			cowsAllocated=0;
			min=a[0];
			for(i=1;i<n;i++) {
				if((a[i]-min)>=mid) {
					cowsAllocated+=1;
					min=a[i];
				}
				else{
					min=Math.min(a[i], min);
				}
			}
			cowsAllocated++;
			
			if(cowsAllocated<cows) {
				high=mid-1;
			}
			else {
				ans=mid;
				low=mid+1;
			}
		}
		
		System.out.printf("Max length of barriers are: %d",ans);
	}
}
