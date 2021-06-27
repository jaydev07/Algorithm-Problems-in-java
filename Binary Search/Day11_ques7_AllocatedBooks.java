import java.util.*;
public class Day11_ques7_AllocatedBooks {
	public int books(ArrayList<Integer> A, int B) {
        int low=A.get(0),stud,sum,i,ans=-1;
        int high=0;
        for(i=0;i<A.size()-1;i++){
            if(low>A.get(i)){
                low=A.get(i);
            }
            high+=A.get(i);
        }
        System.out.println(high);
        while(low<=high){
            int mid=(low+high)/2;
            stud=1;
            sum=0;
            for(i=0;i<A.size()-1;i++){
                if((sum+A.get(i))>mid){
                    stud++;
                    sum=A.get(i);
                }
                else{
                    sum+=A.get(i);
                }
            }

            if(stud>B){
                low=mid+1;
            }
            else{
                high=mid-1;
                ans=mid;
            }
        }

        return ans;
    }
}
