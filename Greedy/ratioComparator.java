import java.util.*;
public class ratioComparator implements Comparator<ratio>{
    public int compare(ratio r1,ratio r2){
        if(r1.r>r2.r){
            return -1;
        }
        else if(r1.r<r2.r){
            return 1;
        }
        else{
            return -1;   
        }
    }
}
