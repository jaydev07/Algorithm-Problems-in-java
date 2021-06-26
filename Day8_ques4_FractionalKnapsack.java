import java.util.*;
public class Day8_ques4_FractionalKnapsack {
	//Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        int i,wc=0,rem;
        double profit=0;
        ArrayList<ratio> list=new ArrayList<ratio>();
        
        for(i=0;i<n;i++){
            list.add(new ratio(arr[i].value,arr[i].weight,arr[i].value/arr[i].weight));
        }
        
        ratioComparator rc=new ratioComparator();
        Collections.sort(list,rc);
        
        i=0;
        while(i<n && wc<W){
            if((wc+list.get(i).weight)<=W){
                profit+=list.get(i).value;
                wc+=list.get(i).weight;
            }else{
                profit+=(list.get(i).value*(W-wc))/list.get(i).weight;
                wc=W;
            }
            i++;
        }
        
        return profit;
    }
}
