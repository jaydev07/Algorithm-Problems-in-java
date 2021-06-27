import java.util.*;
public class Day2_count_inverse {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i,n,a[],temp[],inv_count;
		n=sc.nextInt();
		a=new int[n];
		temp=new int[n];
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		Day2_count_inverse c = new Day2_count_inverse();
		inv_count=c.merge_sort(a,temp,0,a.length-1);
		System.out.printf("\nInverse count is: %d",inv_count);
	}
	
	public int merge(int a[],int temp[],int left,int mid, int right) {
		int i,j,k,inv_count=0;
		i=left;
		j=mid;
		k=left;
		while(i<mid && j<=right) {
			if(a[i]<a[j]) {
				temp[k]=a[i];
				k++;
				i++;
			}else {
				temp[k]=a[j];
				k++;
				j++;
				
				// Logic of counting inverses
				inv_count+=mid-i;
			}
		}
		
		while(i<mid) {
			temp[k++]=a[i++];
		}
		while(j<=right) {
			temp[k++]=a[j++];
		}
		for(i=left;i<=right;i++) {
			a[i]=temp[i];
		}
		
		return inv_count;
	}
	
	public int merge_sort(int a[],int temp[],int left,int right) {
		int mid,inv_count=0;
		if(left<right) {
			mid=(left+right)/2;
			inv_count =merge_sort(a,temp,left,mid);
			inv_count =merge_sort(a,temp,mid+1,right);
			
			inv_count = merge(a,temp,left,mid+1,right);
		}
		return inv_count;
		
	}
}
