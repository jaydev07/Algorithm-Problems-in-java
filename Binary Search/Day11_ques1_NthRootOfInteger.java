import java.util.*;
public class Day11_ques1_NthRootOfInteger {
	public static void main(String agrs[]) {
		Scanner sc=new Scanner(System.in);
		double n,m;
		double ans;
		System.out.println("Enter N:");
		n=sc.nextDouble();
		System.out.println("Enter M:");
		m=sc.nextDouble();
		
		Day11_ques1_NthRootOfInteger c=new Day11_ques1_NthRootOfInteger();
		ans=c.getNthRoot(n, m);
		System.out.printf("\nNth root is: "+ ans);
	}
	
	public double getNthRoot(double N,double M) {
		int i;
		double low,high,mid,esp,multi=1;
		low=1.0;
		high=M;
		esp=1e-6;
		
		while((high-low)>esp) {
			mid=(low+high)/2.0;
			multi=1;
			for(i=1;i<=N;i++) {
				multi*=mid;
			}
			
			if(multi>M) {
				high=mid;
			}
			else {
				low=mid;
			}
		}
		
		return high;
		
	}
}
