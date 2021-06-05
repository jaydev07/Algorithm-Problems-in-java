import java.util.*;
public class Day3_Power {
	public double myPow(double x, int n) {
        ArrayList<Double> a=new ArrayList<Double>();
        long n1=n;
        if(n1==0){
            return 1;
        }
        else if(n1<0){
            x=1/x;
            n1*=-1;
        }
        while(n1>1){
            if(n1%2==0){
                x*=x;
                n1/=2;
            }else{
                a.add(x);
                n1-=1;
            }
        }
        System.out.print(x);
        for(int i=0;i<a.size();i++){
            x*=a.get(i);
        }
        
        return x;
    }
}
