import java.util.*;
public class Day8_ques1_NmeetingInOneRoom {
	public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        int i,ans=0,e=0;
        ArrayList<meeting> list=new ArrayList<meeting>();
        
        for(i=0;i<n;i++){
            list.add(new meeting(start[i],end[i],i));
        }
        
        meetingComparator mc=new meetingComparator();
        // Sorting the list according to the end
        Collections.sort(list, mc);
        
        for(i=0;i<n;i++){
            if(i==0){
                e=list.get(i).end;
                ans++;
            }
            else if(e<list.get(i).start){
                ans++;
                e=list.get(i).end;
            }
        }
        
        return ans;
    }
}
