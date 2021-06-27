import java.util.*;
public class day2_max_profit {
	public int maxProfit(int[] prices) {
        int maxi=prices[0],mini=prices[0],profit=0;
        for(int i=0;i<prices.length;i++){
            if(mini>prices[i]){
                mini=prices[i];
                maxi=prices[i];
            }
            if(prices[i]>maxi){
                maxi=prices[i];
                if(profit<(maxi-mini)){
                    profit=maxi-mini;   
                }
            }
        }
        return profit;
    }
}
