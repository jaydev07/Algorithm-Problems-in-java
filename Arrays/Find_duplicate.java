
import java.util.*;

// FInd the duplicate number in an array
public class Find_duplicate {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i,j,n,arr[],f[];
		System.out.println("Enter the length of array:");
		n=sc.nextInt();
		arr = new int[n];
		f = new int[n];
		System.out.println("Enter array elements:");
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			f[i]=0;
		}
		
		// S1:- Sort the array and find the next one
		
		// S2:- Solution using hashing
		for(i=0;i<n;i++) {
			f[arr[i]]+=1;
			if(f[arr[i]]>1) {
				System.out.printf("\nNumber found %d",arr[i]);
			}
		}
		
		// S3:- Using Link List cycling method
		int slow=arr[0],fast=arr[0];
		do {
			slow=arr[slow];
			fast=arr[arr[fast]];
		}while(slow!=fast);
		fast=arr[0];
		while(slow!=fast) {
			slow=arr[slow];
			fast=arr[fast];
		}
		
		System.out.printf("\nNumber is %d",slow);
	}
}
