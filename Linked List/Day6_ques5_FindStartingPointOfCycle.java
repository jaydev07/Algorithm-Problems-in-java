
public class Day6_ques5_FindStartingPointOfCycle {
	public ListNode detectCycle(ListNode head) {
        ListNode fast,slow;
        fast=head;
        slow=head;
        do{
            if(slow==null || fast.next==null || fast.next.next==null){
                return null;
            }
            slow=slow.next;
            fast=fast.next.next;
        }while(slow!=fast);
        fast=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
}
