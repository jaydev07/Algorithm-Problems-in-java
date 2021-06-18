
public class Day6_ques3_ReverseNodesInK_groups {
	public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1){
            return head;
        }
        int i;
        ListNode a[]= new ListNode[k];
        // Allocate all the nodes initially
        a[0]=head;
        for(i=1;i<k;i++){
            a[i]=a[i-1].next;
        }
        ListNode newHead=a[k-1];
        ListNode temp;
        
        while(a[0]!=null){
            a[0].next=a[k-1].next;
            temp=a[0];
            for(i=1;i<k;i++){
                a[i].next=a[i-1];
            }
            if(a[0]==null){
                return newHead;
            }
            a[0]=a[0].next;
            for(i=1;i<k;i++){
                if(a[i-1]==null || a[i-1].next==null){
                    return newHead;
                }
                a[i]=a[i-1].next;
            }  
            temp.next=a[k-1];
        }
        
        return newHead;
    }
}	
