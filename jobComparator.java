import java.util.*;
public class jobComparator implements Comparator<Job>{
    public int compare(Job j1,Job j2){
        if(j1.profit>j2.profit){
            return -1;
        }
        else if(j1.profit<j2.profit){
            return 1;
        }
        else if(j1.deadline<j2.deadline){
            return -1;
        }
        return 1;
    }
}
