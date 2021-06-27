import java.util.*;
public class Day8_ques2_MinPlatforms {
	public int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        int i,j,plat,max;
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        i=1;
        j=0;
        plat=1;
        max=1;
        while(i<n){
            if(arr[i]<=dep[j]){
                plat++;
                if(max<plat){
                    max=plat;
                }
                i++;
            }
            else{
                j++;
                plat--;
            }
        }
        return max;
    }
}
