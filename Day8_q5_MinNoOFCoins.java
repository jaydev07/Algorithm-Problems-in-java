import java.util.*;
public class Day8_q5_MinNoOFCoins {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=0,i,v;
		int coins[]= {1000,500,100,50,20,10,5,2,1};
		
		System.out.println("Enter the value:");
		v=sc.nextInt();
		
		i=0;
		while(v>0) {
			if(coins[i]>v) {
				i++;
			}
			else {
				t++;
				v-=coins[i];
			}
		}
		
		System.out.printf("Total coins needed is: %d", t);
	}
}
