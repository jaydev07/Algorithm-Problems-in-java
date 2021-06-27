import java.util.*;
public class Day4_ques5_count_subarrays_xor {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n,a[],xor=0,count=0,k,i,temp,y;
		System.out.println("Enter length of array:");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("Enter array elements:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter value of xor:");
		k=sc.nextInt();
		
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
		for(i=0;i<n;i++) {
			xor=xor^a[i];
			// Putting the xor into the hashmap
			if(hashMap.get(xor) != null) {
				temp=hashMap.get(xor);
				hashMap.put(xor,temp+1);
			}else {
				hashMap.put(xor,1);
			}
			
			// If xor is equal to k incrementing the count
			if(xor==k) {
				count++;
			}
			
			// Implementing the login of y^k=xor => y=xor^k & is y is present in hashmap then incrementing the count by the y's cnt 
			y=xor^k;
			if(hashMap.get(y) != null) {
				count+=hashMap.get(y);
			}
		}
		System.out.printf("\nNo. of counts are: %d",count);
	}
}
