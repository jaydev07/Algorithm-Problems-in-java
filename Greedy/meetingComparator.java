import java.util.*;
public class meetingComparator implements Comparator<meeting>{
	public int compare(meeting m1, meeting m2){
        // if already sorted
        if(m1.end < m2.end){
            return -1;
        }
        else if(m1.end > m2.end){
            return 1;
        }
        // if both are equal then store according to index
        else if(m1.pos < m2.pos){
            return -1;
        }
        return 1;
    }
}
