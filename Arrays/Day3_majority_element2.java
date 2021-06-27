import java.util.*;
public class Day3_majority_element2 {
	public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int n1=-1,n2=-1,c1=0,c2=0,i;
        boolean check1=true,check2=true;
        
        for(i=0;i<nums.length;i++){
            if(nums[i] == n1){
                c1++;
            }
            else if(nums[i] == n2){
                c2++;
            }
            else if(c1==0){
                n1=nums[i];
                c1=1;
            }
            else if(c2==0){
                n2=nums[i];
                c2=1;
            }
            else{
                c1--;
                c2--;
            }
        }
        
        c1=0;
        c2=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==n1 && check1){
                c1++;
                if(c1>(nums.length/3)){
                    res.add(n1);
                    check1=false;
                }
            }else if(nums[i]==n2 && check2){
                c2++;
                if(c2>(nums.length/3)){
                    res.add(n2);
                    check2=false;
                }
            }    
        }
        
        return res;
    }
}
