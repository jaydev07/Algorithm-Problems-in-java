import java.util.*;
public class Max_subarray_sum {
	public static void main(String arge[]) {
		Scanner sc = new Scanner(System.in);
		int i,n,a[],sum=0,maxi=0;
		System.out.println("Enter length of array:");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("\nEnter ayyay elements:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		//S1:- Kadane's Algo
		maxi=a[0];	
		for(i=0;i<n;i++) {
			sum+=a[i];
			if(sum<0) {
				sum=0;
			}
			if(sum>maxi) {
				maxi=sum;
				
			}
		}
		
		System.out.printf("\n Max value is: %d",maxi);
	}
}
