
public class Day6_ques7_RotateList {
	public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        else if(head.next==null){
            return head;
        }
        int length=1,dif;
        ListNode n=head;
        while(n.next!=null){
            n=n.next;
            length++;
        }
        if(k>=length){
            k=k%length;
            if(k==0){
                return head;
            }
        }
        n.next=head;
        n=head;
        dif=length-k;
        while(dif!=1){
            n=n.next;
            dif--;
        }
        head=n.next;
        n.next=null;
        return head;
    }
}
