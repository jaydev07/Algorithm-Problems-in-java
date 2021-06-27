import java.util.*;
public class Sort_array_of_0_1_2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i,j,n,a[],b[],c[];
		System.out.println("Enter the length of array:");
		n=sc.nextInt();
		a = new int[n];
		b = new int[n];
		c = new int[n];
		System.out.println("Enter array elements:");
		
		//S1:- Using counting sort to sort the array of 0, 1 & 2
		for(i=0;i<n;i++) {
			a[i] = sc.nextInt();
			b[a[i]]+=1;
		}
		for(i=1;i<n;i++) {
			b[i]+=b[i-1];
		}
		for(i=n-1;i>=0;i--) {
			b[a[i]]=b[a[i]]-1;
			c[b[a[i]]]=a[i];
		}
		System.out.println("Sorted array is:");
		for(i=0;i<n;i++) {
			System.out.printf(" %d", c[i]);
		}
		
		//S2:- Using 3 pointers low,mid,high
		
		int l=0,m=0,h=n-1,swap;
		while(m!=h+1) {
			if(a[m]==0) {
				swap=a[m];
				a[m]=a[l];
				a[l]=swap;
				l++;
				m++;
			}else if(a[m]==1) {
				m++;
			}else if(a[m]==2) {
				swap=a[m];
				a[m]=a[h];
				a[h]=swap;
				h--;
			}
		}
		System.out.println("\nSorted array is:");
		for(i=0;i<n;i++) {
			System.out.printf(" %d",a[i]);
		}
		
	}
}
