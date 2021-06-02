import java.util.*;
public class Repeat_and_Missing {
	public static void main(String args[]) {
		int i,n,a[],b[],c[],missing=-1,repeat=-1,max=0,sumOfArr=0,sum=0,squareSumOfArr=0, squareSum=0,x=0,y=0,div=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		n=sc.nextInt();
		a=new int[n];
		c=new int[n];
		System.out.println("Enter array elements:");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=(i+1);
			squareSum+=((i+1)*(i+1));
			sumOfArr+=a[i];
			squareSumOfArr += (a[i]*a[i]);
			if(a[i]>max) {
				max=a[i];
			}
		}
		b=new int[max+1];
		//S1:- Sorting the array using counting sort(but you have to use merge sort)
		for(i=0;i<n;i++) {
			b[a[i]]+=1;
		}
		for(i=1;i<=max;i++) {
			b[i]+=b[i-1];
		}
		System.out.println("\nArray B is:");
		for(i=0;i<=max;i++) {
			System.out.printf(" %d",b[i]);
		}
		for(i=n-1;i>=0;i--) {
			b[a[i]]-=1;
			c[b[a[i]]]=a[i];
		}
		System.out.println("\nSorted array is:");
		for(i=0;i<n;i++) {
			System.out.printf(" %d",c[i]);
		}
		
		for(i=1;i<n;i++) {
			if(c[i]==c[i-1]) {
				repeat=c[i];
			}else if(c[i] != (c[i-1] +1)) {
				missing=c[i-1]+1;
			}
		}
		System.out.printf("\nRepeating is %d, Missing is %d",repeat,missing);
		
		//S2:- Use hashing
		int h[];
		h=new int[max+1];
		for(i=0;i<n;i++) {
			h[a[i]]+=1;
		}
		for(i=1;i<=max;i++) {
			if(h[i]>1) {
				repeat=i;
			}else if(h[i]==0) {
				missing=i;
			}
		}
		System.out.printf("\nRepeating is %d,Missing is %d",repeat,missing);
		
		//S3:- Using maths sum, sum of squares, Best approach
		x=sum-sumOfArr;
		y=squareSum-squareSumOfArr;
		div=y/x;
		missing=(div+x)/2;
		repeat=div-missing;
		System.out.printf("\nRepeating is %d,Missing is %d",repeat,missing);
	}
}
