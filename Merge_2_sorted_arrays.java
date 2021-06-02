import java.util.*;
public class Merge_2_sorted_arrays {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		int i,n,m,a[],b[],j=0,swap=0,k=0;
		System.out.println("Enter Length of 1st array:");
		n=sc.nextInt();
		a=new int[n];
		System.out.println("\nEnter Length of 2nd array:");
		m=sc.nextInt();
		b=new int[m];
		System.out.println("\nEnter 1st array elements in sorted manner:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("\nEnter 2nd array elements in sorted manner:");
		for(i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		
		//S1:- Using Insertion sort
		i=0;
		j=0;
		while(i<n) {
			if(a[i]<b[j]) {
				i++;
			}else {
				swap=a[i];
				a[i]=b[j];
				b[j]=swap;
				k=j+1;
				while(b[k]<b[k-1]) {
					swap=b[k];
					b[k]=b[k-1];
					b[k-1]=swap;
					if(k==m-1) {
						break;
					}
					k++;
				}
				i++;
			}
		}
		System.out.println("\n Two arrays are:");
		for(i=0;i<n;i++){
			System.out.printf(" %d",a[i]);
		}
		System.out.println("");
		for(i=0;i<m;i++){
			System.out.printf(" %d",b[i]);
		}
	}
}
